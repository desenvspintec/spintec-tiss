
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  estrutura utilizada na resposta da operadora sobre a situa��o do protocolo
 * 
 * <p>Classe Java de ct_protocoloAnexoStatus complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_protocoloAnexoStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *         &lt;element name="loteAnexo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="detalheLoteAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_loteAnexoStatus"/>
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
@XmlType(name = "ct_protocoloAnexoStatus", propOrder = {
    "identificacaoOperadora",
    "dadosPrestador",
    "loteAnexo"
})
public class CtProtocoloAnexoStatus {

    @XmlElement(required = true)
    protected String identificacaoOperadora;
    @XmlElement(required = true)
    protected CtContratadoDados dadosPrestador;
    @XmlElement(required = true)
    protected CtProtocoloAnexoStatus.LoteAnexo loteAnexo;

    /**
     * Obt�m o valor da propriedade identificacaoOperadora.
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
     * Obt�m o valor da propriedade dadosPrestador.
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
     * Obt�m o valor da propriedade loteAnexo.
     * 
     * @return
     *     possible object is
     *     {@link CtProtocoloAnexoStatus.LoteAnexo }
     *     
     */
    public CtProtocoloAnexoStatus.LoteAnexo getLoteAnexo() {
        return loteAnexo;
    }

    /**
     * Define o valor da propriedade loteAnexo.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProtocoloAnexoStatus.LoteAnexo }
     *     
     */
    public void setLoteAnexo(CtProtocoloAnexoStatus.LoteAnexo value) {
        this.loteAnexo = value;
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
     *         &lt;element name="detalheLoteAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_loteAnexoStatus"/>
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
        "detalheLoteAnexo",
        "mensagemErro"
    })
    public static class LoteAnexo {

        protected CtLoteAnexoStatus detalheLoteAnexo;
        protected CtMotivoGlosa mensagemErro;

        /**
         * Obt�m o valor da propriedade detalheLoteAnexo.
         * 
         * @return
         *     possible object is
         *     {@link CtLoteAnexoStatus }
         *     
         */
        public CtLoteAnexoStatus getDetalheLoteAnexo() {
            return detalheLoteAnexo;
        }

        /**
         * Define o valor da propriedade detalheLoteAnexo.
         * 
         * @param value
         *     allowed object is
         *     {@link CtLoteAnexoStatus }
         *     
         */
        public void setDetalheLoteAnexo(CtLoteAnexoStatus value) {
            this.detalheLoteAnexo = value;
        }

        /**
         * Obt�m o valor da propriedade mensagemErro.
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
