
package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ctm_beneficiarioComunicacaoRecibo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ctm_beneficiarioComunicacaoRecibo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusComunicacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
 *         &lt;element name="beneficiarioComunicacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_beneficiarioComunicacao"/>
 *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_beneficiarioComunicacaoRecibo", propOrder = {
    "statusComunicacao",
    "beneficiarioComunicacao",
    "mensagemErro"
})
public class CtmBeneficiarioComunicacaoRecibo {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DmSimNao statusComunicacao;
    @XmlElement(required = true)
    protected CtmBeneficiarioComunicacao beneficiarioComunicacao;
    protected CtMotivoGlosa mensagemErro;

    /**
     * Obtém o valor da propriedade statusComunicacao.
     * 
     * @return
     *     possible object is
     *     {@link DmSimNao }
     *     
     */
    public DmSimNao getStatusComunicacao() {
        return statusComunicacao;
    }

    /**
     * Define o valor da propriedade statusComunicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSimNao }
     *     
     */
    public void setStatusComunicacao(DmSimNao value) {
        this.statusComunicacao = value;
    }

    /**
     * Obtém o valor da propriedade beneficiarioComunicacao.
     * 
     * @return
     *     possible object is
     *     {@link CtmBeneficiarioComunicacao }
     *     
     */
    public CtmBeneficiarioComunicacao getBeneficiarioComunicacao() {
        return beneficiarioComunicacao;
    }

    /**
     * Define o valor da propriedade beneficiarioComunicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmBeneficiarioComunicacao }
     *     
     */
    public void setBeneficiarioComunicacao(CtmBeneficiarioComunicacao value) {
        this.beneficiarioComunicacao = value;
    }

    /**
     * Obtém o valor da propriedade mensagemErro.
     * 
     * @return
     *     possible object is
     *     {@link CtMotivoGlosa }
     *     
     */
    public CtMotivoGlosa getMensagemErro() {
        return mensagemErro;
    }

    /**
     * Define o valor da propriedade mensagemErro.
     * 
     * @param value
     *     allowed object is
     *     {@link CtMotivoGlosa }
     *     
     */
    public void setMensagemErro(CtMotivoGlosa value) {
        this.mensagemErro = value;
    }

}
