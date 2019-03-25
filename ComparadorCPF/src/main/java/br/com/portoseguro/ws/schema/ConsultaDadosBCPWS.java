
package br.com.portoseguro.ws.schema;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ConsultaDadosBCPWS", targetNamespace = "http://www.portoseguro.com.br/bi/integration/ConsultaDadosBCPABCS/V2_0/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConsultaDadosBCPWS {


    /**
     * 
     * @param codigoOrigemProposta
     * @param numeroPessoa
     * @param tipoPessoa
     * @param numeroOrdemCnpj
     * @param numeroContrato
     * @param suseps
     * @param nomePessoa
     * @param filtroContrato
     * @param numeroCpfouCnpj
     * @param digitoCpfouCnpj
     * @param registroNacionalEstrangeiro
     * @return
     *     returns java.util.List<br.com.portoseguro.ws.schema.ObterContratoResponseType.Pessoa>
     * @throws PortoSeguroFaultInfo
     */
    @WebMethod(action = "http://www.portoseguro.com.br/bi/integration/ConsultaDadosBCPABCS/V2_0/obterContrato")
    @WebResult(name = "pessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
    @RequestWrapper(localName = "obterContrato", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/", className = "br.com.portoseguro.ws.schema.ObterContratoType")
    @ResponseWrapper(localName = "obterContratoResponse", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/", className = "br.com.portoseguro.ws.schema.ObterContratoResponseType")
    public List<br.com.portoseguro.ws.schema.ObterContratoResponseType.Pessoa> obterContrato(
        @WebParam(name = "numeroCpfouCnpj", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Long numeroCpfouCnpj,
        @WebParam(name = "numeroOrdemCnpj", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Short numeroOrdemCnpj,
        @WebParam(name = "digitoCpfouCnpj", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Short digitoCpfouCnpj,
        @WebParam(name = "registroNacionalEstrangeiro", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        String registroNacionalEstrangeiro,
        @WebParam(name = "numeroContrato", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Long numeroContrato,
        @WebParam(name = "numeroPessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Long numeroPessoa,
        @WebParam(name = "nomePessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        String nomePessoa,
        @WebParam(name = "tipoPessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        String tipoPessoa,
        @WebParam(name = "codigoOrigemProposta", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        String codigoOrigemProposta,
        @WebParam(name = "filtroContrato", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        List<br.com.portoseguro.ws.schema.ObterContratoType.FiltroContrato> filtroContrato,
        @WebParam(name = "suseps", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        List<br.com.portoseguro.ws.schema.ObterContratoType.Suseps> suseps)
        throws PortoSeguroFaultInfo
    ;

    /**
     * 
     * @param codigoOrigemProposta
     * @param numeroPessoa
     * @param tipoPessoa
     * @param numeroOrdemCnpj
     * @param numeroContrato
     * @param suseps
     * @param nomePessoa
     * @param filtroContrato
     * @param numeroCpfouCnpj
     * @param digitoCpfouCnpj
     * @param registroNacionalEstrangeiro
     * @return
     *     returns java.util.List<br.com.portoseguro.ws.schema.ObterContratoCompletoResponseType.Pessoa>
     * @throws PortoSeguroFaultInfo
     */
    @WebMethod(action = "http://www.portoseguro.com.br/bi/integration/ConsultaDadosBCPABCS/V2_0/obterContratoCompleto")
    @WebResult(name = "pessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
    @RequestWrapper(localName = "obterContratoCompleto", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/", className = "br.com.portoseguro.ws.schema.ObterContratoCompletoType")
    @ResponseWrapper(localName = "obterContratoCompletoResponse", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/", className = "br.com.portoseguro.ws.schema.ObterContratoCompletoResponseType")
    public List<br.com.portoseguro.ws.schema.ObterContratoCompletoResponseType.Pessoa> obterContratoCompleto(
        @WebParam(name = "numeroCpfouCnpj", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Long numeroCpfouCnpj,
        @WebParam(name = "numeroOrdemCnpj", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Short numeroOrdemCnpj,
        @WebParam(name = "digitoCpfouCnpj", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Short digitoCpfouCnpj,
        @WebParam(name = "registroNacionalEstrangeiro", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        String registroNacionalEstrangeiro,
        @WebParam(name = "numeroContrato", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Long numeroContrato,
        @WebParam(name = "numeroPessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Long numeroPessoa,
        @WebParam(name = "nomePessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        String nomePessoa,
        @WebParam(name = "tipoPessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        String tipoPessoa,
        @WebParam(name = "codigoOrigemProposta", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        String codigoOrigemProposta,
        @WebParam(name = "filtroContrato", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        List<br.com.portoseguro.ws.schema.ObterContratoCompletoType.FiltroContrato> filtroContrato,
        @WebParam(name = "suseps", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        List<br.com.portoseguro.ws.schema.ObterContratoCompletoType.Suseps> suseps)
        throws PortoSeguroFaultInfo
    ;

    /**
     * 
     * @param numeroPessoa
     * @param tipoPessoa
     * @param numeroOrdemCnpj
     * @param nomePessoa
     * @param numeroCpfouCnpj
     * @param digitoCpfouCnpj
     * @param registroNacionalEstrangeiro
     * @return
     *     returns java.util.List<br.com.portoseguro.ws.schema.ObterPapeisPessoasResponseType.Pessoa>
     * @throws PortoSeguroFaultInfo
     */
    @WebMethod(action = "http://www.portoseguro.com.br/bi/integration/ConsultaDadosBCPABCS/V2_0/obterPapeisPessoas")
    @WebResult(name = "pessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
    @RequestWrapper(localName = "obterPapeisPessoas", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/", className = "br.com.portoseguro.ws.schema.ObterPapeisPessoasType")
    @ResponseWrapper(localName = "obterPapeisPessoasResponse", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/", className = "br.com.portoseguro.ws.schema.ObterPapeisPessoasResponseType")
    public List<br.com.portoseguro.ws.schema.ObterPapeisPessoasResponseType.Pessoa> obterPapeisPessoas(
        @WebParam(name = "numeroCpfouCnpj", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Long numeroCpfouCnpj,
        @WebParam(name = "numeroOrdemCnpj", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Short numeroOrdemCnpj,
        @WebParam(name = "digitoCpfouCnpj", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Short digitoCpfouCnpj,
        @WebParam(name = "registroNacionalEstrangeiro", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        String registroNacionalEstrangeiro,
        @WebParam(name = "numeroPessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Long numeroPessoa,
        @WebParam(name = "nomePessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        String nomePessoa,
        @WebParam(name = "tipoPessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        String tipoPessoa)
        throws PortoSeguroFaultInfo
    ;

    /**
     * 
     * @param numeroPessoa
     * @param tipoPessoa
     * @param numeroOrdemCnpj
     * @param nomePessoa
     * @param numeroCpfouCnpj
     * @param digitoCpfouCnpj
     * @param registroNacionalEstrangeiro
     * @return
     *     returns java.util.List<br.com.portoseguro.ws.schema.ObterPessoasResponseType.Pessoa>
     * @throws PortoSeguroFaultInfo
     */
    @WebMethod(action = "http://www.portoseguro.com.br/bi/integration/ConsultaDadosBCPABCS/V2_0/obterPessoas")
    @WebResult(name = "pessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
    @RequestWrapper(localName = "obterPessoas", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/", className = "br.com.portoseguro.ws.schema.ObterPessoasType")
    @ResponseWrapper(localName = "obterPessoasResponse", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/", className = "br.com.portoseguro.ws.schema.ObterPessoasResponseType")
    public List<br.com.portoseguro.ws.schema.ObterPessoasResponseType.Pessoa> obterPessoas(
        @WebParam(name = "numeroCpfouCnpj", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Long numeroCpfouCnpj,
        @WebParam(name = "numeroOrdemCnpj", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Short numeroOrdemCnpj,
        @WebParam(name = "digitoCpfouCnpj", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Short digitoCpfouCnpj,
        @WebParam(name = "registroNacionalEstrangeiro", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        String registroNacionalEstrangeiro,
        @WebParam(name = "numeroPessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Long numeroPessoa,
        @WebParam(name = "nomePessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        String nomePessoa,
        @WebParam(name = "tipoPessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        String tipoPessoa)
        throws PortoSeguroFaultInfo
    ;

    /**
     * 
     * @param numeroPessoa
     * @param tipoPessoa
     * @param numeroOrdemCnpj
     * @param nomePessoa
     * @param codigoGrupoAgregacaoPessoa
     * @param numeroCpfouCnpj
     * @param digitoCpfouCnpj
     * @param registroNacionalEstrangeiro
     * @return
     *     returns java.util.List<br.com.portoseguro.ws.schema.ObterPessoasCompletoResponseType.Pessoa>
     * @throws PortoSeguroFaultInfo
     */
    @WebMethod(action = "http://www.portoseguro.com.br/bi/integration/ConsultaDadosBCPABCS/V2_0/obterPessoasCompleto")
    @WebResult(name = "pessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
    @RequestWrapper(localName = "obterPessoasCompleto", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/", className = "br.com.portoseguro.ws.schema.ObterPessoasCompletoType")
    @ResponseWrapper(localName = "obterPessoasCompletoResponse", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/", className = "br.com.portoseguro.ws.schema.ObterPessoasCompletoResponseType")
    public List<br.com.portoseguro.ws.schema.ObterPessoasCompletoResponseType.Pessoa> obterPessoasCompleto(
        @WebParam(name = "numeroCpfouCnpj", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Long numeroCpfouCnpj,
        @WebParam(name = "numeroOrdemCnpj", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Short numeroOrdemCnpj,
        @WebParam(name = "digitoCpfouCnpj", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Short digitoCpfouCnpj,
        @WebParam(name = "registroNacionalEstrangeiro", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        String registroNacionalEstrangeiro,
        @WebParam(name = "numeroPessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Long numeroPessoa,
        @WebParam(name = "nomePessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        String nomePessoa,
        @WebParam(name = "tipoPessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        String tipoPessoa,
        @WebParam(name = "codigoGrupoAgregacaoPessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Long codigoGrupoAgregacaoPessoa)
        throws PortoSeguroFaultInfo
    ;

    /**
     * 
     * @param codigoOrigemProposta
     * @param numeroPessoa
     * @param tipoPessoa
     * @param numeroOrdemCnpj
     * @param numeroContrato
     * @param suseps
     * @param nomePessoa
     * @param filtroContrato
     * @param codigoGrupoAgregacaoPessoa
     * @param numeroCpfouCnpj
     * @param digitoCpfouCnpj
     * @param registroNacionalEstrangeiro
     * @return
     *     returns java.util.List<br.com.portoseguro.ws.schema.ObterPessoasContratosCompletoResponseType.Pessoa>
     * @throws PortoSeguroFaultInfo
     */
    @WebMethod(action = "http://www.portoseguro.com.br/bi/integration/ConsultaDadosBCPABCS/V2_0/obterPessoasContratosCompleto")
    @WebResult(name = "pessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
    @RequestWrapper(localName = "obterPessoasContratosCompleto", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/", className = "br.com.portoseguro.ws.schema.ObterPessoasContratosCompletoType")
    @ResponseWrapper(localName = "obterPessoasContratosCompletoResponse", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/", className = "br.com.portoseguro.ws.schema.ObterPessoasContratosCompletoResponseType")
    public List<br.com.portoseguro.ws.schema.ObterPessoasContratosCompletoResponseType.Pessoa> obterPessoasContratosCompleto(
        @WebParam(name = "numeroCpfouCnpj", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Long numeroCpfouCnpj,
        @WebParam(name = "numeroOrdemCnpj", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Short numeroOrdemCnpj,
        @WebParam(name = "digitoCpfouCnpj", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Short digitoCpfouCnpj,
        @WebParam(name = "registroNacionalEstrangeiro", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        String registroNacionalEstrangeiro,
        @WebParam(name = "numeroContrato", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Long numeroContrato,
        @WebParam(name = "numeroPessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Long numeroPessoa,
        @WebParam(name = "nomePessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        String nomePessoa,
        @WebParam(name = "tipoPessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        String tipoPessoa,
        @WebParam(name = "codigoGrupoAgregacaoPessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Long codigoGrupoAgregacaoPessoa,
        @WebParam(name = "codigoOrigemProposta", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        String codigoOrigemProposta,
        @WebParam(name = "filtroContrato", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        List<br.com.portoseguro.ws.schema.ObterPessoasContratosCompletoType.FiltroContrato> filtroContrato,
        @WebParam(name = "suseps", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        List<br.com.portoseguro.ws.schema.ObterPessoasContratosCompletoType.Suseps> suseps)
        throws PortoSeguroFaultInfo
    ;

    /**
     * 
     * @param numeroCnae
     * @return
     *     returns br.com.portoseguro.ws.schema.ObterDadosCnaeResponseType.DadosCnae
     * @throws PortoSeguroFaultInfo
     */
    @WebMethod(action = "http://www.portoseguro.com.br/bi/integration/ConsultaDadosBCPABCS/V2_0/obterDadosCnae")
    @WebResult(name = "dadosCnae", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
    @RequestWrapper(localName = "obterDadosCnae", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/", className = "br.com.portoseguro.ws.schema.ObterDadosCnaeType")
    @ResponseWrapper(localName = "obterDadosCnaeResponse", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/", className = "br.com.portoseguro.ws.schema.ObterDadosCnaeResponseType")
    public br.com.portoseguro.ws.schema.ObterDadosCnaeResponseType.DadosCnae obterDadosCnae(
        @WebParam(name = "numeroCnae", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        int numeroCnae)
        throws PortoSeguroFaultInfo
    ;

    /**
     * 
     * @param numeroPessoa
     * @return
     *     returns java.util.List<br.com.portoseguro.ws.schema.ObterCorretorResponseType.Corretor>
     * @throws PortoSeguroFaultInfo
     */
    @WebMethod(action = "http://www.portoseguro.com.br/bi/integration/ConsultaDadosBCPABCS/V2_0/obterCorretor")
    @WebResult(name = "corretor", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
    @RequestWrapper(localName = "obterCorretor", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/", className = "br.com.portoseguro.ws.schema.ObterCorretorType")
    @ResponseWrapper(localName = "obterCorretorResponse", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/", className = "br.com.portoseguro.ws.schema.ObterCorretorResponseType")
    public List<br.com.portoseguro.ws.schema.ObterCorretorResponseType.Corretor> obterCorretor(
        @WebParam(name = "numeroPessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        long numeroPessoa)
        throws PortoSeguroFaultInfo
    ;

    /**
     * 
     * @param numeroPessoa
     * @return
     *     returns java.util.List<br.com.portoseguro.ws.schema.ObterFuncionarioPrestadorResponseType.DadosFuncPrest>
     * @throws PortoSeguroFaultInfo
     */
    @WebMethod(action = "http://www.portoseguro.com.br/bi/integration/ConsultaDadosBCPABCS/V2_0/obterFuncionarioPrestador")
    @WebResult(name = "dadosFuncPrest", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
    @RequestWrapper(localName = "obterFuncionarioPrestador", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/", className = "br.com.portoseguro.ws.schema.ObterFuncionarioPrestadorType")
    @ResponseWrapper(localName = "obterFuncionarioPrestadorResponse", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/", className = "br.com.portoseguro.ws.schema.ObterFuncionarioPrestadorResponseType")
    public List<br.com.portoseguro.ws.schema.ObterFuncionarioPrestadorResponseType.DadosFuncPrest> obterFuncionarioPrestador(
        @WebParam(name = "numeroPessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        long numeroPessoa)
        throws PortoSeguroFaultInfo
    ;

    /**
     * 
     * @param numeroPessoa
     * @param numeroOrdemCnpj
     * @param suseps
     * @param filtroContrato
     * @param numeroCpfouCnpj
     * @param digitoCpfouCnpj
     * @param registroNacionalEstrangeiro
     * @return
     *     returns java.util.List<br.com.portoseguro.ws.schema.ObterListaContratosResponseType.Contratos>
     * @throws PortoSeguroFaultInfo
     */
    @WebMethod(action = "http://www.portoseguro.com.br/bi/integration/ConsultaDadosBCPABCS/V2_0/obterListaContratos")
    @WebResult(name = "contratos", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
    @RequestWrapper(localName = "obterListaContratos", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/", className = "br.com.portoseguro.ws.schema.ObterListaContratosType")
    @ResponseWrapper(localName = "obterListaContratosResponse", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/", className = "br.com.portoseguro.ws.schema.ObterListaContratosResponseType")
    public List<br.com.portoseguro.ws.schema.ObterListaContratosResponseType.Contratos> obterListaContratos(
        @WebParam(name = "numeroCpfouCnpj", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Long numeroCpfouCnpj,
        @WebParam(name = "numeroOrdemCnpj", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Short numeroOrdemCnpj,
        @WebParam(name = "digitoCpfouCnpj", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Short digitoCpfouCnpj,
        @WebParam(name = "registroNacionalEstrangeiro", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        String registroNacionalEstrangeiro,
        @WebParam(name = "numeroPessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Long numeroPessoa,
        @WebParam(name = "filtroContrato", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        List<br.com.portoseguro.ws.schema.ObterListaContratosType.FiltroContrato> filtroContrato,
        @WebParam(name = "suseps", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        List<br.com.portoseguro.ws.schema.ObterListaContratosType.Suseps> suseps)
        throws PortoSeguroFaultInfo
    ;

    /**
     * 
     * @param numeroOrdemCnpj
     * @param numeroCpfouCnpj
     * @param digitoCpfouCnpj
     * @param registroNacionalEstrangeiro
     * @param placa
     * @return
     *     returns br.com.portoseguro.ws.schema.ObterDadosVeiculoResponseType.Pessoa
     * @throws PortoSeguroFaultInfo
     */
    @WebMethod(action = "http://www.portoseguro.com.br/bi/integration/ConsultaDadosBCPABCS/V2_0/obterDadosVeiculo")
    @WebResult(name = "pessoa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
    @RequestWrapper(localName = "obterDadosVeiculo", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/", className = "br.com.portoseguro.ws.schema.ObterDadosVeiculoType")
    @ResponseWrapper(localName = "obterDadosVeiculoResponse", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/", className = "br.com.portoseguro.ws.schema.ObterDadosVeiculoResponseType")
    public br.com.portoseguro.ws.schema.ObterDadosVeiculoResponseType.Pessoa obterDadosVeiculo(
        @WebParam(name = "numeroCpfouCnpj", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Long numeroCpfouCnpj,
        @WebParam(name = "numeroOrdemCnpj", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Short numeroOrdemCnpj,
        @WebParam(name = "digitoCpfouCnpj", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        Short digitoCpfouCnpj,
        @WebParam(name = "registroNacionalEstrangeiro", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        String registroNacionalEstrangeiro,
        @WebParam(name = "placa", targetNamespace = "http://www.portoseguro.com.br/bi/integrations/ConsultaDadosBCPEBS/V2_0/")
        String placa)
        throws PortoSeguroFaultInfo
    ;

}