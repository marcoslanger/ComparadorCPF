//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.03.23 às 06:12:57 PM BRT 
//


package br.com.portoseguro.ws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ObterPapeisPessoasType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ObterPapeisPessoasType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroCpfouCnpj" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="numeroOrdemCnpj" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="digitoCpfouCnpj" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="registroNacionalEstrangeiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroPessoa" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nomePessoa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoPessoa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObterPapeisPessoasType", propOrder = {
    "numeroCpfouCnpj",
    "numeroOrdemCnpj",
    "digitoCpfouCnpj",
    "registroNacionalEstrangeiro",
    "numeroPessoa",
    "nomePessoa",
    "tipoPessoa"
})
public class ObterPapeisPessoasType {

    protected Long numeroCpfouCnpj;
    protected Short numeroOrdemCnpj;
    protected Short digitoCpfouCnpj;
    protected String registroNacionalEstrangeiro;
    protected Long numeroPessoa;
    protected String nomePessoa;
    protected String tipoPessoa;

    /**
     * Obtém o valor da propriedade numeroCpfouCnpj.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumeroCpfouCnpj() {
        return numeroCpfouCnpj;
    }

    /**
     * Define o valor da propriedade numeroCpfouCnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumeroCpfouCnpj(Long value) {
        this.numeroCpfouCnpj = value;
    }

    /**
     * Obtém o valor da propriedade numeroOrdemCnpj.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumeroOrdemCnpj() {
        return numeroOrdemCnpj;
    }

    /**
     * Define o valor da propriedade numeroOrdemCnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumeroOrdemCnpj(Short value) {
        this.numeroOrdemCnpj = value;
    }

    /**
     * Obtém o valor da propriedade digitoCpfouCnpj.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDigitoCpfouCnpj() {
        return digitoCpfouCnpj;
    }

    /**
     * Define o valor da propriedade digitoCpfouCnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDigitoCpfouCnpj(Short value) {
        this.digitoCpfouCnpj = value;
    }

    /**
     * Obtém o valor da propriedade registroNacionalEstrangeiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistroNacionalEstrangeiro() {
        return registroNacionalEstrangeiro;
    }

    /**
     * Define o valor da propriedade registroNacionalEstrangeiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistroNacionalEstrangeiro(String value) {
        this.registroNacionalEstrangeiro = value;
    }

    /**
     * Obtém o valor da propriedade numeroPessoa.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumeroPessoa() {
        return numeroPessoa;
    }

    /**
     * Define o valor da propriedade numeroPessoa.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumeroPessoa(Long value) {
        this.numeroPessoa = value;
    }

    /**
     * Obtém o valor da propriedade nomePessoa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePessoa() {
        return nomePessoa;
    }

    /**
     * Define o valor da propriedade nomePessoa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePessoa(String value) {
        this.nomePessoa = value;
    }

    /**
     * Obtém o valor da propriedade tipoPessoa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPessoa() {
        return tipoPessoa;
    }

    /**
     * Define o valor da propriedade tipoPessoa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPessoa(String value) {
        this.tipoPessoa = value;
    }

}
