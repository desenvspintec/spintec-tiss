
package br.gov.ans.padroes.tiss.schemas.v30500;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ctm_consultaGuia complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ctm_consultaGuia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecalhoConsulta" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaCabecalho"/>
 *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="ausenciaCodValidacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_ausenciaCodValidacao" minOccurs="0"/>
 *         &lt;element name="codValidacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto10" minOccurs="0"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiarioDados"/>
 *         &lt;element name="contratadoExecutante">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados">
 *                 &lt;sequence>
 *                   &lt;element name="CNES" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="profissionalExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoProfissionalDados"/>
 *         &lt;element name="indicacaoAcidente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_indicadorAcidente"/>
 *         &lt;element name="dadosAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_consultaAtendimento"/>
 *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
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
@XmlType(name = "ctm_consultaGuia", propOrder = {
    "cabecalhoConsulta",
    "numeroGuiaOperadora",
    "ausenciaCodValidacao",
    "codValidacao",
    "dadosBeneficiario",
    "contratadoExecutante",
    "profissionalExecutante",
    "indicacaoAcidente",
    "dadosAtendimento",
    "observacao",
    "assinaturaDigitalGuia"
})
public class CtmConsultaGuia {

    @XmlElement(required = true)
    protected CtGuiaCabecalho cabecalhoConsulta;
    protected String numeroGuiaOperadora;
    protected String ausenciaCodValidacao;
    protected String codValidacao;
    @XmlElement(required = true)
    protected CtBeneficiarioDados dadosBeneficiario;
    @XmlElement(required = true)
    protected CtmConsultaGuia.ContratadoExecutante contratadoExecutante;
    @XmlElement(required = true)
    protected CtContratadoProfissionalDados profissionalExecutante;
    @XmlElement(required = true)
    protected String indicacaoAcidente;
    @XmlElement(required = true)
    protected CtmConsultaAtendimento dadosAtendimento;
    protected String observacao;
    protected Signature assinaturaDigitalGuia;

    /**
     * Obt�m o valor da propriedade cabecalhoConsulta.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaCabecalho }
     *     
     */
    public CtGuiaCabecalho getCabecalhoConsulta() {
        return cabecalhoConsulta;
    }

    /**
     * Define o valor da propriedade cabecalhoConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaCabecalho }
     *     
     */
    public void setCabecalhoConsulta(CtGuiaCabecalho value) {
        this.cabecalhoConsulta = value;
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
     * Obt�m o valor da propriedade contratadoExecutante.
     * 
     * @return
     *     possible object is
     *     {@link CtmConsultaGuia.ContratadoExecutante }
     *     
     */
    public CtmConsultaGuia.ContratadoExecutante getContratadoExecutante() {
        return contratadoExecutante;
    }

    /**
     * Define o valor da propriedade contratadoExecutante.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmConsultaGuia.ContratadoExecutante }
     *     
     */
    public void setContratadoExecutante(CtmConsultaGuia.ContratadoExecutante value) {
        this.contratadoExecutante = value;
    }

    /**
     * Obt�m o valor da propriedade profissionalExecutante.
     * 
     * @return
     *     possible object is
     *     {@link CtContratadoProfissionalDados }
     *     
     */
    public CtContratadoProfissionalDados getProfissionalExecutante() {
        return profissionalExecutante;
    }

    /**
     * Define o valor da propriedade profissionalExecutante.
     * 
     * @param value
     *     allowed object is
     *     {@link CtContratadoProfissionalDados }
     *     
     */
    public void setProfissionalExecutante(CtContratadoProfissionalDados value) {
        this.profissionalExecutante = value;
    }

    /**
     * Obt�m o valor da propriedade indicacaoAcidente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicacaoAcidente() {
        return indicacaoAcidente;
    }

    /**
     * Define o valor da propriedade indicacaoAcidente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicacaoAcidente(String value) {
        this.indicacaoAcidente = value;
    }

    /**
     * Obt�m o valor da propriedade dadosAtendimento.
     * 
     * @return
     *     possible object is
     *     {@link CtmConsultaAtendimento }
     *     
     */
    public CtmConsultaAtendimento getDadosAtendimento() {
        return dadosAtendimento;
    }

    /**
     * Define o valor da propriedade dadosAtendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmConsultaAtendimento }
     *     
     */
    public void setDadosAtendimento(CtmConsultaAtendimento value) {
        this.dadosAtendimento = value;
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
     *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados">
     *       &lt;sequence>
     *         &lt;element name="CNES" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cnes"
    })
    public static class ContratadoExecutante
        extends CtContratadoDados
    {

        @XmlElement(name = "CNES", required = true)
        protected String cnes;

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

}
