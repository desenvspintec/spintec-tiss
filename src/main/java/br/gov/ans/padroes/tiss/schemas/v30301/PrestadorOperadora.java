
package br.gov.ans.padroes.tiss.schemas.v30301;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de prestadorOperadora complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="prestadorOperadora">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="loteGuias" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_guiaLote" minOccurs="0"/>
 *         &lt;element name="loteAnexos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_anexoLote" minOccurs="0"/>
 *         &lt;element name="solicitacaoDemonstrativoRetorno" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_demonstrativoSolicitacao" minOccurs="0"/>
 *         &lt;element name="solicitacaoStatusProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_protocoloSolicitacaoStatus" minOccurs="0"/>
 *         &lt;element name="solicitacaoProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_solicitacaoProcedimento" minOccurs="0"/>
 *         &lt;element name="solicitaStatusAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_autorizacaoSolicitaStatus" minOccurs="0"/>
 *         &lt;element name="verificaElegibilidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_elegibilidadeVerifica" minOccurs="0"/>
 *         &lt;element name="cancelaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaCancelamento" minOccurs="0"/>
 *         &lt;element name="comunicacaoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_beneficiarioComunicacao" minOccurs="0"/>
 *         &lt;element name="recursoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaRecursoLote" minOccurs="0"/>
 *         &lt;element name="solicitacaoStatusRecursoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_protocoloSolicitacaoStatus" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prestadorOperadora", propOrder = {
    "loteGuias",
    "loteAnexos",
    "solicitacaoDemonstrativoRetorno",
    "solicitacaoStatusProtocolo",
    "solicitacaoProcedimento",
    "solicitaStatusAutorizacao",
    "verificaElegibilidade",
    "cancelaGuia",
    "comunicacaoInternacao",
    "recursoGlosa",
    "solicitacaoStatusRecursoGlosa"
})
public class PrestadorOperadora {

    protected CtmGuiaLote loteGuias;
    protected CtAnexoLote loteAnexos;
    protected CtDemonstrativoSolicitacao solicitacaoDemonstrativoRetorno;
    protected CtProtocoloSolicitacaoStatus solicitacaoStatusProtocolo;
    protected CtSolicitacaoProcedimento solicitacaoProcedimento;
    protected CtAutorizacaoSolicitaStatus solicitaStatusAutorizacao;
    protected CtElegibilidadeVerifica verificaElegibilidade;
    protected CtGuiaCancelamento cancelaGuia;
    protected CtmBeneficiarioComunicacao comunicacaoInternacao;
    protected CtGuiaRecursoLote recursoGlosa;
    protected CtProtocoloSolicitacaoStatus solicitacaoStatusRecursoGlosa;

    /**
     * Obtém o valor da propriedade loteGuias.
     * 
     * @return
     *     possible object is
     *     {@link CtmGuiaLote }
     *     
     */
    public CtmGuiaLote getLoteGuias() {
        return loteGuias;
    }

    /**
     * Define o valor da propriedade loteGuias.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmGuiaLote }
     *     
     */
    public void setLoteGuias(CtmGuiaLote value) {
        this.loteGuias = value;
    }

    /**
     * Obtém o valor da propriedade loteAnexos.
     * 
     * @return
     *     possible object is
     *     {@link CtAnexoLote }
     *     
     */
    public CtAnexoLote getLoteAnexos() {
        return loteAnexos;
    }

    /**
     * Define o valor da propriedade loteAnexos.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAnexoLote }
     *     
     */
    public void setLoteAnexos(CtAnexoLote value) {
        this.loteAnexos = value;
    }

    /**
     * Obtém o valor da propriedade solicitacaoDemonstrativoRetorno.
     * 
     * @return
     *     possible object is
     *     {@link CtDemonstrativoSolicitacao }
     *     
     */
    public CtDemonstrativoSolicitacao getSolicitacaoDemonstrativoRetorno() {
        return solicitacaoDemonstrativoRetorno;
    }

    /**
     * Define o valor da propriedade solicitacaoDemonstrativoRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDemonstrativoSolicitacao }
     *     
     */
    public void setSolicitacaoDemonstrativoRetorno(CtDemonstrativoSolicitacao value) {
        this.solicitacaoDemonstrativoRetorno = value;
    }

    /**
     * Obtém o valor da propriedade solicitacaoStatusProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link CtProtocoloSolicitacaoStatus }
     *     
     */
    public CtProtocoloSolicitacaoStatus getSolicitacaoStatusProtocolo() {
        return solicitacaoStatusProtocolo;
    }

    /**
     * Define o valor da propriedade solicitacaoStatusProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProtocoloSolicitacaoStatus }
     *     
     */
    public void setSolicitacaoStatusProtocolo(CtProtocoloSolicitacaoStatus value) {
        this.solicitacaoStatusProtocolo = value;
    }

    /**
     * Obtém o valor da propriedade solicitacaoProcedimento.
     * 
     * @return
     *     possible object is
     *     {@link CtSolicitacaoProcedimento }
     *     
     */
    public CtSolicitacaoProcedimento getSolicitacaoProcedimento() {
        return solicitacaoProcedimento;
    }

    /**
     * Define o valor da propriedade solicitacaoProcedimento.
     * 
     * @param value
     *     allowed object is
     *     {@link CtSolicitacaoProcedimento }
     *     
     */
    public void setSolicitacaoProcedimento(CtSolicitacaoProcedimento value) {
        this.solicitacaoProcedimento = value;
    }

    /**
     * Obtém o valor da propriedade solicitaStatusAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link CtAutorizacaoSolicitaStatus }
     *     
     */
    public CtAutorizacaoSolicitaStatus getSolicitaStatusAutorizacao() {
        return solicitaStatusAutorizacao;
    }

    /**
     * Define o valor da propriedade solicitaStatusAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAutorizacaoSolicitaStatus }
     *     
     */
    public void setSolicitaStatusAutorizacao(CtAutorizacaoSolicitaStatus value) {
        this.solicitaStatusAutorizacao = value;
    }

    /**
     * Obtém o valor da propriedade verificaElegibilidade.
     * 
     * @return
     *     possible object is
     *     {@link CtElegibilidadeVerifica }
     *     
     */
    public CtElegibilidadeVerifica getVerificaElegibilidade() {
        return verificaElegibilidade;
    }

    /**
     * Define o valor da propriedade verificaElegibilidade.
     * 
     * @param value
     *     allowed object is
     *     {@link CtElegibilidadeVerifica }
     *     
     */
    public void setVerificaElegibilidade(CtElegibilidadeVerifica value) {
        this.verificaElegibilidade = value;
    }

    /**
     * Obtém o valor da propriedade cancelaGuia.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaCancelamento }
     *     
     */
    public CtGuiaCancelamento getCancelaGuia() {
        return cancelaGuia;
    }

    /**
     * Define o valor da propriedade cancelaGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaCancelamento }
     *     
     */
    public void setCancelaGuia(CtGuiaCancelamento value) {
        this.cancelaGuia = value;
    }

    /**
     * Obtém o valor da propriedade comunicacaoInternacao.
     * 
     * @return
     *     possible object is
     *     {@link CtmBeneficiarioComunicacao }
     *     
     */
    public CtmBeneficiarioComunicacao getComunicacaoInternacao() {
        return comunicacaoInternacao;
    }

    /**
     * Define o valor da propriedade comunicacaoInternacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmBeneficiarioComunicacao }
     *     
     */
    public void setComunicacaoInternacao(CtmBeneficiarioComunicacao value) {
        this.comunicacaoInternacao = value;
    }

    /**
     * Obtém o valor da propriedade recursoGlosa.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaRecursoLote }
     *     
     */
    public CtGuiaRecursoLote getRecursoGlosa() {
        return recursoGlosa;
    }

    /**
     * Define o valor da propriedade recursoGlosa.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaRecursoLote }
     *     
     */
    public void setRecursoGlosa(CtGuiaRecursoLote value) {
        this.recursoGlosa = value;
    }

    /**
     * Obtém o valor da propriedade solicitacaoStatusRecursoGlosa.
     * 
     * @return
     *     possible object is
     *     {@link CtProtocoloSolicitacaoStatus }
     *     
     */
    public CtProtocoloSolicitacaoStatus getSolicitacaoStatusRecursoGlosa() {
        return solicitacaoStatusRecursoGlosa;
    }

    /**
     * Define o valor da propriedade solicitacaoStatusRecursoGlosa.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProtocoloSolicitacaoStatus }
     *     
     */
    public void setSolicitacaoStatusRecursoGlosa(CtProtocoloSolicitacaoStatus value) {
        this.solicitacaoStatusRecursoGlosa = value;
    }

}
