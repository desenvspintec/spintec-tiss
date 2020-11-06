
package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ctm_internacaoResumoGuia complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ctm_internacaoResumoGuia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecalhoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaCabecalho"/>
 *         &lt;element name="numeroGuiaSolicitacaoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="dadosAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_autorizacaoInternacao"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiarioDados"/>
 *         &lt;element name="dadosExecutante">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contratadoExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *                   &lt;element name="CNES" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_internacaoDados"/>
 *         &lt;element name="dadosSaidaInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_internacaoDadosSaida"/>
 *         &lt;element name="procedimentosExecutados" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="procedimentoExecutado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoExecutadoInt" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="valorTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaValorTotal"/>
 *         &lt;element name="outrasDespesas" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_outrasDespesas" minOccurs="0"/>
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
@XmlType(name = "ctm_internacaoResumoGuia", propOrder = {
    "cabecalhoGuia",
    "numeroGuiaSolicitacaoInternacao",
    "dadosAutorizacao",
    "dadosBeneficiario",
    "dadosExecutante",
    "dadosInternacao",
    "dadosSaidaInternacao",
    "procedimentosExecutados",
    "valorTotal",
    "outrasDespesas",
    "observacao",
    "assinaturaDigitalGuia"
})
public class CtmInternacaoResumoGuia {

    @XmlElement(required = true)
    protected CtGuiaCabecalho cabecalhoGuia;
    @XmlElement(required = true)
    protected String numeroGuiaSolicitacaoInternacao;
    @XmlElement(required = true)
    protected CtAutorizacaoInternacao dadosAutorizacao;
    @XmlElement(required = true)
    protected CtBeneficiarioDados dadosBeneficiario;
    @XmlElement(required = true)
    protected CtmInternacaoResumoGuia.DadosExecutante dadosExecutante;
    @XmlElement(required = true)
    protected CtmInternacaoDados dadosInternacao;
    @XmlElement(required = true)
    protected CtmInternacaoDadosSaida dadosSaidaInternacao;
    protected CtmInternacaoResumoGuia.ProcedimentosExecutados procedimentosExecutados;
    @XmlElement(required = true)
    protected CtGuiaValorTotal valorTotal;
    protected CtOutrasDespesas outrasDespesas;
    protected String observacao;
    protected Signature assinaturaDigitalGuia;

    /**
     * Obtém o valor da propriedade cabecalhoGuia.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaCabecalho }
     *     
     */
    public CtGuiaCabecalho getCabecalhoGuia() {
        return cabecalhoGuia;
    }

    /**
     * Define o valor da propriedade cabecalhoGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaCabecalho }
     *     
     */
    public void setCabecalhoGuia(CtGuiaCabecalho value) {
        this.cabecalhoGuia = value;
    }

    /**
     * Obtém o valor da propriedade numeroGuiaSolicitacaoInternacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaSolicitacaoInternacao() {
        return numeroGuiaSolicitacaoInternacao;
    }

    /**
     * Define o valor da propriedade numeroGuiaSolicitacaoInternacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaSolicitacaoInternacao(String value) {
        this.numeroGuiaSolicitacaoInternacao = value;
    }

    /**
     * Obtém o valor da propriedade dadosAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link CtAutorizacaoInternacao }
     *     
     */
    public CtAutorizacaoInternacao getDadosAutorizacao() {
        return dadosAutorizacao;
    }

    /**
     * Define o valor da propriedade dadosAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAutorizacaoInternacao }
     *     
     */
    public void setDadosAutorizacao(CtAutorizacaoInternacao value) {
        this.dadosAutorizacao = value;
    }

    /**
     * Obtém o valor da propriedade dadosBeneficiario.
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
     * Obtém o valor da propriedade dadosExecutante.
     * 
     * @return
     *     possible object is
     *     {@link CtmInternacaoResumoGuia.DadosExecutante }
     *     
     */
    public CtmInternacaoResumoGuia.DadosExecutante getDadosExecutante() {
        return dadosExecutante;
    }

    /**
     * Define o valor da propriedade dadosExecutante.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmInternacaoResumoGuia.DadosExecutante }
     *     
     */
    public void setDadosExecutante(CtmInternacaoResumoGuia.DadosExecutante value) {
        this.dadosExecutante = value;
    }

    /**
     * Obtém o valor da propriedade dadosInternacao.
     * 
     * @return
     *     possible object is
     *     {@link CtmInternacaoDados }
     *     
     */
    public CtmInternacaoDados getDadosInternacao() {
        return dadosInternacao;
    }

    /**
     * Define o valor da propriedade dadosInternacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmInternacaoDados }
     *     
     */
    public void setDadosInternacao(CtmInternacaoDados value) {
        this.dadosInternacao = value;
    }

    /**
     * Obtém o valor da propriedade dadosSaidaInternacao.
     * 
     * @return
     *     possible object is
     *     {@link CtmInternacaoDadosSaida }
     *     
     */
    public CtmInternacaoDadosSaida getDadosSaidaInternacao() {
        return dadosSaidaInternacao;
    }

    /**
     * Define o valor da propriedade dadosSaidaInternacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmInternacaoDadosSaida }
     *     
     */
    public void setDadosSaidaInternacao(CtmInternacaoDadosSaida value) {
        this.dadosSaidaInternacao = value;
    }

    /**
     * Obtém o valor da propriedade procedimentosExecutados.
     * 
     * @return
     *     possible object is
     *     {@link CtmInternacaoResumoGuia.ProcedimentosExecutados }
     *     
     */
    public CtmInternacaoResumoGuia.ProcedimentosExecutados getProcedimentosExecutados() {
        return procedimentosExecutados;
    }

    /**
     * Define o valor da propriedade procedimentosExecutados.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmInternacaoResumoGuia.ProcedimentosExecutados }
     *     
     */
    public void setProcedimentosExecutados(CtmInternacaoResumoGuia.ProcedimentosExecutados value) {
        this.procedimentosExecutados = value;
    }

    /**
     * Obtém o valor da propriedade valorTotal.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaValorTotal }
     *     
     */
    public CtGuiaValorTotal getValorTotal() {
        return valorTotal;
    }

    /**
     * Define o valor da propriedade valorTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaValorTotal }
     *     
     */
    public void setValorTotal(CtGuiaValorTotal value) {
        this.valorTotal = value;
    }

    /**
     * Obtém o valor da propriedade outrasDespesas.
     * 
     * @return
     *     possible object is
     *     {@link CtOutrasDespesas }
     *     
     */
    public CtOutrasDespesas getOutrasDespesas() {
        return outrasDespesas;
    }

    /**
     * Define o valor da propriedade outrasDespesas.
     * 
     * @param value
     *     allowed object is
     *     {@link CtOutrasDespesas }
     *     
     */
    public void setOutrasDespesas(CtOutrasDespesas value) {
        this.outrasDespesas = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
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
     * Obtém o valor da propriedade assinaturaDigitalGuia.
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
     *         &lt;element name="contratadoExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
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
        "contratadoExecutante",
        "cnes"
    })
    public static class DadosExecutante {

        @XmlElement(required = true)
        protected CtContratadoDados contratadoExecutante;
        @XmlElement(name = "CNES", required = true)
        protected String cnes;

        /**
         * Obtém o valor da propriedade contratadoExecutante.
         * 
         * @return
         *     possible object is
         *     {@link CtContratadoDados }
         *     
         */
        public CtContratadoDados getContratadoExecutante() {
            return contratadoExecutante;
        }

        /**
         * Define o valor da propriedade contratadoExecutante.
         * 
         * @param value
         *     allowed object is
         *     {@link CtContratadoDados }
         *     
         */
        public void setContratadoExecutante(CtContratadoDados value) {
            this.contratadoExecutante = value;
        }

        /**
         * Obtém o valor da propriedade cnes.
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
     *         &lt;element name="procedimentoExecutado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoExecutadoInt" maxOccurs="unbounded"/>
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
        "procedimentoExecutado"
    })
    public static class ProcedimentosExecutados {

        @XmlElement(required = true)
        protected List<CtProcedimentoExecutadoInt> procedimentoExecutado;

        /**
         * Gets the value of the procedimentoExecutado property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the procedimentoExecutado property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProcedimentoExecutado().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtProcedimentoExecutadoInt }
         * 
         * 
         */
        public List<CtProcedimentoExecutadoInt> getProcedimentoExecutado() {
            if (procedimentoExecutado == null) {
                procedimentoExecutado = new ArrayList<CtProcedimentoExecutadoInt>();
            }
            return this.procedimentoExecutado;
        }

    }

}
