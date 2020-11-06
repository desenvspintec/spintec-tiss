
package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  estrutura utilizada na resposta da operadora sobre a situação do protocolo
 * 
 * <p>Classe Java de ct_protocoloStatus complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_protocoloStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *         &lt;element name="lote">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="detalheLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_loteStatus"/>
 *                   &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
 *                 &lt;/choice>
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
@XmlType(name = "ct_protocoloStatus", propOrder = {
    "identificacaoOperadora",
    "dadosPrestador",
    "lote"
})
public class CtProtocoloStatus {

    @XmlElement(required = true)
    protected String identificacaoOperadora;
    @XmlElement(required = true)
    protected CtContratadoDados dadosPrestador;
    @XmlElement(required = true)
    protected CtProtocoloStatus.Lote lote;

    /**
     * Obtém o valor da propriedade identificacaoOperadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacaoOperadora() {
        return identificacaoOperadora;
    }

    /**
     * Define o valor da propriedade identificacaoOperadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacaoOperadora(String value) {
        this.identificacaoOperadora = value;
    }

    /**
     * Obtém o valor da propriedade dadosPrestador.
     * 
     * @return
     *     possible object is
     *     {@link CtContratadoDados }
     *     
     */
    public CtContratadoDados getDadosPrestador() {
        return dadosPrestador;
    }

    /**
     * Define o valor da propriedade dadosPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link CtContratadoDados }
     *     
     */
    public void setDadosPrestador(CtContratadoDados value) {
        this.dadosPrestador = value;
    }

    /**
     * Obtém o valor da propriedade lote.
     * 
     * @return
     *     possible object is
     *     {@link CtProtocoloStatus.Lote }
     *     
     */
    public CtProtocoloStatus.Lote getLote() {
        return lote;
    }

    /**
     * Define o valor da propriedade lote.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProtocoloStatus.Lote }
     *     
     */
    public void setLote(CtProtocoloStatus.Lote value) {
        this.lote = value;
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
     *         &lt;element name="detalheLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_loteStatus"/>
     *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
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
        "detalheLote",
        "mensagemErro"
    })
    public static class Lote {

        protected CtLoteStatus detalheLote;
        protected CtMotivoGlosa mensagemErro;

        /**
         * Obtém o valor da propriedade detalheLote.
         * 
         * @return
         *     possible object is
         *     {@link CtLoteStatus }
         *     
         */
        public CtLoteStatus getDetalheLote() {
            return detalheLote;
        }

        /**
         * Define o valor da propriedade detalheLote.
         * 
         * @param value
         *     allowed object is
         *     {@link CtLoteStatus }
         *     
         */
        public void setDetalheLote(CtLoteStatus value) {
            this.detalheLote = value;
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

}
