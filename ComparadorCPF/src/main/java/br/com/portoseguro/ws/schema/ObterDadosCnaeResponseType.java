//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.03.23 às 06:12:57 PM BRT 
//


package br.com.portoseguro.ws.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ObterDadosCnaeResponseType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ObterDadosCnaeResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dadosCnae" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="codigoClasseCnae" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *                   &lt;element name="codigoDivisaoCnae" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *                   &lt;element name="codigoGrupoCnae" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *                   &lt;element name="codigoSecaoCnae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="codigoSituacaoRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="codigoSubclasseCnae" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *                   &lt;element name="dataAtualizacaoRegistro" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                   &lt;element name="nomeAtividadeCnae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="numeroCnae" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="numeroVersaoCnae" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObterDadosCnaeResponseType", propOrder = {
    "dadosCnae"
})
public class ObterDadosCnaeResponseType {

    protected ObterDadosCnaeResponseType.DadosCnae dadosCnae;

    /**
     * Obtém o valor da propriedade dadosCnae.
     * 
     * @return
     *     possible object is
     *     {@link ObterDadosCnaeResponseType.DadosCnae }
     *     
     */
    public ObterDadosCnaeResponseType.DadosCnae getDadosCnae() {
        return dadosCnae;
    }

    /**
     * Define o valor da propriedade dadosCnae.
     * 
     * @param value
     *     allowed object is
     *     {@link ObterDadosCnaeResponseType.DadosCnae }
     *     
     */
    public void setDadosCnae(ObterDadosCnaeResponseType.DadosCnae value) {
        this.dadosCnae = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="codigoClasseCnae" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
     *         &lt;element name="codigoDivisaoCnae" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
     *         &lt;element name="codigoGrupoCnae" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
     *         &lt;element name="codigoSecaoCnae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="codigoSituacaoRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="codigoSubclasseCnae" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
     *         &lt;element name="dataAtualizacaoRegistro" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *         &lt;element name="nomeAtividadeCnae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="numeroCnae" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="numeroVersaoCnae" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codigoClasseCnae",
        "codigoDivisaoCnae",
        "codigoGrupoCnae",
        "codigoSecaoCnae",
        "codigoSituacaoRegistro",
        "codigoSubclasseCnae",
        "dataAtualizacaoRegistro",
        "nomeAtividadeCnae",
        "numeroCnae",
        "numeroVersaoCnae"
    })
    public static class DadosCnae {

        protected Short codigoClasseCnae;
        protected Short codigoDivisaoCnae;
        protected Short codigoGrupoCnae;
        protected String codigoSecaoCnae;
        protected String codigoSituacaoRegistro;
        protected Short codigoSubclasseCnae;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dataAtualizacaoRegistro;
        protected String nomeAtividadeCnae;
        protected Integer numeroCnae;
        protected BigDecimal numeroVersaoCnae;

        /**
         * Obtém o valor da propriedade codigoClasseCnae.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getCodigoClasseCnae() {
            return codigoClasseCnae;
        }

        /**
         * Define o valor da propriedade codigoClasseCnae.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setCodigoClasseCnae(Short value) {
            this.codigoClasseCnae = value;
        }

        /**
         * Obtém o valor da propriedade codigoDivisaoCnae.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getCodigoDivisaoCnae() {
            return codigoDivisaoCnae;
        }

        /**
         * Define o valor da propriedade codigoDivisaoCnae.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setCodigoDivisaoCnae(Short value) {
            this.codigoDivisaoCnae = value;
        }

        /**
         * Obtém o valor da propriedade codigoGrupoCnae.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getCodigoGrupoCnae() {
            return codigoGrupoCnae;
        }

        /**
         * Define o valor da propriedade codigoGrupoCnae.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setCodigoGrupoCnae(Short value) {
            this.codigoGrupoCnae = value;
        }

        /**
         * Obtém o valor da propriedade codigoSecaoCnae.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoSecaoCnae() {
            return codigoSecaoCnae;
        }

        /**
         * Define o valor da propriedade codigoSecaoCnae.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoSecaoCnae(String value) {
            this.codigoSecaoCnae = value;
        }

        /**
         * Obtém o valor da propriedade codigoSituacaoRegistro.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoSituacaoRegistro() {
            return codigoSituacaoRegistro;
        }

        /**
         * Define o valor da propriedade codigoSituacaoRegistro.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoSituacaoRegistro(String value) {
            this.codigoSituacaoRegistro = value;
        }

        /**
         * Obtém o valor da propriedade codigoSubclasseCnae.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getCodigoSubclasseCnae() {
            return codigoSubclasseCnae;
        }

        /**
         * Define o valor da propriedade codigoSubclasseCnae.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setCodigoSubclasseCnae(Short value) {
            this.codigoSubclasseCnae = value;
        }

        /**
         * Obtém o valor da propriedade dataAtualizacaoRegistro.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataAtualizacaoRegistro() {
            return dataAtualizacaoRegistro;
        }

        /**
         * Define o valor da propriedade dataAtualizacaoRegistro.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataAtualizacaoRegistro(XMLGregorianCalendar value) {
            this.dataAtualizacaoRegistro = value;
        }

        /**
         * Obtém o valor da propriedade nomeAtividadeCnae.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomeAtividadeCnae() {
            return nomeAtividadeCnae;
        }

        /**
         * Define o valor da propriedade nomeAtividadeCnae.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomeAtividadeCnae(String value) {
            this.nomeAtividadeCnae = value;
        }

        /**
         * Obtém o valor da propriedade numeroCnae.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getNumeroCnae() {
            return numeroCnae;
        }

        /**
         * Define o valor da propriedade numeroCnae.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setNumeroCnae(Integer value) {
            this.numeroCnae = value;
        }

        /**
         * Obtém o valor da propriedade numeroVersaoCnae.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNumeroVersaoCnae() {
            return numeroVersaoCnae;
        }

        /**
         * Define o valor da propriedade numeroVersaoCnae.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNumeroVersaoCnae(BigDecimal value) {
            this.numeroVersaoCnae = value;
        }

    }

}
