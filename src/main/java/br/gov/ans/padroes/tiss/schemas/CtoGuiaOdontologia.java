
package br.gov.ans.padroes.tiss.schemas;

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
 * <p>Classe Java de cto_guiaOdontologia complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cto_guiaOdontologia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="numeroGuiaPrincipal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="dataAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *         &lt;element name="senhaAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="validadeSenha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="ausenciaCodValidacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_ausenciaCodValidacao" minOccurs="0"/>
 *         &lt;element name="codValidacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto10" minOccurs="0"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiarioDados"/>
 *         &lt;element name="planoBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto40"/>
 *         &lt;element name="nomeEmpresa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto40" minOccurs="0"/>
 *         &lt;element name="numeroTelefone" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto11" minOccurs="0"/>
 *         &lt;element name="nomeTitular" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70" minOccurs="0"/>
 *         &lt;element name="dadosProfissionaisResponsaveis">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nomeProfSolic" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70" minOccurs="0"/>
 *                   &lt;element name="croSolic" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15" minOccurs="0"/>
 *                   &lt;element name="ufSolic" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_UF" minOccurs="0"/>
 *                   &lt;element name="cbosSolic" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_CBOS" minOccurs="0"/>
 *                   &lt;element name="codigoProfExec" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
 *                   &lt;element name="nomeProfExec" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                   &lt;element name="croExec" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15"/>
 *                   &lt;element name="ufExec" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_UF"/>
 *                   &lt;element name="cnesExec" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
 *                   &lt;element name="nomeProfExec2" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70" minOccurs="0"/>
 *                   &lt;element name="croExec2" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15" minOccurs="0"/>
 *                   &lt;element name="ufExec2" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_UF" minOccurs="0"/>
 *                   &lt;element name="cbosExec2" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_CBOS"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="procedimentosExecutados" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sequencialItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico4"/>
 *                   &lt;element name="procSolic" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *                   &lt;element name="denteRegiao" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
 *                             &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto5" minOccurs="0"/>
 *                   &lt;element name="qtdProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
 *                   &lt;element name="qtdUS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
 *                   &lt;element name="valorProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                   &lt;element name="valorFranquia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
 *                   &lt;element name="autorizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_logico"/>
 *                   &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dataTerminoTrat" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *         &lt;element name="tipoAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoAtendimentoOdonto"/>
 *         &lt;element name="tipoFaturamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoFaturamentoOdonto"/>
 *         &lt;element name="qtdTotalUS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
 *         &lt;element name="valorTotalProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="valorTotalFranquia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
 *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *         &lt;element name="odontoInicial" type="{http://www.ans.gov.br/padroes/tiss/schemas}cto_anexoSituacaoInicialnaGTO" minOccurs="0"/>
 *         &lt;element name="assinaturaDigitalGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cto_guiaOdontologia", propOrder = {
    "registroANS",
    "numeroGuiaPrestador",
    "numeroGuiaPrincipal",
    "dataAutorizacao",
    "senhaAutorizacao",
    "validadeSenha",
    "numeroGuiaOperadora",
    "ausenciaCodValidacao",
    "codValidacao",
    "dadosBeneficiario",
    "planoBeneficiario",
    "nomeEmpresa",
    "numeroTelefone",
    "nomeTitular",
    "dadosProfissionaisResponsaveis",
    "procedimentosExecutados",
    "dataTerminoTrat",
    "tipoAtendimento",
    "tipoFaturamento",
    "qtdTotalUS",
    "valorTotalProc",
    "valorTotalFranquia",
    "observacao",
    "odontoInicial",
    "assinaturaDigitalGuia"
})
public class CtoGuiaOdontologia {

    @XmlElement(required = true)
    protected String registroANS;
    @XmlElement(required = true)
    protected String numeroGuiaPrestador;
    protected String numeroGuiaPrincipal;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataAutorizacao;
    protected String senhaAutorizacao;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validadeSenha;
    protected String numeroGuiaOperadora;
    protected String ausenciaCodValidacao;
    protected String codValidacao;
    @XmlElement(required = true)
    protected CtBeneficiarioDados dadosBeneficiario;
    @XmlElement(required = true)
    protected String planoBeneficiario;
    protected String nomeEmpresa;
    protected String numeroTelefone;
    protected String nomeTitular;
    @XmlElement(required = true)
    protected CtoGuiaOdontologia.DadosProfissionaisResponsaveis dadosProfissionaisResponsaveis;
    @XmlElement(required = true)
    protected List<CtoGuiaOdontologia.ProcedimentosExecutados> procedimentosExecutados;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataTerminoTrat;
    @XmlElement(required = true)
    protected String tipoAtendimento;
    @XmlElement(required = true)
    protected String tipoFaturamento;
    protected BigDecimal qtdTotalUS;
    @XmlElement(required = true)
    protected BigDecimal valorTotalProc;
    protected BigDecimal valorTotalFranquia;
    protected String observacao;
    protected CtoAnexoSituacaoInicialnaGTO odontoInicial;
    protected Signature assinaturaDigitalGuia;

    /**
     * Obt�m o valor da propriedade registroANS.
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
     * Obt�m o valor da propriedade dataAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAutorizacao() {
        return dataAutorizacao;
    }

    /**
     * Define o valor da propriedade dataAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAutorizacao(XMLGregorianCalendar value) {
        this.dataAutorizacao = value;
    }

    /**
     * Obt�m o valor da propriedade senhaAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenhaAutorizacao() {
        return senhaAutorizacao;
    }

    /**
     * Define o valor da propriedade senhaAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenhaAutorizacao(String value) {
        this.senhaAutorizacao = value;
    }

    /**
     * Obt�m o valor da propriedade validadeSenha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidadeSenha() {
        return validadeSenha;
    }

    /**
     * Define o valor da propriedade validadeSenha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidadeSenha(XMLGregorianCalendar value) {
        this.validadeSenha = value;
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
     * Obt�m o valor da propriedade planoBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanoBeneficiario() {
        return planoBeneficiario;
    }

    /**
     * Define o valor da propriedade planoBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanoBeneficiario(String value) {
        this.planoBeneficiario = value;
    }

    /**
     * Obt�m o valor da propriedade nomeEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * Define o valor da propriedade nomeEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeEmpresa(String value) {
        this.nomeEmpresa = value;
    }

    /**
     * Obt�m o valor da propriedade numeroTelefone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    /**
     * Define o valor da propriedade numeroTelefone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTelefone(String value) {
        this.numeroTelefone = value;
    }

    /**
     * Obt�m o valor da propriedade nomeTitular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeTitular() {
        return nomeTitular;
    }

    /**
     * Define o valor da propriedade nomeTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeTitular(String value) {
        this.nomeTitular = value;
    }

    /**
     * Obt�m o valor da propriedade dadosProfissionaisResponsaveis.
     * 
     * @return
     *     possible object is
     *     {@link CtoGuiaOdontologia.DadosProfissionaisResponsaveis }
     *     
     */
    public CtoGuiaOdontologia.DadosProfissionaisResponsaveis getDadosProfissionaisResponsaveis() {
        return dadosProfissionaisResponsaveis;
    }

    /**
     * Define o valor da propriedade dadosProfissionaisResponsaveis.
     * 
     * @param value
     *     allowed object is
     *     {@link CtoGuiaOdontologia.DadosProfissionaisResponsaveis }
     *     
     */
    public void setDadosProfissionaisResponsaveis(CtoGuiaOdontologia.DadosProfissionaisResponsaveis value) {
        this.dadosProfissionaisResponsaveis = value;
    }

    /**
     * Gets the value of the procedimentosExecutados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procedimentosExecutados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcedimentosExecutados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtoGuiaOdontologia.ProcedimentosExecutados }
     * 
     * 
     */
    public List<CtoGuiaOdontologia.ProcedimentosExecutados> getProcedimentosExecutados() {
        if (procedimentosExecutados == null) {
            procedimentosExecutados = new ArrayList<CtoGuiaOdontologia.ProcedimentosExecutados>();
        }
        return this.procedimentosExecutados;
    }

    /**
     * Obt�m o valor da propriedade dataTerminoTrat.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataTerminoTrat() {
        return dataTerminoTrat;
    }

    /**
     * Define o valor da propriedade dataTerminoTrat.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataTerminoTrat(XMLGregorianCalendar value) {
        this.dataTerminoTrat = value;
    }

    /**
     * Obt�m o valor da propriedade tipoAtendimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    /**
     * Define o valor da propriedade tipoAtendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAtendimento(String value) {
        this.tipoAtendimento = value;
    }

    /**
     * Obt�m o valor da propriedade tipoFaturamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFaturamento() {
        return tipoFaturamento;
    }

    /**
     * Define o valor da propriedade tipoFaturamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFaturamento(String value) {
        this.tipoFaturamento = value;
    }

    /**
     * Obt�m o valor da propriedade qtdTotalUS.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtdTotalUS() {
        return qtdTotalUS;
    }

    /**
     * Define o valor da propriedade qtdTotalUS.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtdTotalUS(BigDecimal value) {
        this.qtdTotalUS = value;
    }

    /**
     * Obt�m o valor da propriedade valorTotalProc.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalProc() {
        return valorTotalProc;
    }

    /**
     * Define o valor da propriedade valorTotalProc.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalProc(BigDecimal value) {
        this.valorTotalProc = value;
    }

    /**
     * Obt�m o valor da propriedade valorTotalFranquia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalFranquia() {
        return valorTotalFranquia;
    }

    /**
     * Define o valor da propriedade valorTotalFranquia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalFranquia(BigDecimal value) {
        this.valorTotalFranquia = value;
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
     * Obt�m o valor da propriedade odontoInicial.
     * 
     * @return
     *     possible object is
     *     {@link CtoAnexoSituacaoInicialnaGTO }
     *     
     */
    public CtoAnexoSituacaoInicialnaGTO getOdontoInicial() {
        return odontoInicial;
    }

    /**
     * Define o valor da propriedade odontoInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link CtoAnexoSituacaoInicialnaGTO }
     *     
     */
    public void setOdontoInicial(CtoAnexoSituacaoInicialnaGTO value) {
        this.odontoInicial = value;
    }

    /**
     * Obt�m o valor da propriedade assinaturaDigitalGuia.
     * 
     * @return
     *     possible object is
     *     {@link Signature }
     *     
     */
    public Signature getAssinaturaDigitalGuia() {
        return assinaturaDigitalGuia;
    }

    /**
     * Define o valor da propriedade assinaturaDigitalGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link Signature }
     *     
     */
    public void setAssinaturaDigitalGuia(Signature value) {
        this.assinaturaDigitalGuia = value;
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
     *         &lt;element name="nomeProfSolic" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70" minOccurs="0"/>
     *         &lt;element name="croSolic" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15" minOccurs="0"/>
     *         &lt;element name="ufSolic" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_UF" minOccurs="0"/>
     *         &lt;element name="cbosSolic" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_CBOS" minOccurs="0"/>
     *         &lt;element name="codigoProfExec" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
     *         &lt;element name="nomeProfExec" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
     *         &lt;element name="croExec" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15"/>
     *         &lt;element name="ufExec" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_UF"/>
     *         &lt;element name="cnesExec" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
     *         &lt;element name="nomeProfExec2" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70" minOccurs="0"/>
     *         &lt;element name="croExec2" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15" minOccurs="0"/>
     *         &lt;element name="ufExec2" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_UF" minOccurs="0"/>
     *         &lt;element name="cbosExec2" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_CBOS"/>
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
        "nomeProfSolic",
        "croSolic",
        "ufSolic",
        "cbosSolic",
        "codigoProfExec",
        "nomeProfExec",
        "croExec",
        "ufExec",
        "cnesExec",
        "nomeProfExec2",
        "croExec2",
        "ufExec2",
        "cbosExec2"
    })
    public static class DadosProfissionaisResponsaveis {

        protected String nomeProfSolic;
        protected String croSolic;
        protected String ufSolic;
        protected String cbosSolic;
        @XmlElement(required = true)
        protected String codigoProfExec;
        @XmlElement(required = true)
        protected String nomeProfExec;
        @XmlElement(required = true)
        protected String croExec;
        @XmlElement(required = true)
        protected String ufExec;
        @XmlElement(required = true)
        protected String cnesExec;
        protected String nomeProfExec2;
        protected String croExec2;
        protected String ufExec2;
        @XmlElement(required = true)
        protected String cbosExec2;

        /**
         * Obt�m o valor da propriedade nomeProfSolic.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomeProfSolic() {
            return nomeProfSolic;
        }

        /**
         * Define o valor da propriedade nomeProfSolic.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomeProfSolic(String value) {
            this.nomeProfSolic = value;
        }

        /**
         * Obt�m o valor da propriedade croSolic.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCroSolic() {
            return croSolic;
        }

        /**
         * Define o valor da propriedade croSolic.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCroSolic(String value) {
            this.croSolic = value;
        }

        /**
         * Obt�m o valor da propriedade ufSolic.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUfSolic() {
            return ufSolic;
        }

        /**
         * Define o valor da propriedade ufSolic.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUfSolic(String value) {
            this.ufSolic = value;
        }

        /**
         * Obt�m o valor da propriedade cbosSolic.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCbosSolic() {
            return cbosSolic;
        }

        /**
         * Define o valor da propriedade cbosSolic.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCbosSolic(String value) {
            this.cbosSolic = value;
        }

        /**
         * Obt�m o valor da propriedade codigoProfExec.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoProfExec() {
            return codigoProfExec;
        }

        /**
         * Define o valor da propriedade codigoProfExec.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoProfExec(String value) {
            this.codigoProfExec = value;
        }

        /**
         * Obt�m o valor da propriedade nomeProfExec.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomeProfExec() {
            return nomeProfExec;
        }

        /**
         * Define o valor da propriedade nomeProfExec.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomeProfExec(String value) {
            this.nomeProfExec = value;
        }

        /**
         * Obt�m o valor da propriedade croExec.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCroExec() {
            return croExec;
        }

        /**
         * Define o valor da propriedade croExec.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCroExec(String value) {
            this.croExec = value;
        }

        /**
         * Obt�m o valor da propriedade ufExec.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUfExec() {
            return ufExec;
        }

        /**
         * Define o valor da propriedade ufExec.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUfExec(String value) {
            this.ufExec = value;
        }

        /**
         * Obt�m o valor da propriedade cnesExec.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCnesExec() {
            return cnesExec;
        }

        /**
         * Define o valor da propriedade cnesExec.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCnesExec(String value) {
            this.cnesExec = value;
        }

        /**
         * Obt�m o valor da propriedade nomeProfExec2.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomeProfExec2() {
            return nomeProfExec2;
        }

        /**
         * Define o valor da propriedade nomeProfExec2.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomeProfExec2(String value) {
            this.nomeProfExec2 = value;
        }

        /**
         * Obt�m o valor da propriedade croExec2.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCroExec2() {
            return croExec2;
        }

        /**
         * Define o valor da propriedade croExec2.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCroExec2(String value) {
            this.croExec2 = value;
        }

        /**
         * Obt�m o valor da propriedade ufExec2.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUfExec2() {
            return ufExec2;
        }

        /**
         * Define o valor da propriedade ufExec2.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUfExec2(String value) {
            this.ufExec2 = value;
        }

        /**
         * Obt�m o valor da propriedade cbosExec2.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCbosExec2() {
            return cbosExec2;
        }

        /**
         * Define o valor da propriedade cbosExec2.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCbosExec2(String value) {
            this.cbosExec2 = value;
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
     *         &lt;element name="sequencialItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico4"/>
     *         &lt;element name="procSolic" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
     *         &lt;element name="denteRegiao" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
     *                   &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto5" minOccurs="0"/>
     *         &lt;element name="qtdProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
     *         &lt;element name="qtdUS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
     *         &lt;element name="valorProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *         &lt;element name="valorFranquia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
     *         &lt;element name="autorizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_logico"/>
     *         &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
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
        "sequencialItem",
        "procSolic",
        "denteRegiao",
        "denteFace",
        "qtdProc",
        "qtdUS",
        "valorProc",
        "valorFranquia",
        "autorizado",
        "dataRealizacao"
    })
    public static class ProcedimentosExecutados {

        @XmlElement(required = true)
        protected BigInteger sequencialItem;
        @XmlElement(required = true)
        protected CtProcedimentoDados procSolic;
        protected CtoGuiaOdontologia.ProcedimentosExecutados.DenteRegiao denteRegiao;
        protected String denteFace;
        @XmlElement(required = true)
        protected BigInteger qtdProc;
        protected BigDecimal qtdUS;
        @XmlElement(required = true)
        protected BigDecimal valorProc;
        protected BigDecimal valorFranquia;
        protected boolean autorizado;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dataRealizacao;

        /**
         * Obt�m o valor da propriedade sequencialItem.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSequencialItem() {
            return sequencialItem;
        }

        /**
         * Define o valor da propriedade sequencialItem.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSequencialItem(BigInteger value) {
            this.sequencialItem = value;
        }

        /**
         * Obt�m o valor da propriedade procSolic.
         * 
         * @return
         *     possible object is
         *     {@link CtProcedimentoDados }
         *     
         */
        public CtProcedimentoDados getProcSolic() {
            return procSolic;
        }

        /**
         * Define o valor da propriedade procSolic.
         * 
         * @param value
         *     allowed object is
         *     {@link CtProcedimentoDados }
         *     
         */
        public void setProcSolic(CtProcedimentoDados value) {
            this.procSolic = value;
        }

        /**
         * Obt�m o valor da propriedade denteRegiao.
         * 
         * @return
         *     possible object is
         *     {@link CtoGuiaOdontologia.ProcedimentosExecutados.DenteRegiao }
         *     
         */
        public CtoGuiaOdontologia.ProcedimentosExecutados.DenteRegiao getDenteRegiao() {
            return denteRegiao;
        }

        /**
         * Define o valor da propriedade denteRegiao.
         * 
         * @param value
         *     allowed object is
         *     {@link CtoGuiaOdontologia.ProcedimentosExecutados.DenteRegiao }
         *     
         */
        public void setDenteRegiao(CtoGuiaOdontologia.ProcedimentosExecutados.DenteRegiao value) {
            this.denteRegiao = value;
        }

        /**
         * Obt�m o valor da propriedade denteFace.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDenteFace() {
            return denteFace;
        }

        /**
         * Define o valor da propriedade denteFace.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDenteFace(String value) {
            this.denteFace = value;
        }

        /**
         * Obt�m o valor da propriedade qtdProc.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQtdProc() {
            return qtdProc;
        }

        /**
         * Define o valor da propriedade qtdProc.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQtdProc(BigInteger value) {
            this.qtdProc = value;
        }

        /**
         * Obt�m o valor da propriedade qtdUS.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getQtdUS() {
            return qtdUS;
        }

        /**
         * Define o valor da propriedade qtdUS.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setQtdUS(BigDecimal value) {
            this.qtdUS = value;
        }

        /**
         * Obt�m o valor da propriedade valorProc.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorProc() {
            return valorProc;
        }

        /**
         * Define o valor da propriedade valorProc.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorProc(BigDecimal value) {
            this.valorProc = value;
        }

        /**
         * Obt�m o valor da propriedade valorFranquia.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorFranquia() {
            return valorFranquia;
        }

        /**
         * Define o valor da propriedade valorFranquia.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorFranquia(BigDecimal value) {
            this.valorFranquia = value;
        }

        /**
         * Obt�m o valor da propriedade autorizado.
         * 
         */
        public boolean isAutorizado() {
            return autorizado;
        }

        /**
         * Define o valor da propriedade autorizado.
         * 
         */
        public void setAutorizado(boolean value) {
            this.autorizado = value;
        }

        /**
         * Obt�m o valor da propriedade dataRealizacao.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataRealizacao() {
            return dataRealizacao;
        }

        /**
         * Define o valor da propriedade dataRealizacao.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataRealizacao(XMLGregorianCalendar value) {
            this.dataRealizacao = value;
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
         *         &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
         *         &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
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
            "codDente",
            "codRegiao"
        })
        public static class DenteRegiao {

            protected String codDente;
            @XmlSchemaType(name = "string")
            protected DmRegiao codRegiao;

            /**
             * Obt�m o valor da propriedade codDente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodDente() {
                return codDente;
            }

            /**
             * Define o valor da propriedade codDente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodDente(String value) {
                this.codDente = value;
            }

            /**
             * Obt�m o valor da propriedade codRegiao.
             * 
             * @return
             *     possible object is
             *     {@link DmRegiao }
             *     
             */
            public DmRegiao getCodRegiao() {
                return codRegiao;
            }

            /**
             * Define o valor da propriedade codRegiao.
             * 
             * @param value
             *     allowed object is
             *     {@link DmRegiao }
             *     
             */
            public void setCodRegiao(DmRegiao value) {
                this.codRegiao = value;
            }

        }

    }

}
