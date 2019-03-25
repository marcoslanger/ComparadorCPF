package br.com.portoseguro.comparadorcpf.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;

import br.com.portoseguro.comparadorcpf.xls.ExcelWriter;
import br.com.portoseguro.comparadorcpf.xls.Linha;
import br.com.portoseguro.ws.schema.ConsultaDadosBCPWS;
import br.com.portoseguro.ws.schema.ConsultaDadosBCPWS_Service;
import br.com.portoseguro.ws.schema.ObterContratoResponseType;
import br.com.portoseguro.ws.schema.ObterContratoResponseType.Pessoa.Contratos;
import br.com.portoseguro.ws.schema.ObterContratoResponseType.Pessoa.Contratos.ChaveDocumento;
import br.com.portoseguro.ws.schema.PortoSeguroFaultInfo;
 

public class ComparadorClient {	
	 

    public synchronized void lerWebService(List<Linha> linhas) {
    	URL wsdlLocation;                
        
		try {					
			List<Linha> paragravar = new ArrayList<Linha>();
			Iterator<Linha> iterator = linhas.iterator();
			System.out.println("");
			System.out.println("======== CHAMANDO WEBSERVICE PARA CADA CPF ===========");
			System.out.println("");
			
			while(iterator.hasNext()) {
				Linha linha = (Linha)iterator.next();
				wsdlLocation = new URL("http://was7corp/bcp-serviceWS/ConsultaDadosBCPWS/WEB-INF/wsdl/ConsultaDadosBCPIntegrationServiceSoap11V2_0.wsdl");
			
				QName serviceName = new QName("http://www.portoseguro.com.br/bi/integration/ConsultaDadosBCPABCS/V2_0/", "ConsultaDadosBCPWS");
				final ConsultaDadosBCPWS_Service proxy = new ConsultaDadosBCPWS_Service(wsdlLocation, serviceName);
				final ConsultaDadosBCPWS servico = proxy.getConsultaDadosBCPWS();			
				List<ObterContratoResponseType.Pessoa> pessoas = servico.obterContrato(new Long(linha.getCpf()), new Short("0"), new Short(String.valueOf(linha.getDigito())), "", new Long(0), new Long(0), "", "", "", null, null);
				ObterContratoResponseType.Pessoa pessoa = pessoas.get(0);
				List<Contratos> contratos = pessoa.getContratos();
				
				System.out.println("=== DADOS CPF: " + linha.getCpf() + "-" + linha.getDigito()  + " ===");
				
				for (Contratos contrato : contratos) {
					if ("ATIVO".equalsIgnoreCase(contrato.getNomeSituacaoContrato())
							&& contrato.getNomeProdutoBcp().contains("Previdencia")) {
						
							String sucursal = "";
							String ramo = "";
							String apolice = "";
						
							if (contrato.getChaveDocumento() != null && contrato.getChaveDocumento().size() > 0) {
								List<ChaveDocumento> chaves = contrato.getChaveDocumento();								
								ChaveDocumento chave = (ChaveDocumento)chaves.get(0);
								sucursal = chave.getValor();
								chave = (ChaveDocumento)chaves.get(1);
								ramo = chave.getValor();
								chave = (ChaveDocumento)chaves.get(2);
								apolice = chave.getValor();
							}
						
							String retorno = "Susep: " + contrato.getCodigoSusep() 
							+ " Nome Produto: " 
							+ contrato.getNomeProdutoBcp() 
							+ " Situação: " + contrato.getNomeSituacaoContrato() 
							+ " Sucursal: " + sucursal
							+ " Ramo: " + ramo
							+ " Apolice: " + apolice;
							
							System.out.println(retorno);							
							paragravar.add(linha);
					}
				}
				wait(500);
				System.out.println("");
			}
			ExcelWriter.gravarDiferenca(paragravar);
		
		} catch (MalformedURLException e) {
			System.out.println("Ocorreu um erro no acesso ao webservice.");
		} catch (NumberFormatException e) {
			System.out.println("Ocorreu um na formatacao de campos do retorno do webservice.");
		} catch (PortoSeguroFaultInfo e) {
			System.out.println("Ocorreu um erro no acesso ao webservice.");
		} catch (InterruptedException e) {
			System.out.println("Ocorreu um erro durante o timeout.");
		} 
    }
    
}