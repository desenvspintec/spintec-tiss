
package br.gov.ans.padroes.tiss.schemas.v30301;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de operadoraPrestador complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="operadoraPrestador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="recebimentoLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_recebimentoLote" minOccurs="0"/>
 *         &lt;element name="recebimentoAnexo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
 *                   &lt;element name="protocoloRecebimentoAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_anexoRecebimento"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="recebimentoRecursoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_recebimentoRecurso" minOccurs="0"/>
 *         &lt;element name="demonstrativosRetorno" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_demonstrativoRetorno" minOccurs="0"/>
 *         &lt;element name="situacaoProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_situacaoProtocolo" minOccurs="0"/>
 *         &lt;element name="autorizacaoServicos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_situacaoAutorizacao" minOccurs="0"/>
 *         &lt;element name="situacaoAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_situacaoAutorizacao" minOccurs="0"/>
 *         &lt;element name="respostaElegibilidade" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
 *                   &lt;element name="reciboElegibilidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_elegibilidadeRecibo"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="reciboCancelaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_reciboCancelaGuia" minOccurs="0"/>
 *         &lt;element name="reciboComunicacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_reciboComunicacao" minOccurs="0"/>
 *         &lt;element name="respostaRecursoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_respostaGlosa" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operadoraPrestador", propOrder = {
    "recebimentoLote",
    "recebimentoAnexo",
    "recebimentoRecursoGlosa",
    "demonstrativosRetorno",
    "situacaoProtocolo",
    "autorizacaoServicos",
    "situacaoAutorizacao",
    "respostaElegibilidade",
    "reciboCancelaGuia",
    "reciboComunicacao",
    "respostaRecursoGlosa"
})
public class OperadoraPrestador {

    protected CtRecebimentoLote recebimentoLote;
    protected OperadoraPrestador.RecebimentoAnexo recebimentoAnexo;
    protected CtRecebimentoRecurso recebimentoRecursoGlosa;
    protected CtDemonstrativoRetorno demonstrativosRetorno;
    protected CtSituacaoProtocolo situacaoProtocolo;
    protected CtSituacaoAutorizacao autorizacaoServicos;
    protected CtSituacaoAutorizacao situacaoAutorizacao;
    protected OperadoraPrestador.RespostaElegibilidade respostaElegibilidade;
    protected CtReciboCancelaGuia reciboCancelaGuia;
    protected CtReciboComunicacao reciboComunicacao;
    protected CtRespostaGlosa respostaRecursoGlosa;

    /**
     * Obtém o valor da propriedade recebimentoLote.
     * 
     * @return
     *     possible object is
     *     {@link CtRecebimentoLote }
     *     
     */
    public CtRecebimentoLote getRecebimentoLote() {
        return recebimentoLote;
    }

    /**
     * Define o valor da propriedade recebimentoLote.
     * 
     * @param value
     *     allowed object is
     *     {@link CtRecebimentoLote }
     *     
     */
    public void setRecebimentoLote(CtRecebimentoLote value) {
        this.recebimentoLote = value;
    }

    /**
     * Obtém o valor da propriedade recebimentoAnexo.
     * 
     * @return
     *     possible object is
     *     {@link OperadoraPrestador.RecebimentoAnexo }
     *     
     */
    public OperadoraPrestador.RecebimentoAnexo getRecebimentoAnexo() {
        return recebimentoAnexo;
    }

    /**
     * Define o valor da propriedade recebimentoAnexo.
     * 
     * @param value
     *     allowed object is
     *     {@link OperadoraPrestador.RecebimentoAnexo }
     *     
     */
    public void setRecebimentoAnexo(OperadoraPrestador.RecebimentoAnexo value) {
        this.recebimentoAnexo = value;
    }

    /**
     * Obtém o valor da propriedade recebimentoRecursoGlosa.
     * 
     * @return
     *     possible object is
     *     {@link CtRecebimentoRecurso }
     *     
     */
    public CtRecebimentoRecurso getRecebimentoRecursoGlosa() {
        return recebimentoRecursoGlosa;
    }

    /**
     * Define o valor da propriedade recebimentoRecursoGlosa.
     * 
     * @param value
     *     allowed object is
     *     {@link CtRecebimentoRecurso }
     *     
     */
    public void setRecebimentoRecursoGlosa(CtRecebimentoRecurso value) {
        this.recebimentoRecursoGlosa = value;
    }

    /**
     * Obtém o valor da propriedade demonstrativosRetorno.
     * 
     * @return
     *     possible object is
     *     {@link CtDemonstrativoRetorno }
     *     
     */
    public CtDemonstrativoRetorno getDemonstrativosRetorno() {
        return demonstrativosRetorno;
    }

    /**
     * Define o valor da propriedade demonstrativosRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDemonstrativoRetorno }
     *     
     */
    public void setDemonstrativosRetorno(CtDemonstrativoRetorno value) {
        this.demonstrativosRetorno = value;
    }

    /**
     * Obtém o valor da propriedade situacaoProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link CtSituacaoProtocolo }
     *     
     */
    public CtSituacaoProtocolo getSituacaoProtocolo() {
        return situacaoProtocolo;
    }

    /**
     * Define o valor da propriedade situacaoProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link CtSituacaoProtocolo }
     *     
     */
    public void setSituacaoProtocolo(CtSituacaoProtocolo value) {
        this.situacaoProtocolo = value;
    }

    /**
     * Obtém o valor da propriedade autorizacaoServicos.
     * 
     * @return
     *     possible object is
     *     {@link CtSituacaoAutorizacao }
     *     
     */
    public CtSituacaoAutorizacao getAutorizacaoServicos() {
        return autorizacaoServicos;
    }

    /**
     * Define o valor da propriedade autorizacaoServicos.
     * 
     * @param value
     *     allowed object is
     *     {@link CtSituacaoAutorizacao }
     *     
     */
    public void setAutorizacaoServicos(CtSituacaoAutorizacao value) {
        this.autorizacaoServicos = value;
    }

    /**
     * Obtém o valor da propriedade situacaoAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link CtSituacaoAutorizacao }
     *     
     */
    public CtSituacaoAutorizacao getSituacaoAutorizacao() {
        return situacaoAutorizacao;
    }

    /**
     * Define o valor da propriedade situacaoAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtSituacaoAutorizacao }
     *     
     */
    public void setSituacaoAutorizacao(CtSituacaoAutorizacao value) {
        this.situacaoAutorizacao = value;
    }

    /**
     * Obtém o valor da propriedade respostaElegibilidade.
     * 
     * @return
     *     possible object is
     *     {@link OperadoraPrestador.RespostaElegibilidade }
     *     
     */
    public OperadoraPrestador.RespostaElegibilidade getRespostaElegibilidade() {
        return respostaElegibilidade;
    }

    /**
     * Define o valor da propriedade respostaElegibilidade.
     * 
     * @param value
     *     allowed object is
     *     {@link OperadoraPrestador.RespostaElegibilidade }
     *     
     */
    public void setRespostaElegibilidade(OperadoraPrestador.RespostaElegibilidade value) {
        this.respostaElegibilidade = value;
    }

    /**
     * Obtém o valor da propriedade reciboCancelaGuia.
     * 
     * @return
     *     possible object is
     *     {@link CtReciboCancelaGuia }
     *     
     */
    public CtReciboCancelaGuia getReciboCancelaGuia() {
        return reciboCancelaGuia;
    }

    /**
     * Define o valor da propriedade reciboCancelaGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link CtReciboCancelaGuia }
     *     
     */
    public void setReciboCancelaGuia(CtReciboCancelaGuia value) {
        this.reciboCancelaGuia = value;
    }

    /**
     * Obtém o valor da propriedade reciboComunicacao.
     * 
     * @return
     *     possible object is
     *     {@link CtReciboComunicacao }
     *     
     */
    public CtReciboComunicacao getReciboComunicacao() {
        return reciboComunicacao;
    }

    /**
     * Define o valor da propriedade reciboComunicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtReciboComunicacao }
     *     
     */
    public void setReciboComunicacao(CtReciboComunicacao value) {
        this.reciboComunicacao = value;
    }

    /**
     * Obtém o valor da propriedade respostaRecursoGlosa.
     * 
     * @return
     *     possible object is
     *     {@link CtRespostaGlosa }
     *     
     */
    public CtRespostaGlosa getRespostaRecursoGlosa() {
        return respostaRecursoGlosa;
    }

    /**
     * Define o valor da propriedade respostaRecursoGlosa.
     * 
     * @param value
     *     allowed object is
     *     {@link CtRespostaGlosa }
     *     
     */
    public void setRespostaRecursoGlosa(CtRespostaGlosa value) {
        this.respostaRecursoGlosa = value;
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
     *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
     *         &lt;element name="protocoloRecebimentoAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_anexoRecebimento"/>
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
        "mensagemErro",
        "protocoloRecebimentoAnexo"
    })
    public static class RecebimentoAnexo {

        protected CtMotivoGlosa mensagemErro;
        protected CtAnexoRecebimento protocoloRecebimentoAnexo;

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

        /**
         * Obtém o valor da propriedade protocoloRecebimentoAnexo.
         * 
         * @return
         *     possible object is
         *     {@link CtAnexoRecebimento }
         *     
         */
        public CtAnexoRecebimento getProtocoloRecebimentoAnexo() {
            return protocoloRecebimentoAnexo;
        }

        /**
         * Define o valor da propriedade protocoloRecebimentoAnexo.
         * 
         * @param value
         *     allowed object is
         *     {@link CtAnexoRecebimento }
         *     
         */
        public void setProtocoloRecebimentoAnexo(CtAnexoRecebimento value) {
            this.protocoloRecebimentoAnexo = value;
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
     *       &lt;choice>
     *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
     *         &lt;element name="reciboElegibilidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_elegibilidadeRecibo"/>
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
        "mensagemErro",
        "reciboElegibilidade"
    })
    public static class RespostaElegibilidade {

        protected CtMotivoGlosa mensagemErro;
        protected CtElegibilidadeRecibo reciboElegibilidade;

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

        /**
         * Obtém o valor da propriedade reciboElegibilidade.
         * 
         * @return
         *     possible object is
         *     {@link CtElegibilidadeRecibo }
         *     
         */
        public CtElegibilidadeRecibo getReciboElegibilidade() {
            return reciboElegibilidade;
        }

        /**
         * Define o valor da propriedade reciboElegibilidade.
         * 
         * @param value
         *     allowed object is
         *     {@link CtElegibilidadeRecibo }
         *     
         */
        public void setReciboElegibilidade(CtElegibilidadeRecibo value) {
            this.reciboElegibilidade = value;
        }

    }

}
