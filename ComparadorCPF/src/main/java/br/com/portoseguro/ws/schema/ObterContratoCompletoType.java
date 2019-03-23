
package br.com.portoseguro.ws.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ObterContratoCompletoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ObterContratoCompletoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroCpfouCnpj" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numeroOrdemCnpj" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="digitoCpfouCnpj" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="registroNacionalEstrangeiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroContrato" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numeroPessoa" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nomePessoa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoPessoa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoOrigemProposta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filtroContrato" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="chaveDocumento" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="chave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="produto" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="codigoProdutoOrigem" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *                             &lt;element name="listaProduto" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="codigoProduto" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *                                       &lt;element name="listaSegmento" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="codigoSegmento" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="codigoSituacaoDocumento" type="{http://www.w3.org/2001/XMLSchema}short" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="diaVigenciaFinal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="diaVigenciaInicial" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="numeroClienteSistemaOrigem" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="numeroContratoSistemaOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="periodoDataEmissao" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="inicioDataEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="finalDataEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="chassi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="suseps" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codigoSusep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObterContratoCompletoType", propOrder = {
    "numeroCpfouCnpj",
    "numeroOrdemCnpj",
    "digitoCpfouCnpj",
    "registroNacionalEstrangeiro",
    "numeroContrato",
    "numeroPessoa",
    "nomePessoa",
    "tipoPessoa",
    "codigoOrigemProposta",
    "filtroContrato",
    "suseps"
})
public class ObterContratoCompletoType {

    protected Long numeroCpfouCnpj;
    protected Short numeroOrdemCnpj;
    protected Short digitoCpfouCnpj;
    protected String registroNacionalEstrangeiro;
    protected Long numeroContrato;
    protected Long numeroPessoa;
    protected String nomePessoa;
    protected String tipoPessoa;
    protected String codigoOrigemProposta;
    protected List<ObterContratoCompletoType.FiltroContrato> filtroContrato;
    protected List<ObterContratoCompletoType.Suseps> suseps;

    /**
     * Obt�m o valor da propriedade numeroCpfouCnpj.
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
     * Obt�m o valor da propriedade numeroOrdemCnpj.
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
     * Obt�m o valor da propriedade digitoCpfouCnpj.
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
     * Obt�m o valor da propriedade registroNacionalEstrangeiro.
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
     * Obt�m o valor da propriedade numeroContrato.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumeroContrato() {
        return numeroContrato;
    }

    /**
     * Define o valor da propriedade numeroContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumeroContrato(Long value) {
        this.numeroContrato = value;
    }

    /**
     * Obt�m o valor da propriedade numeroPessoa.
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
     * Obt�m o valor da propriedade nomePessoa.
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
     * Obt�m o valor da propriedade tipoPessoa.
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

    /**
     * Obt�m o valor da propriedade codigoOrigemProposta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoOrigemProposta() {
        return codigoOrigemProposta;
    }

    /**
     * Define o valor da propriedade codigoOrigemProposta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoOrigemProposta(String value) {
        this.codigoOrigemProposta = value;
    }

    /**
     * Gets the value of the filtroContrato property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filtroContrato property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFiltroContrato().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObterContratoCompletoType.FiltroContrato }
     * 
     * 
     */
    public List<ObterContratoCompletoType.FiltroContrato> getFiltroContrato() {
        if (filtroContrato == null) {
            filtroContrato = new ArrayList<ObterContratoCompletoType.FiltroContrato>();
        }
        return this.filtroContrato;
    }

    /**
     * Gets the value of the suseps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suseps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuseps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObterContratoCompletoType.Suseps }
     * 
     * 
     */
    public List<ObterContratoCompletoType.Suseps> getSuseps() {
        if (suseps == null) {
            suseps = new ArrayList<ObterContratoCompletoType.Suseps>();
        }
        return this.suseps;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="chaveDocumento" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="chave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="produto" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="codigoProdutoOrigem" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
     *                   &lt;element name="listaProduto" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="codigoProduto" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
     *                             &lt;element name="listaSegmento" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="codigoSegmento" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="codigoSituacaoDocumento" type="{http://www.w3.org/2001/XMLSchema}short" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="diaVigenciaFinal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="diaVigenciaInicial" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="numeroClienteSistemaOrigem" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="numeroContratoSistemaOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="periodoDataEmissao" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="inicioDataEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="finalDataEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="chassi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "chaveDocumento",
        "produto",
        "codigoSituacaoDocumento",
        "diaVigenciaFinal",
        "diaVigenciaInicial",
        "numeroClienteSistemaOrigem",
        "numeroContratoSistemaOrigem",
        "periodoDataEmissao",
        "chassi",
        "placa"
    })
    public static class FiltroContrato {

        protected List<ObterContratoCompletoType.FiltroContrato.ChaveDocumento> chaveDocumento;
        protected ObterContratoCompletoType.FiltroContrato.Produto produto;
        @XmlElement(type = Short.class)
        protected List<Short> codigoSituacaoDocumento;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar diaVigenciaFinal;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar diaVigenciaInicial;
        protected Long numeroClienteSistemaOrigem;
        protected String numeroContratoSistemaOrigem;
        protected List<ObterContratoCompletoType.FiltroContrato.PeriodoDataEmissao> periodoDataEmissao;
        protected String chassi;
        protected String placa;

        /**
         * Gets the value of the chaveDocumento property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the chaveDocumento property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChaveDocumento().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ObterContratoCompletoType.FiltroContrato.ChaveDocumento }
         * 
         * 
         */
        public List<ObterContratoCompletoType.FiltroContrato.ChaveDocumento> getChaveDocumento() {
            if (chaveDocumento == null) {
                chaveDocumento = new ArrayList<ObterContratoCompletoType.FiltroContrato.ChaveDocumento>();
            }
            return this.chaveDocumento;
        }

        /**
         * Obt�m o valor da propriedade produto.
         * 
         * @return
         *     possible object is
         *     {@link ObterContratoCompletoType.FiltroContrato.Produto }
         *     
         */
        public ObterContratoCompletoType.FiltroContrato.Produto getProduto() {
            return produto;
        }

        /**
         * Define o valor da propriedade produto.
         * 
         * @param value
         *     allowed object is
         *     {@link ObterContratoCompletoType.FiltroContrato.Produto }
         *     
         */
        public void setProduto(ObterContratoCompletoType.FiltroContrato.Produto value) {
            this.produto = value;
        }

        /**
         * Gets the value of the codigoSituacaoDocumento property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the codigoSituacaoDocumento property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCodigoSituacaoDocumento().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Short }
         * 
         * 
         */
        public List<Short> getCodigoSituacaoDocumento() {
            if (codigoSituacaoDocumento == null) {
                codigoSituacaoDocumento = new ArrayList<Short>();
            }
            return this.codigoSituacaoDocumento;
        }

        /**
         * Obt�m o valor da propriedade diaVigenciaFinal.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDiaVigenciaFinal() {
            return diaVigenciaFinal;
        }

        /**
         * Define o valor da propriedade diaVigenciaFinal.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDiaVigenciaFinal(XMLGregorianCalendar value) {
            this.diaVigenciaFinal = value;
        }

        /**
         * Obt�m o valor da propriedade diaVigenciaInicial.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDiaVigenciaInicial() {
            return diaVigenciaInicial;
        }

        /**
         * Define o valor da propriedade diaVigenciaInicial.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDiaVigenciaInicial(XMLGregorianCalendar value) {
            this.diaVigenciaInicial = value;
        }

        /**
         * Obt�m o valor da propriedade numeroClienteSistemaOrigem.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getNumeroClienteSistemaOrigem() {
            return numeroClienteSistemaOrigem;
        }

        /**
         * Define o valor da propriedade numeroClienteSistemaOrigem.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setNumeroClienteSistemaOrigem(Long value) {
            this.numeroClienteSistemaOrigem = value;
        }

        /**
         * Obt�m o valor da propriedade numeroContratoSistemaOrigem.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroContratoSistemaOrigem() {
            return numeroContratoSistemaOrigem;
        }

        /**
         * Define o valor da propriedade numeroContratoSistemaOrigem.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroContratoSistemaOrigem(String value) {
            this.numeroContratoSistemaOrigem = value;
        }

        /**
         * Gets the value of the periodoDataEmissao property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the periodoDataEmissao property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPeriodoDataEmissao().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ObterContratoCompletoType.FiltroContrato.PeriodoDataEmissao }
         * 
         * 
         */
        public List<ObterContratoCompletoType.FiltroContrato.PeriodoDataEmissao> getPeriodoDataEmissao() {
            if (periodoDataEmissao == null) {
                periodoDataEmissao = new ArrayList<ObterContratoCompletoType.FiltroContrato.PeriodoDataEmissao>();
            }
            return this.periodoDataEmissao;
        }

        /**
         * Obt�m o valor da propriedade chassi.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChassi() {
            return chassi;
        }

        /**
         * Define o valor da propriedade chassi.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChassi(String value) {
            this.chassi = value;
        }

        /**
         * Obt�m o valor da propriedade placa.
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


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="chave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "chave",
            "valor"
        })
        public static class ChaveDocumento {

            protected String chave;
            protected String valor;

            /**
             * Obt�m o valor da propriedade chave.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChave() {
                return chave;
            }

            /**
             * Define o valor da propriedade chave.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChave(String value) {
                this.chave = value;
            }

            /**
             * Obt�m o valor da propriedade valor.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValor() {
                return valor;
            }

            /**
             * Define o valor da propriedade valor.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValor(String value) {
                this.valor = value;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="inicioDataEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="finalDataEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "inicioDataEmissao",
            "finalDataEmissao"
        })
        public static class PeriodoDataEmissao {

            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar inicioDataEmissao;
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar finalDataEmissao;

            /**
             * Obt�m o valor da propriedade inicioDataEmissao.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getInicioDataEmissao() {
                return inicioDataEmissao;
            }

            /**
             * Define o valor da propriedade inicioDataEmissao.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setInicioDataEmissao(XMLGregorianCalendar value) {
                this.inicioDataEmissao = value;
            }

            /**
             * Obt�m o valor da propriedade finalDataEmissao.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFinalDataEmissao() {
                return finalDataEmissao;
            }

            /**
             * Define o valor da propriedade finalDataEmissao.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFinalDataEmissao(XMLGregorianCalendar value) {
                this.finalDataEmissao = value;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="codigoProdutoOrigem" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
         *         &lt;element name="listaProduto" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="codigoProduto" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
         *                   &lt;element name="listaSegmento" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="codigoSegmento" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "codigoProdutoOrigem",
            "listaProduto"
        })
        public static class Produto {

            protected Short codigoProdutoOrigem;
            protected List<ObterContratoCompletoType.FiltroContrato.Produto.ListaProduto> listaProduto;

            /**
             * Obt�m o valor da propriedade codigoProdutoOrigem.
             * 
             * @return
             *     possible object is
             *     {@link Short }
             *     
             */
            public Short getCodigoProdutoOrigem() {
                return codigoProdutoOrigem;
            }

            /**
             * Define o valor da propriedade codigoProdutoOrigem.
             * 
             * @param value
             *     allowed object is
             *     {@link Short }
             *     
             */
            public void setCodigoProdutoOrigem(Short value) {
                this.codigoProdutoOrigem = value;
            }

            /**
             * Gets the value of the listaProduto property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listaProduto property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getListaProduto().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ObterContratoCompletoType.FiltroContrato.Produto.ListaProduto }
             * 
             * 
             */
            public List<ObterContratoCompletoType.FiltroContrato.Produto.ListaProduto> getListaProduto() {
                if (listaProduto == null) {
                    listaProduto = new ArrayList<ObterContratoCompletoType.FiltroContrato.Produto.ListaProduto>();
                }
                return this.listaProduto;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="codigoProduto" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
             *         &lt;element name="listaSegmento" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="codigoSegmento" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "codigoProduto",
                "listaSegmento"
            })
            public static class ListaProduto {

                protected Short codigoProduto;
                protected List<ObterContratoCompletoType.FiltroContrato.Produto.ListaProduto.ListaSegmento> listaSegmento;

                /**
                 * Obt�m o valor da propriedade codigoProduto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Short }
                 *     
                 */
                public Short getCodigoProduto() {
                    return codigoProduto;
                }

                /**
                 * Define o valor da propriedade codigoProduto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Short }
                 *     
                 */
                public void setCodigoProduto(Short value) {
                    this.codigoProduto = value;
                }

                /**
                 * Gets the value of the listaSegmento property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listaSegmento property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getListaSegmento().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ObterContratoCompletoType.FiltroContrato.Produto.ListaProduto.ListaSegmento }
                 * 
                 * 
                 */
                public List<ObterContratoCompletoType.FiltroContrato.Produto.ListaProduto.ListaSegmento> getListaSegmento() {
                    if (listaSegmento == null) {
                        listaSegmento = new ArrayList<ObterContratoCompletoType.FiltroContrato.Produto.ListaProduto.ListaSegmento>();
                    }
                    return this.listaSegmento;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="codigoSegmento" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "codigoSegmento"
                })
                public static class ListaSegmento {

                    protected Short codigoSegmento;

                    /**
                     * Obt�m o valor da propriedade codigoSegmento.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Short }
                     *     
                     */
                    public Short getCodigoSegmento() {
                        return codigoSegmento;
                    }

                    /**
                     * Define o valor da propriedade codigoSegmento.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Short }
                     *     
                     */
                    public void setCodigoSegmento(Short value) {
                        this.codigoSegmento = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="codigoSusep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codigoSusep"
    })
    public static class Suseps {

        protected String codigoSusep;

        /**
         * Obt�m o valor da propriedade codigoSusep.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoSusep() {
            return codigoSusep;
        }

        /**
         * Define o valor da propriedade codigoSusep.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoSusep(String value) {
            this.codigoSusep = value;
        }

    }

}
