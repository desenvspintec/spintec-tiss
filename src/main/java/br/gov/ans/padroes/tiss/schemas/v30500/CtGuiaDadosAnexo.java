
package br.gov.ans.padroes.tiss.schemas.v30500;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_guiaDadosAnexo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_guiaDadosAnexo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiarioDados"/>
 *         &lt;element name="dataEmissao_SolicitacaoAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="vlInformadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_valorTotal"/>
 *         &lt;element name="glosaAnexo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
 *                   &lt;element name="vlGlosaAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="procedimentosSolicitados" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="procedimentoSolicitado" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *                             &lt;element name="opcaoFabricante" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_opcaoFabricante" minOccurs="0"/>
 *                             &lt;element name="qtdSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal5-2"/>
 *                             &lt;element name="valorSolicitado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
 *                             &lt;element name="qtdAutorizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal5-2"/>
 *                             &lt;element name="valorAutorizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                             &lt;element name="glosasProcedimento">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
 *                                       &lt;element name="valorGlosaProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_guiaDadosAnexo", propOrder = {
    "numeroGuiaPrestador",
    "numeroGuiaOperadora",
    "dadosBeneficiario",
    "dataEmissaoSolicitacaoAnexo",
    "vlInformadoGuia",
    "glosaAnexo",
    "procedimentosSolicitados"
})
public class CtGuiaDadosAnexo {

    @XmlElement(required = true)
    protected String numeroGuiaPrestador;
    protected String numeroGuiaOperadora;
    @XmlElement(required = true)
    protected CtBeneficiarioDados dadosBeneficiario;
    @XmlElement(name = "dataEmissao_SolicitacaoAnexo", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataEmissaoSolicitacaoAnexo;
    @XmlElement(required = true)
    protected CtValorTotal vlInformadoGuia;
    protected CtGuiaDadosAnexo.GlosaAnexo glosaAnexo;
    protected CtGuiaDadosAnexo.ProcedimentosSolicitados procedimentosSolicitados;

    /**
     * Obt�m o valor da propriedade numeroGuiaPrestador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaPrestador() {
        return numeroGuiaPrestador;
    }

    /**
     * Define o valor da propriedade numeroGuiaPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaPrestador(String value) {
        this.numeroGuiaPrestador = value;
    }

    /**
     * Obt�m o valor da propriedade numeroGuiaOperadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaOperadora() {
        return numeroGuiaOperadora;
    }

    /**
     * Define o valor da propriedade numeroGuiaOperadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaOperadora(String value) {
        this.numeroGuiaOperadora = value;
    }

    /**
     * Obt�m o valor da propriedade dadosBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link CtBeneficiarioDados }
     *     
     */
    public CtBeneficiarioDados getDadosBeneficiario() {
        return dadosBeneficiario;
    }

    /**
     * Define o valor da propriedade dadosBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link CtBeneficiarioDados }
     *     
     */
    public void setDadosBeneficiario(CtBeneficiarioDados value) {
        this.dadosBeneficiario = value;
    }

    /**
     * Obt�m o valor da propriedade dataEmissaoSolicitacaoAnexo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissaoSolicitacaoAnexo() {
        return dataEmissaoSolicitacaoAnexo;
    }

    /**
     * Define o valor da propriedade dataEmissaoSolicitacaoAnexo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissaoSolicitacaoAnexo(XMLGregorianCalendar value) {
        this.dataEmissaoSolicitacaoAnexo = value;
    }

    /**
     * Obt�m o valor da propriedade vlInformadoGuia.
     * 
     * @return
     *     possible object is
     *     {@link CtValorTotal }
     *     
     */
    public CtValorTotal getVlInformadoGuia() {
        return vlInformadoGuia;
    }

    /**
     * Define o valor da propriedade vlInformadoGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link CtValorTotal }
     *     
     */
    public void setVlInformadoGuia(CtValorTotal value) {
        this.vlInformadoGuia = value;
    }

    /**
     * Obt�m o valor da propriedade glosaAnexo.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaDadosAnexo.GlosaAnexo }
     *     
     */
    public CtGuiaDadosAnexo.GlosaAnexo getGlosaAnexo() {
        return glosaAnexo;
    }

    /**
     * Define o valor da propriedade glosaAnexo.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaDadosAnexo.GlosaAnexo }
     *     
     */
    public void setGlosaAnexo(CtGuiaDadosAnexo.GlosaAnexo value) {
        this.glosaAnexo = value;
    }

    /**
     * Obt�m o valor da propriedade procedimentosSolicitados.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaDadosAnexo.ProcedimentosSolicitados }
     *     
     */
    public CtGuiaDadosAnexo.ProcedimentosSolicitados getProcedimentosSolicitados() {
        return procedimentosSolicitados;
    }

    /**
     * Define o valor da propriedade procedimentosSolicitados.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaDadosAnexo.ProcedimentosSolicitados }
     *     
     */
    public void setProcedimentosSolicitados(CtGuiaDadosAnexo.ProcedimentosSolicitados value) {
        this.procedimentosSolicitados = value;
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
     *         &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
     *         &lt;element name="vlGlosaAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
        "motivoGlosa",
        "vlGlosaAnexo"
    })
    public static class GlosaAnexo {

        @XmlElement(required = true)
        protected List<CtMotivoGlosa> motivoGlosa;
        @XmlElement(required = true)
        protected BigDecimal vlGlosaAnexo;

        /**
         * Gets the value of the motivoGlosa property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the motivoGlosa property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMotivoGlosa().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtMotivoGlosa }
         * 
         * 
         */
        public List<CtMotivoGlosa> getMotivoGlosa() {
            if (motivoGlosa == null) {
                motivoGlosa = new ArrayList<CtMotivoGlosa>();
            }
            return this.motivoGlosa;
        }

        /**
         * Obt�m o valor da propriedade vlGlosaAnexo.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVlGlosaAnexo() {
            return vlGlosaAnexo;
        }

        /**
         * Define o valor da propriedade vlGlosaAnexo.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVlGlosaAnexo(BigDecimal value) {
            this.vlGlosaAnexo = value;
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
     *         &lt;element name="procedimentoSolicitado" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
     *                   &lt;element name="opcaoFabricante" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_opcaoFabricante" minOccurs="0"/>
     *                   &lt;element name="qtdSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal5-2"/>
     *                   &lt;element name="valorSolicitado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
     *                   &lt;element name="qtdAutorizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal5-2"/>
     *                   &lt;element name="valorAutorizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *                   &lt;element name="glosasProcedimento">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
     *                             &lt;element name="valorGlosaProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
        "procedimentoSolicitado"
    })
    public static class ProcedimentosSolicitados {

        @XmlElement(required = true)
        protected List<CtGuiaDadosAnexo.ProcedimentosSolicitados.ProcedimentoSolicitado> procedimentoSolicitado;

        /**
         * Gets the value of the procedimentoSolicitado property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the procedimentoSolicitado property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProcedimentoSolicitado().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtGuiaDadosAnexo.ProcedimentosSolicitados.ProcedimentoSolicitado }
         * 
         * 
         */
        public List<CtGuiaDadosAnexo.ProcedimentosSolicitados.ProcedimentoSolicitado> getProcedimentoSolicitado() {
            if (procedimentoSolicitado == null) {
                procedimentoSolicitado = new ArrayList<CtGuiaDadosAnexo.ProcedimentosSolicitados.ProcedimentoSolicitado>();
            }
            return this.procedimentoSolicitado;
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
         *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
         *         &lt;element name="opcaoFabricante" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_opcaoFabricante" minOccurs="0"/>
         *         &lt;element name="qtdSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal5-2"/>
         *         &lt;element name="valorSolicitado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
         *         &lt;element name="qtdAutorizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal5-2"/>
         *         &lt;element name="valorAutorizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
         *         &lt;element name="glosasProcedimento">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
         *                   &lt;element name="valorGlosaProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
            "procedimento",
            "opcaoFabricante",
            "qtdSolicitada",
            "valorSolicitado",
            "qtdAutorizada",
            "valorAutorizado",
            "glosasProcedimento"
        })
        public static class ProcedimentoSolicitado {

            @XmlElement(required = true)
            protected CtProcedimentoDados procedimento;
            protected String opcaoFabricante;
            @XmlElement(required = true)
            protected BigDecimal qtdSolicitada;
            protected BigDecimal valorSolicitado;
            @XmlElement(required = true)
            protected BigDecimal qtdAutorizada;
            @XmlElement(required = true)
            protected BigDecimal valorAutorizado;
            @XmlElement(required = true)
            protected CtGuiaDadosAnexo.ProcedimentosSolicitados.ProcedimentoSolicitado.GlosasProcedimento glosasProcedimento;

            /**
             * Obt�m o valor da propriedade procedimento.
             * 
             * @return
             *     possible object is
             *     {@link CtProcedimentoDados }
             *     
             */
            public CtProcedimentoDados getProcedimento() {
                return procedimento;
            }

            /**
             * Define o valor da propriedade procedimento.
             * 
             * @param value
             *     allowed object is
             *     {@link CtProcedimentoDados }
             *     
             */
            public void setProcedimento(CtProcedimentoDados value) {
                this.procedimento = value;
            }

            /**
             * Obt�m o valor da propriedade opcaoFabricante.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOpcaoFabricante() {
                return opcaoFabricante;
            }

            /**
             * Define o valor da propriedade opcaoFabricante.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOpcaoFabricante(String value) {
                this.opcaoFabricante = value;
            }

            /**
             * Obt�m o valor da propriedade qtdSolicitada.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getQtdSolicitada() {
                return qtdSolicitada;
            }

            /**
             * Define o valor da propriedade qtdSolicitada.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setQtdSolicitada(BigDecimal value) {
                this.qtdSolicitada = value;
            }

            /**
             * Obt�m o valor da propriedade valorSolicitado.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorSolicitado() {
                return valorSolicitado;
            }

            /**
             * Define o valor da propriedade valorSolicitado.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorSolicitado(BigDecimal value) {
                this.valorSolicitado = value;
            }

            /**
             * Obt�m o valor da propriedade qtdAutorizada.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getQtdAutorizada() {
                return qtdAutorizada;
            }

            /**
             * Define o valor da propriedade qtdAutorizada.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setQtdAutorizada(BigDecimal value) {
                this.qtdAutorizada = value;
            }

            /**
             * Obt�m o valor da propriedade valorAutorizado.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorAutorizado() {
                return valorAutorizado;
            }

            /**
             * Define o valor da propriedade valorAutorizado.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorAutorizado(BigDecimal value) {
                this.valorAutorizado = value;
            }

            /**
             * Obt�m o valor da propriedade glosasProcedimento.
             * 
             * @return
             *     possible object is
             *     {@link CtGuiaDadosAnexo.ProcedimentosSolicitados.ProcedimentoSolicitado.GlosasProcedimento }
             *     
             */
            public CtGuiaDadosAnexo.ProcedimentosSolicitados.ProcedimentoSolicitado.GlosasProcedimento getGlosasProcedimento() {
                return glosasProcedimento;
            }

            /**
             * Define o valor da propriedade glosasProcedimento.
             * 
             * @param value
             *     allowed object is
             *     {@link CtGuiaDadosAnexo.ProcedimentosSolicitados.ProcedimentoSolicitado.GlosasProcedimento }
             *     
             */
            public void setGlosasProcedimento(CtGuiaDadosAnexo.ProcedimentosSolicitados.ProcedimentoSolicitado.GlosasProcedimento value) {
                this.glosasProcedimento = value;
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
             *         &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
             *         &lt;element name="valorGlosaProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
                "motivoGlosa",
                "valorGlosaProcedimento"
            })
            public static class GlosasProcedimento {

                @XmlElement(required = true)
                protected List<CtMotivoGlosa> motivoGlosa;
                @XmlElement(required = true)
                protected BigDecimal valorGlosaProcedimento;

                /**
                 * Gets the value of the motivoGlosa property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the motivoGlosa property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMotivoGlosa().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CtMotivoGlosa }
                 * 
                 * 
                 */
                public List<CtMotivoGlosa> getMotivoGlosa() {
                    if (motivoGlosa == null) {
                        motivoGlosa = new ArrayList<CtMotivoGlosa>();
                    }
                    return this.motivoGlosa;
                }

                /**
                 * Obt�m o valor da propriedade valorGlosaProcedimento.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorGlosaProcedimento() {
                    return valorGlosaProcedimento;
                }

                /**
                 * Define o valor da propriedade valorGlosaProcedimento.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorGlosaProcedimento(BigDecimal value) {
                    this.valorGlosaProcedimento = value;
                }

            }

        }

    }

}
