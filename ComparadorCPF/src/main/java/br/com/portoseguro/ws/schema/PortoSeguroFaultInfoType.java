//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.03.23 às 05:54:05 PM BRT 
//


package br.com.portoseguro.ws.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Elemento usado para encapsular informações de falhas na execucao de servicos.
 * 
 * 
 * <p>Classe Java de PortoSeguroFaultInfoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PortoSeguroFaultInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="mensagem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataOcorrencia" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="fonte" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="NEGOCIO"/&gt;
 *               &lt;enumeration value="SISTEMA"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="additionalInfo" type="{http://www.portoseguro.com.br/ebo/Common/V1_0}ExtensionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortoSeguroFaultInfoType", namespace = "http://www.portoseguro.com.br/foundation/PortoSeguroMessage", propOrder = {
    "codigo",
    "mensagem",
    "dataOcorrencia",
    "fonte",
    "tipo",
    "additionalInfo"
})
public class PortoSeguroFaultInfoType {

    @XmlElement(required = true)
    protected BigInteger codigo;
    @XmlElement(required = true)
    protected String mensagem;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataOcorrencia;
    @XmlElement(required = true)
    protected String fonte;
    @XmlElement(required = true)
    protected String tipo;
    @XmlElement(required = true)
    protected ExtensionType additionalInfo;

    /**
     * Obtém o valor da propriedade codigo.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigo(BigInteger value) {
        this.codigo = value;
    }

    /**
     * Obtém o valor da propriedade mensagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * Define o valor da propriedade mensagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagem(String value) {
        this.mensagem = value;
    }

    /**
     * Obtém o valor da propriedade dataOcorrencia.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataOcorrencia() {
        return dataOcorrencia;
    }

    /**
     * Define o valor da propriedade dataOcorrencia.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataOcorrencia(XMLGregorianCalendar value) {
        this.dataOcorrencia = value;
    }

    /**
     * Obtém o valor da propriedade fonte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFonte() {
        return fonte;
    }

    /**
     * Define o valor da propriedade fonte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFonte(String value) {
        this.fonte = value;
    }

    /**
     * Obtém o valor da propriedade tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtém o valor da propriedade additionalInfo.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Define o valor da propriedade additionalInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAdditionalInfo(ExtensionType value) {
        this.additionalInfo = value;
    }

}
