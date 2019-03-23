
package br.com.portoseguro.ws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ObterDadosVeiculoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ObterDadosVeiculoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroCpfouCnpj" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numeroOrdemCnpj" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="digitoCpfouCnpj" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="registroNacionalEstrangeiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObterDadosVeiculoType", propOrder = {
    "numeroCpfouCnpj",
    "numeroOrdemCnpj",
    "digitoCpfouCnpj",
    "registroNacionalEstrangeiro",
    "placa"
})
public class ObterDadosVeiculoType {

    protected Long numeroCpfouCnpj;
    protected Short numeroOrdemCnpj;
    protected Short digitoCpfouCnpj;
    protected String registroNacionalEstrangeiro;
    protected String placa;

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
     * Obtém o valor da propriedade placa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Define o valor da propriedade placa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

}
