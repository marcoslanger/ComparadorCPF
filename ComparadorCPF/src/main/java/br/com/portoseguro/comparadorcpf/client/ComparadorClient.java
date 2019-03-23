package br.com.portoseguro.comparadorcpf.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.portoseguro.comparadorcpf.ComparadorCpfApplication;
import br.com.portoseguro.ws.schema.ConsultaDadosBCPWS;
import br.com.portoseguro.ws.schema.ConsultaDadosBCPWS_Service;
import br.com.portoseguro.ws.schema.ObterContratoResponseType;
import br.com.portoseguro.ws.schema.ObterContratoResponseType.Pessoa.Contratos;
import br.com.portoseguro.ws.schema.PortoSeguroFaultInfo;
 
@SpringBootApplication
public class ComparadorClient {
 
    public static void main(String[] args) {
        SpringApplication.run(ComparadorCpfApplication.class, args);
        
        URL wsdlLocation;
		try {
			wsdlLocation = new URL("http://was7corp/bcp-serviceWS/ConsultaDadosBCPWS/WEB-INF/wsdl/ConsultaDadosBCPIntegrationServiceSoap11V2_0.wsdl");
		
			QName serviceName = new QName("http://www.portoseguro.com.br/bi/integration/ConsultaDadosBCPABCS/V2_0/", "ConsultaDadosBCPWS");
			final ConsultaDadosBCPWS_Service proxy = new ConsultaDadosBCPWS_Service(wsdlLocation, serviceName);
			final ConsultaDadosBCPWS servico = proxy.getConsultaDadosBCPWS();			
			List<ObterContratoResponseType.Pessoa> pessoas = servico.obterContrato(new Long(27528309), new Short("0"), new Short("71"), "", new Long(0), new Long(0), "", "", "", null, null);
			ObterContratoResponseType.Pessoa pessoa = pessoas.get(0);
			List<Contratos> contratos = pessoa.getContratos();
			for (Contratos contrato : contratos) {
				System.out.println(contrato.getCodigoSituacaoContrato());
			}
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (PortoSeguroFaultInfo e) {
			e.printStackTrace();
		} 
    }
     
    
    
}