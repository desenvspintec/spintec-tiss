
package br.gov.ans.padroes.tiss.schemas.v30500;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_demonstrativoRetorno complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_demonstrativoRetorno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
 *         &lt;element name="demonstrativoAnaliseConta" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_demonstrativoAnaliseConta" maxOccurs="30"/>
 *         &lt;element name="demonstrativoPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_demonstrativoPagamento"/>
 *         &lt;element name="demonstrativoPagamentoOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}cto_demonstrativoOdontologia"/>
 *         &lt;element name="situacaoDemonstrativoRetorno">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="identificacaoOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *                   &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *                   &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *                   &lt;element name="protocoloSolicitacaoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *                   &lt;element name="tipoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoDemonstrativo"/>
 *                   &lt;element name="dataSituacaoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="situacaoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusProtocolo"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_demonstrativoRetorno", propOrder = {
    "mensagemErro",
    "demonstrativoAnaliseConta",
    "demonstrativoPagamento",
    "demonstrativoPagamentoOdonto",
    "situacaoDemonstrativoRetorno"
})
public class CtDemonstrativoRetorno {

    protected CtMotivoGlosa mensagemErro;
    protected List<CtmDemonstrativoAnaliseConta> demonstrativoAnaliseConta;
    protected CtmDemonstrativoPagamento demonstrativoPagamento;
    protected CtoDemonstrativoOdontologia demonstrativoPagamentoOdonto;
    protected CtDemonstrativoRetorno.SituacaoDemonstrativoRetorno situacaoDemonstrativoRetorno;

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

    /**
     * Gets the value of the demonstrativoAnaliseConta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demonstrativoAnaliseConta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDemonstrativoAnaliseConta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtmDemonstrativoAnaliseConta }
     * 
     * 
     */
    public List<CtmDemonstrativoAnaliseConta> getDemonstrativoAnaliseConta() {
        if (demonstrativoAnaliseConta == null) {
            demonstrativoAnaliseConta = new ArrayList<CtmDemonstrativoAnaliseConta>();
        }
        return this.demonstrativoAnaliseConta;
    }

    /**
     * Obt�m o valor da propriedade demonstrativoPagamento.
     * 
     * @return
     *     possible object is
     *     {@link CtmDemonstrativoPagamento }
     *     
     */
    public CtmDemonstrativoPagamento getDemonstrativoPagamento() {
        return demonstrativoPagamento;
    }

    /**
     * Define o valor da propriedade demonstrativoPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmDemonstrativoPagamento }
     *     
     */
    public void setDemonstrativoPagamento(CtmDemonstrativoPagamento value) {
        this.demonstrativoPagamento = value;
    }

    /**
     * Obt�m o valor da propriedade demonstrativoPagamentoOdonto.
     * 
     * @return
     *     possible object is
     *     {@link CtoDemonstrativoOdontologia }
     *     
     */
    public CtoDemonstrativoOdontologia getDemonstrativoPagamentoOdonto() {
        return demonstrativoPagamentoOdonto;
    }

    /**
     * Define o valor da propriedade demonstrativoPagamentoOdonto.
     * 
     * @param value
     *     allowed object is
     *     {@link CtoDemonstrativoOdontologia }
     *     
     */
    public void setDemonstrativoPagamentoOdonto(CtoDemonstrativoOdontologia value) {
        this.demonstrativoPagamentoOdonto = value;
    }

    /**
     * Obt�m o valor da propriedade situacaoDemonstrativoRetorno.
     * 
     * @return
     *     possible object is
     *     {@link CtDemonstrativoRetorno.SituacaoDemonstrativoRetorno }
     *     
     */
    public CtDemonstrativoRetorno.SituacaoDemonstrativoRetorno getSituacaoDemonstrativoRetorno() {
        return situacaoDemonstrativoRetorno;
    }

    /**
     * Define o valor da propriedade situacaoDemonstrativoRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDemonstrativoRetorno.SituacaoDemonstrativoRetorno }
     *     
     */
    public void setSituacaoDemonstrativoRetorno(CtDemonstrativoRetorno.SituacaoDemonstrativoRetorno value) {
        this.situacaoDemonstrativoRetorno = value;
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
     *         &lt;element name="identificacaoOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
     *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
     *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
     *         &lt;element name="protocoloSolicitacaoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
     *         &lt;element name="tipoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoDemonstrativo"/>
     *         &lt;element name="dataSituacaoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *         &lt;element name="situacaoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusProtocolo"/>
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
        "identificacaoOperadora",
        "dadosPrestador",
        "numeroProtocolo",
        "protocoloSolicitacaoDemonstrativo",
        "tipoDemonstrativo",
        "dataSituacaoDemonstrativo",
        "situacaoDemonstrativo"
    })
    public static class SituacaoDemonstrativoRetorno {

        @XmlElement(required = true)
        protected String identificacaoOperadora;
        @XmlElement(required = true)
        protected CtContratadoDados dadosPrestador;
        @XmlElement(required = true)
        protected String numeroProtocolo;
        @XmlElement(required = true)
        protected String protocoloSolicitacaoDemonstrativo;
        @XmlElement(required = true)
        protected String tipoDemonstrativo;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dataSituacaoDemonstrativo;
        @XmlElement(required = true)
        protected String situacaoDemonstrativo;

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
         * Obt�m o valor da propriedade numeroProtocolo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroProtocolo() {
            return numeroProtocolo;
        }

        /**
         * Define o valor da propriedade numeroProtocolo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroProtocolo(String value) {
            this.numeroProtocolo = value;
        }

        /**
         * Obt�m o valor da propriedade protocoloSolicitacaoDemonstrativo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtocoloSolicitacaoDemonstrativo() {
            return protocoloSolicitacaoDemonstrativo;
        }

        /**
         * Define o valor da propriedade protocoloSolicitacaoDemonstrativo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProtocoloSolicitacaoDemonstrativo(String value) {
            this.protocoloSolicitacaoDemonstrativo = value;
        }

        /**
         * Obt�m o valor da propriedade tipoDemonstrativo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoDemonstrativo() {
            return tipoDemonstrativo;
        }

        /**
         * Define o valor da propriedade tipoDemonstrativo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoDemonstrativo(String value) {
            this.tipoDemonstrativo = value;
        }

        /**
         * Obt�m o valor da propriedade dataSituacaoDemonstrativo.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataSituacaoDemonstrativo() {
            return dataSituacaoDemonstrativo;
        }

        /**
         * Define o valor da propriedade dataSituacaoDemonstrativo.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataSituacaoDemonstrativo(XMLGregorianCalendar value) {
            this.dataSituacaoDemonstrativo = value;
        }

        /**
         * Obt�m o valor da propriedade situacaoDemonstrativo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSituacaoDemonstrativo() {
            return situacaoDemonstrativo;
        }

        /**
         * Define o valor da propriedade situacaoDemonstrativo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSituacaoDemonstrativo(String value) {
            this.situacaoDemonstrativo = value;
        }

    }

}
