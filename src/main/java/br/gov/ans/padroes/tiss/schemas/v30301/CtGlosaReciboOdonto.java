
package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * retorno do recurso de glosa de odonto
 * 
 * <p>Classe Java de ct_glosaReciboOdonto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_glosaReciboOdonto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *         &lt;element name="numeroGuiaRecGlosaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="nomeOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *         &lt;element name="numeroGuiaRecGlosaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="objetoRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_objetoRecurso"/>
 *         &lt;element name="dadosContratado">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codigoPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
 *                   &lt;element name="nomePrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico12"/>
 *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico12"/>
 *         &lt;element name="opcaoRecurso">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="recursoProtocolo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="codigoGlosaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
 *                             &lt;element name="justificativaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *                             &lt;element name="recursoAcatado" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="recursoGuia" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="respostaRecursoGuiaOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_respostaRecursoGuiaOdonto"/>
 *                             &lt;element name="respostaRecursoItemOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_respostaRecursoItemOdonto"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dataRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="valorTotalRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="valorTotalAcatado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_glosaReciboOdonto", propOrder = {
    "registroANS",
    "numeroGuiaRecGlosaPrestador",
    "nomeOperadora",
    "numeroGuiaRecGlosaOperadora",
    "objetoRecurso",
    "dadosContratado",
    "numeroLote",
    "numeroProtocolo",
    "opcaoRecurso",
    "dataRecurso",
    "valorTotalRecursado",
    "valorTotalAcatado"
})
public class CtGlosaReciboOdonto {

    @XmlElement(required = true)
    protected String registroANS;
    @XmlElement(required = true)
    protected String numeroGuiaRecGlosaPrestador;
    @XmlElement(required = true)
    protected String nomeOperadora;
    protected String numeroGuiaRecGlosaOperadora;
    @XmlElement(required = true)
    protected String objetoRecurso;
    @XmlElement(required = true)
    protected CtGlosaReciboOdonto.DadosContratado dadosContratado;
    @XmlElement(required = true)
    protected BigInteger numeroLote;
    @XmlElement(required = true)
    protected BigInteger numeroProtocolo;
    @XmlElement(required = true)
    protected CtGlosaReciboOdonto.OpcaoRecurso opcaoRecurso;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataRecurso;
    @XmlElement(required = true)
    protected BigDecimal valorTotalRecursado;
    @XmlElement(required = true)
    protected BigDecimal valorTotalAcatado;

    /**
     * Obtém o valor da propriedade registroANS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistroANS() {
        return registroANS;
    }

    /**
     * Define o valor da propriedade registroANS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistroANS(String value) {
        this.registroANS = value;
    }

    /**
     * Obtém o valor da propriedade numeroGuiaRecGlosaPrestador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaRecGlosaPrestador() {
        return numeroGuiaRecGlosaPrestador;
    }

    /**
     * Define o valor da propriedade numeroGuiaRecGlosaPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaRecGlosaPrestador(String value) {
        this.numeroGuiaRecGlosaPrestador = value;
    }

    /**
     * Obtém o valor da propriedade nomeOperadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeOperadora() {
        return nomeOperadora;
    }

    /**
     * Define o valor da propriedade nomeOperadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeOperadora(String value) {
        this.nomeOperadora = value;
    }

    /**
     * Obtém o valor da propriedade numeroGuiaRecGlosaOperadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaRecGlosaOperadora() {
        return numeroGuiaRecGlosaOperadora;
    }

    /**
     * Define o valor da propriedade numeroGuiaRecGlosaOperadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaRecGlosaOperadora(String value) {
        this.numeroGuiaRecGlosaOperadora = value;
    }

    /**
     * Obtém o valor da propriedade objetoRecurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjetoRecurso() {
        return objetoRecurso;
    }

    /**
     * Define o valor da propriedade objetoRecurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjetoRecurso(String value) {
        this.objetoRecurso = value;
    }

    /**
     * Obtém o valor da propriedade dadosContratado.
     * 
     * @return
     *     possible object is
     *     {@link CtGlosaReciboOdonto.DadosContratado }
     *     
     */
    public CtGlosaReciboOdonto.DadosContratado getDadosContratado() {
        return dadosContratado;
    }

    /**
     * Define o valor da propriedade dadosContratado.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGlosaReciboOdonto.DadosContratado }
     *     
     */
    public void setDadosContratado(CtGlosaReciboOdonto.DadosContratado value) {
        this.dadosContratado = value;
    }

    /**
     * Obtém o valor da propriedade numeroLote.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroLote() {
        return numeroLote;
    }

    /**
     * Define o valor da propriedade numeroLote.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroLote(BigInteger value) {
        this.numeroLote = value;
    }

    /**
     * Obtém o valor da propriedade numeroProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroProtocolo() {
        return numeroProtocolo;
    }

    /**
     * Define o valor da propriedade numeroProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroProtocolo(BigInteger value) {
        this.numeroProtocolo = value;
    }

    /**
     * Obtém o valor da propriedade opcaoRecurso.
     * 
     * @return
     *     possible object is
     *     {@link CtGlosaReciboOdonto.OpcaoRecurso }
     *     
     */
    public CtGlosaReciboOdonto.OpcaoRecurso getOpcaoRecurso() {
        return opcaoRecurso;
    }

    /**
     * Define o valor da propriedade opcaoRecurso.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGlosaReciboOdonto.OpcaoRecurso }
     *     
     */
    public void setOpcaoRecurso(CtGlosaReciboOdonto.OpcaoRecurso value) {
        this.opcaoRecurso = value;
    }

    /**
     * Obtém o valor da propriedade dataRecurso.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRecurso() {
        return dataRecurso;
    }

    /**
     * Define o valor da propriedade dataRecurso.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRecurso(XMLGregorianCalendar value) {
        this.dataRecurso = value;
    }

    /**
     * Obtém o valor da propriedade valorTotalRecursado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalRecursado() {
        return valorTotalRecursado;
    }

    /**
     * Define o valor da propriedade valorTotalRecursado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalRecursado(BigDecimal value) {
        this.valorTotalRecursado = value;
    }

    /**
     * Obtém o valor da propriedade valorTotalAcatado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalAcatado() {
        return valorTotalAcatado;
    }

    /**
     * Define o valor da propriedade valorTotalAcatado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalAcatado(BigDecimal value) {
        this.valorTotalAcatado = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="codigoPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
     *         &lt;element name="nomePrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
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
        "codigoPrestador",
        "nomePrestador"
    })
    public static class DadosContratado {

        @XmlElement(required = true)
        protected String codigoPrestador;
        @XmlElement(required = true)
        protected String nomePrestador;

        /**
         * Obtém o valor da propriedade codigoPrestador.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoPrestador() {
            return codigoPrestador;
        }

        /**
         * Define o valor da propriedade codigoPrestador.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoPrestador(String value) {
            this.codigoPrestador = value;
        }

        /**
         * Obtém o valor da propriedade nomePrestador.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomePrestador() {
            return nomePrestador;
        }

        /**
         * Define o valor da propriedade nomePrestador.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomePrestador(String value) {
            this.nomePrestador = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="recursoProtocolo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="codigoGlosaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
     *                   &lt;element name="justificativaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
     *                   &lt;element name="recursoAcatado" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="recursoGuia" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="respostaRecursoGuiaOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_respostaRecursoGuiaOdonto"/>
     *                   &lt;element name="respostaRecursoItemOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_respostaRecursoItemOdonto"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "recursoProtocolo",
        "recursoGuia"
    })
    public static class OpcaoRecurso {

        protected CtGlosaReciboOdonto.OpcaoRecurso.RecursoProtocolo recursoProtocolo;
        protected List<CtGlosaReciboOdonto.OpcaoRecurso.RecursoGuia> recursoGuia;

        /**
         * Obtém o valor da propriedade recursoProtocolo.
         * 
         * @return
         *     possible object is
         *     {@link CtGlosaReciboOdonto.OpcaoRecurso.RecursoProtocolo }
         *     
         */
        public CtGlosaReciboOdonto.OpcaoRecurso.RecursoProtocolo getRecursoProtocolo() {
            return recursoProtocolo;
        }

        /**
         * Define o valor da propriedade recursoProtocolo.
         * 
         * @param value
         *     allowed object is
         *     {@link CtGlosaReciboOdonto.OpcaoRecurso.RecursoProtocolo }
         *     
         */
        public void setRecursoProtocolo(CtGlosaReciboOdonto.OpcaoRecurso.RecursoProtocolo value) {
            this.recursoProtocolo = value;
        }

        /**
         * Gets the value of the recursoGuia property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recursoGuia property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecursoGuia().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtGlosaReciboOdonto.OpcaoRecurso.RecursoGuia }
         * 
         * 
         */
        public List<CtGlosaReciboOdonto.OpcaoRecurso.RecursoGuia> getRecursoGuia() {
            if (recursoGuia == null) {
                recursoGuia = new ArrayList<CtGlosaReciboOdonto.OpcaoRecurso.RecursoGuia>();
            }
            return this.recursoGuia;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;choice>
         *         &lt;element name="respostaRecursoGuiaOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_respostaRecursoGuiaOdonto"/>
         *         &lt;element name="respostaRecursoItemOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_respostaRecursoItemOdonto"/>
         *       &lt;/choice>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "respostaRecursoGuiaOdonto",
            "respostaRecursoItemOdonto"
        })
        public static class RecursoGuia {

            protected CtRespostaRecursoGuiaOdonto respostaRecursoGuiaOdonto;
            protected CtRespostaRecursoItemOdonto respostaRecursoItemOdonto;

            /**
             * Obtém o valor da propriedade respostaRecursoGuiaOdonto.
             * 
             * @return
             *     possible object is
             *     {@link CtRespostaRecursoGuiaOdonto }
             *     
             */
            public CtRespostaRecursoGuiaOdonto getRespostaRecursoGuiaOdonto() {
                return respostaRecursoGuiaOdonto;
            }

            /**
             * Define o valor da propriedade respostaRecursoGuiaOdonto.
             * 
             * @param value
             *     allowed object is
             *     {@link CtRespostaRecursoGuiaOdonto }
             *     
             */
            public void setRespostaRecursoGuiaOdonto(CtRespostaRecursoGuiaOdonto value) {
                this.respostaRecursoGuiaOdonto = value;
            }

            /**
             * Obtém o valor da propriedade respostaRecursoItemOdonto.
             * 
             * @return
             *     possible object is
             *     {@link CtRespostaRecursoItemOdonto }
             *     
             */
            public CtRespostaRecursoItemOdonto getRespostaRecursoItemOdonto() {
                return respostaRecursoItemOdonto;
            }

            /**
             * Define o valor da propriedade respostaRecursoItemOdonto.
             * 
             * @param value
             *     allowed object is
             *     {@link CtRespostaRecursoItemOdonto }
             *     
             */
            public void setRespostaRecursoItemOdonto(CtRespostaRecursoItemOdonto value) {
                this.respostaRecursoItemOdonto = value;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="codigoGlosaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
         *         &lt;element name="justificativaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
         *         &lt;element name="recursoAcatado" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
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
            "codigoGlosaProtocolo",
            "justificativaProtocolo",
            "recursoAcatado"
        })
        public static class RecursoProtocolo {

            @XmlElement(required = true)
            protected String codigoGlosaProtocolo;
            @XmlElement(required = true)
            protected String justificativaProtocolo;
            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected DmSimNao recursoAcatado;

            /**
             * Obtém o valor da propriedade codigoGlosaProtocolo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoGlosaProtocolo() {
                return codigoGlosaProtocolo;
            }

            /**
             * Define o valor da propriedade codigoGlosaProtocolo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoGlosaProtocolo(String value) {
                this.codigoGlosaProtocolo = value;
            }

            /**
             * Obtém o valor da propriedade justificativaProtocolo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJustificativaProtocolo() {
                return justificativaProtocolo;
            }

            /**
             * Define o valor da propriedade justificativaProtocolo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJustificativaProtocolo(String value) {
                this.justificativaProtocolo = value;
            }

            /**
             * Obtém o valor da propriedade recursoAcatado.
             * 
             * @return
             *     possible object is
             *     {@link DmSimNao }
             *     
             */
            public DmSimNao getRecursoAcatado() {
                return recursoAcatado;
            }

            /**
             * Define o valor da propriedade recursoAcatado.
             * 
             * @param value
             *     allowed object is
             *     {@link DmSimNao }
             *     
             */
            public void setRecursoAcatado(DmSimNao value) {
                this.recursoAcatado = value;
            }

        }

    }

}
