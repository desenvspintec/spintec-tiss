
package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ctm_solicitacaoLote complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ctm_solicitacaoLote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="solicitacaoSP-SADT" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_sp-sadtSolicitacaoGuia"/>
 *         &lt;element name="solicitacaoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_internacaoSolicitacaoGuia"/>
 *         &lt;element name="solicitacaoProrrogacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_prorrogacaoSolicitacaoGuia"/>
 *         &lt;element name="solicitacaoOdontologia" type="{http://www.ans.gov.br/padroes/tiss/schemas}cto_odontoSolicitacaoGuia"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_solicitacaoLote", propOrder = {
    "solicitacaoSPSADT",
    "solicitacaoInternacao",
    "solicitacaoProrrogacao",
    "solicitacaoOdontologia"
})
@XmlSeeAlso({
    CtSolicitacaoProcedimento.class
})
public class CtmSolicitacaoLote {

    @XmlElement(name = "solicitacaoSP-SADT")
    protected CtmSpSadtSolicitacaoGuia solicitacaoSPSADT;
    protected CtmInternacaoSolicitacaoGuia solicitacaoInternacao;
    protected CtmProrrogacaoSolicitacaoGuia solicitacaoProrrogacao;
    protected CtoOdontoSolicitacaoGuia solicitacaoOdontologia;

    /**
     * Obtém o valor da propriedade solicitacaoSPSADT.
     * 
     * @return
     *     possible object is
     *     {@link CtmSpSadtSolicitacaoGuia }
     *     
     */
    public CtmSpSadtSolicitacaoGuia getSolicitacaoSPSADT() {
        return solicitacaoSPSADT;
    }

    /**
     * Define o valor da propriedade solicitacaoSPSADT.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmSpSadtSolicitacaoGuia }
     *     
     */
    public void setSolicitacaoSPSADT(CtmSpSadtSolicitacaoGuia value) {
        this.solicitacaoSPSADT = value;
    }

    /**
     * Obtém o valor da propriedade solicitacaoInternacao.
     * 
     * @return
     *     possible object is
     *     {@link CtmInternacaoSolicitacaoGuia }
     *     
     */
    public CtmInternacaoSolicitacaoGuia getSolicitacaoInternacao() {
        return solicitacaoInternacao;
    }

    /**
     * Define o valor da propriedade solicitacaoInternacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmInternacaoSolicitacaoGuia }
     *     
     */
    public void setSolicitacaoInternacao(CtmInternacaoSolicitacaoGuia value) {
        this.solicitacaoInternacao = value;
    }

    /**
     * Obtém o valor da propriedade solicitacaoProrrogacao.
     * 
     * @return
     *     possible object is
     *     {@link CtmProrrogacaoSolicitacaoGuia }
     *     
     */
    public CtmProrrogacaoSolicitacaoGuia getSolicitacaoProrrogacao() {
        return solicitacaoProrrogacao;
    }

    /**
     * Define o valor da propriedade solicitacaoProrrogacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmProrrogacaoSolicitacaoGuia }
     *     
     */
    public void setSolicitacaoProrrogacao(CtmProrrogacaoSolicitacaoGuia value) {
        this.solicitacaoProrrogacao = value;
    }

    /**
     * Obtém o valor da propriedade solicitacaoOdontologia.
     * 
     * @return
     *     possible object is
     *     {@link CtoOdontoSolicitacaoGuia }
     *     
     */
    public CtoOdontoSolicitacaoGuia getSolicitacaoOdontologia() {
        return solicitacaoOdontologia;
    }

    /**
     * Define o valor da propriedade solicitacaoOdontologia.
     * 
     * @param value
     *     allowed object is
     *     {@link CtoOdontoSolicitacaoGuia }
     *     
     */
    public void setSolicitacaoOdontologia(CtoOdontoSolicitacaoGuia value) {
        this.solicitacaoOdontologia = value;
    }

}
