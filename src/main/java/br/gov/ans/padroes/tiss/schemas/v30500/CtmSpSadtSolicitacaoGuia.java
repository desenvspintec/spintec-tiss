
package br.gov.ans.padroes.tiss.schemas.v30500;

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
 * <p>Classe Java de ctm_sp-sadtSolicitacaoGuia complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ctm_sp-sadtSolicitacaoGuia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecalhoSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaCabecalho"/>
 *         &lt;element name="numeroGuiaPrincipal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="ausenciaCodValidacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_ausenciaCodValidacao" minOccurs="0"/>
 *         &lt;element name="codValidacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto10" minOccurs="0"/>
 *         &lt;element name="tipoEtapaAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_etapasAutorizacao"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiarioDados"/>
 *         &lt;element name="dadosSolicitante">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contratadoSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *                   &lt;element name="profissionalSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoProfissionalDados"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="caraterAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_caraterAtendimento"/>
 *         &lt;element name="dataSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="indicacaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *         &lt;element name="procedimentosSolicitados" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *                   &lt;element name="quantidadeSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosExecutante" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codigonaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
 *                   &lt;element name="nomeContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                   &lt;element name="CNES" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="anexoClinico" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="solicitacaoQuimioterapia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitacaoQuimio" minOccurs="0"/>
 *                   &lt;element name="solicitacaoRadioterapia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitacaoRadio" minOccurs="0"/>
 *                   &lt;element name="solicitacaoOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitacaoOPME" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_sp-sadtSolicitacaoGuia", propOrder = {
    "cabecalhoSolicitacao",
    "numeroGuiaPrincipal",
    "ausenciaCodValidacao",
    "codValidacao",
    "tipoEtapaAutorizacao",
    "dadosBeneficiario",
    "dadosSolicitante",
    "caraterAtendimento",
    "dataSolicitacao",
    "indicacaoClinica",
    "procedimentosSolicitados",
    "dadosExecutante",
    "anexoClinico",
    "observacao"
})
public class CtmSpSadtSolicitacaoGuia {

    @XmlElement(required = true)
    protected CtGuiaCabecalho cabecalhoSolicitacao;
    protected String numeroGuiaPrincipal;
    protected String ausenciaCodValidacao;
    protected String codValidacao;
    @XmlElement(required = true)
    protected String tipoEtapaAutorizacao;
    @XmlElement(required = true)
    protected CtBeneficiarioDados dadosBeneficiario;
    @XmlElement(required = true)
    protected CtmSpSadtSolicitacaoGuia.DadosSolicitante dadosSolicitante;
    @XmlElement(required = true)
    protected String caraterAtendimento;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataSolicitacao;
    protected String indicacaoClinica;
    @XmlElement(required = true)
    protected List<CtmSpSadtSolicitacaoGuia.ProcedimentosSolicitados> procedimentosSolicitados;
    protected CtmSpSadtSolicitacaoGuia.DadosExecutante dadosExecutante;
    protected CtmSpSadtSolicitacaoGuia.AnexoClinico anexoClinico;
    protected String observacao;

    /**
     * Obt�m o valor da propriedade cabecalhoSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaCabecalho }
     *     
     */
    public CtGuiaCabecalho getCabecalhoSolicitacao() {
        return cabecalhoSolicitacao;
    }

    /**
     * Define o valor da propriedade cabecalhoSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaCabecalho }
     *     
     */
    public void setCabecalhoSolicitacao(CtGuiaCabecalho value) {
        this.cabecalhoSolicitacao = value;
    }

    /**
     * Obt�m o valor da propriedade numeroGuiaPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaPrincipal() {
        return numeroGuiaPrincipal;
    }

    /**
     * Define o valor da propriedade numeroGuiaPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaPrincipal(String value) {
        this.numeroGuiaPrincipal = value;
    }

    /**
     * Obt�m o valor da propriedade ausenciaCodValidacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAusenciaCodValidacao() {
        return ausenciaCodValidacao;
    }

    /**
     * Define o valor da propriedade ausenciaCodValidacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAusenciaCodValidacao(String value) {
        this.ausenciaCodValidacao = value;
    }

    /**
     * Obt�m o valor da propriedade codValidacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodValidacao() {
        return codValidacao;
    }

    /**
     * Define o valor da propriedade codValidacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodValidacao(String value) {
        this.codValidacao = value;
    }

    /**
     * Obt�m o valor da propriedade tipoEtapaAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEtapaAutorizacao() {
        return tipoEtapaAutorizacao;
    }

    /**
     * Define o valor da propriedade tipoEtapaAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEtapaAutorizacao(String value) {
        this.tipoEtapaAutorizacao = value;
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
     * Obt�m o valor da propriedade dadosSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link CtmSpSadtSolicitacaoGuia.DadosSolicitante }
     *     
     */
    public CtmSpSadtSolicitacaoGuia.DadosSolicitante getDadosSolicitante() {
        return dadosSolicitante;
    }

    /**
     * Define o valor da propriedade dadosSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmSpSadtSolicitacaoGuia.DadosSolicitante }
     *     
     */
    public void setDadosSolicitante(CtmSpSadtSolicitacaoGuia.DadosSolicitante value) {
        this.dadosSolicitante = value;
    }

    /**
     * Obt�m o valor da propriedade caraterAtendimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaraterAtendimento() {
        return caraterAtendimento;
    }

    /**
     * Define o valor da propriedade caraterAtendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaraterAtendimento(String value) {
        this.caraterAtendimento = value;
    }

    /**
     * Obt�m o valor da propriedade dataSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataSolicitacao() {
        return dataSolicitacao;
    }

    /**
     * Define o valor da propriedade dataSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataSolicitacao(XMLGregorianCalendar value) {
        this.dataSolicitacao = value;
    }

    /**
     * Obt�m o valor da propriedade indicacaoClinica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicacaoClinica() {
        return indicacaoClinica;
    }

    /**
     * Define o valor da propriedade indicacaoClinica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicacaoClinica(String value) {
        this.indicacaoClinica = value;
    }

    /**
     * Gets the value of the procedimentosSolicitados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procedimentosSolicitados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcedimentosSolicitados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtmSpSadtSolicitacaoGuia.ProcedimentosSolicitados }
     * 
     * 
     */
    public List<CtmSpSadtSolicitacaoGuia.ProcedimentosSolicitados> getProcedimentosSolicitados() {
        if (procedimentosSolicitados == null) {
            procedimentosSolicitados = new ArrayList<CtmSpSadtSolicitacaoGuia.ProcedimentosSolicitados>();
        }
        return this.procedimentosSolicitados;
    }

    /**
     * Obt�m o valor da propriedade dadosExecutante.
     * 
     * @return
     *     possible object is
     *     {@link CtmSpSadtSolicitacaoGuia.DadosExecutante }
     *     
     */
    public CtmSpSadtSolicitacaoGuia.DadosExecutante getDadosExecutante() {
        return dadosExecutante;
    }

    /**
     * Define o valor da propriedade dadosExecutante.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmSpSadtSolicitacaoGuia.DadosExecutante }
     *     
     */
    public void setDadosExecutante(CtmSpSadtSolicitacaoGuia.DadosExecutante value) {
        this.dadosExecutante = value;
    }

    /**
     * Obt�m o valor da propriedade anexoClinico.
     * 
     * @return
     *     possible object is
     *     {@link CtmSpSadtSolicitacaoGuia.AnexoClinico }
     *     
     */
    public CtmSpSadtSolicitacaoGuia.AnexoClinico getAnexoClinico() {
        return anexoClinico;
    }

    /**
     * Define o valor da propriedade anexoClinico.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmSpSadtSolicitacaoGuia.AnexoClinico }
     *     
     */
    public void setAnexoClinico(CtmSpSadtSolicitacaoGuia.AnexoClinico value) {
        this.anexoClinico = value;
    }

    /**
     * Obt�m o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
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
     *         &lt;element name="solicitacaoQuimioterapia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitacaoQuimio" minOccurs="0"/>
     *         &lt;element name="solicitacaoRadioterapia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitacaoRadio" minOccurs="0"/>
     *         &lt;element name="solicitacaoOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitacaoOPME" minOccurs="0"/>
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
        "solicitacaoQuimioterapia",
        "solicitacaoRadioterapia",
        "solicitacaoOPME"
    })
    public static class AnexoClinico {

        protected CtmAnexoSolicitacaoQuimio solicitacaoQuimioterapia;
        protected CtmAnexoSolicitacaoRadio solicitacaoRadioterapia;
        protected CtmAnexoSolicitacaoOPME solicitacaoOPME;

        /**
         * Obt�m o valor da propriedade solicitacaoQuimioterapia.
         * 
         * @return
         *     possible object is
         *     {@link CtmAnexoSolicitacaoQuimio }
         *     
         */
        public CtmAnexoSolicitacaoQuimio getSolicitacaoQuimioterapia() {
            return solicitacaoQuimioterapia;
        }

        /**
         * Define o valor da propriedade solicitacaoQuimioterapia.
         * 
         * @param value
         *     allowed object is
         *     {@link CtmAnexoSolicitacaoQuimio }
         *     
         */
        public void setSolicitacaoQuimioterapia(CtmAnexoSolicitacaoQuimio value) {
            this.solicitacaoQuimioterapia = value;
        }

        /**
         * Obt�m o valor da propriedade solicitacaoRadioterapia.
         * 
         * @return
         *     possible object is
         *     {@link CtmAnexoSolicitacaoRadio }
         *     
         */
        public CtmAnexoSolicitacaoRadio getSolicitacaoRadioterapia() {
            return solicitacaoRadioterapia;
        }

        /**
         * Define o valor da propriedade solicitacaoRadioterapia.
         * 
         * @param value
         *     allowed object is
         *     {@link CtmAnexoSolicitacaoRadio }
         *     
         */
        public void setSolicitacaoRadioterapia(CtmAnexoSolicitacaoRadio value) {
            this.solicitacaoRadioterapia = value;
        }

        /**
         * Obt�m o valor da propriedade solicitacaoOPME.
         * 
         * @return
         *     possible object is
         *     {@link CtmAnexoSolicitacaoOPME }
         *     
         */
        public CtmAnexoSolicitacaoOPME getSolicitacaoOPME() {
            return solicitacaoOPME;
        }

        /**
         * Define o valor da propriedade solicitacaoOPME.
         * 
         * @param value
         *     allowed object is
         *     {@link CtmAnexoSolicitacaoOPME }
         *     
         */
        public void setSolicitacaoOPME(CtmAnexoSolicitacaoOPME value) {
            this.solicitacaoOPME = value;
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
     *         &lt;element name="codigonaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
     *         &lt;element name="nomeContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
     *         &lt;element name="CNES" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
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
        "codigonaOperadora",
        "nomeContratado",
        "cnes"
    })
    public static class DadosExecutante {

        @XmlElement(required = true)
        protected String codigonaOperadora;
        @XmlElement(required = true)
        protected String nomeContratado;
        @XmlElement(name = "CNES", required = true)
        protected String cnes;

        /**
         * Obt�m o valor da propriedade codigonaOperadora.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigonaOperadora() {
            return codigonaOperadora;
        }

        /**
         * Define o valor da propriedade codigonaOperadora.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigonaOperadora(String value) {
            this.codigonaOperadora = value;
        }

        /**
         * Obt�m o valor da propriedade nomeContratado.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomeContratado() {
            return nomeContratado;
        }

        /**
         * Define o valor da propriedade nomeContratado.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomeContratado(String value) {
            this.nomeContratado = value;
        }

        /**
         * Obt�m o valor da propriedade cnes.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCNES() {
            return cnes;
        }

        /**
         * Define o valor da propriedade cnes.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCNES(String value) {
            this.cnes = value;
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
     *         &lt;element name="contratadoSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
     *         &lt;element name="profissionalSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoProfissionalDados"/>
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
        "contratadoSolicitante",
        "profissionalSolicitante"
    })
    public static class DadosSolicitante {

        @XmlElement(required = true)
        protected CtContratadoDados contratadoSolicitante;
        @XmlElement(required = true)
        protected CtContratadoProfissionalDados profissionalSolicitante;

        /**
         * Obt�m o valor da propriedade contratadoSolicitante.
         * 
         * @return
         *     possible object is
         *     {@link CtContratadoDados }
         *     
         */
        public CtContratadoDados getContratadoSolicitante() {
            return contratadoSolicitante;
        }

        /**
         * Define o valor da propriedade contratadoSolicitante.
         * 
         * @param value
         *     allowed object is
         *     {@link CtContratadoDados }
         *     
         */
        public void setContratadoSolicitante(CtContratadoDados value) {
            this.contratadoSolicitante = value;
        }

        /**
         * Obt�m o valor da propriedade profissionalSolicitante.
         * 
         * @return
         *     possible object is
         *     {@link CtContratadoProfissionalDados }
         *     
         */
        public CtContratadoProfissionalDados getProfissionalSolicitante() {
            return profissionalSolicitante;
        }

        /**
         * Define o valor da propriedade profissionalSolicitante.
         * 
         * @param value
         *     allowed object is
         *     {@link CtContratadoProfissionalDados }
         *     
         */
        public void setProfissionalSolicitante(CtContratadoProfissionalDados value) {
            this.profissionalSolicitante = value;
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
     *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
     *         &lt;element name="quantidadeSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3"/>
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
        "quantidadeSolicitada"
    })
    public static class ProcedimentosSolicitados {

        @XmlElement(required = true)
        protected CtProcedimentoDados procedimento;
        @XmlElement(required = true)
        protected BigInteger quantidadeSolicitada;

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
         * Obt�m o valor da propriedade quantidadeSolicitada.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantidadeSolicitada() {
            return quantidadeSolicitada;
        }

        /**
         * Define o valor da propriedade quantidadeSolicitada.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantidadeSolicitada(BigInteger value) {
            this.quantidadeSolicitada = value;
        }

    }

}
