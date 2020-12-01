
package br.gov.ans.padroes.tiss.schemas.v30500;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_respostaGlosa complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_respostaGlosa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="reciboGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_glosaRecibo"/>
 *         &lt;element name="reciboGlosaOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_glosaReciboOdonto"/>
 *         &lt;element name="reciboGlosaStatus">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nrProtocoloRecursoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *                   &lt;element name="dataEnvioRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="dataRecebimentoRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *                   &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *                   &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *                   &lt;element name="nrProtocoloSituacaoRecursoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *                   &lt;element name="dataSituacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="situacaoProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusProtocolo"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "ct_respostaGlosa", propOrder = {
    "reciboGlosa",
    "reciboGlosaOdonto",
    "reciboGlosaStatus",
    "mensagemErro"
})
public class CtRespostaGlosa {

    protected CtGlosaRecibo reciboGlosa;
    protected CtGlosaReciboOdonto reciboGlosaOdonto;
    protected CtRespostaGlosa.ReciboGlosaStatus reciboGlosaStatus;
    protected CtMotivoGlosa mensagemErro;

    /**
     * Obt�m o valor da propriedade reciboGlosa.
     * 
     * @return
     *     possible object is
     *     {@link CtGlosaRecibo }
     *     
     */
    public CtGlosaRecibo getReciboGlosa() {
        return reciboGlosa;
    }

    /**
     * Define o valor da propriedade reciboGlosa.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGlosaRecibo }
     *     
     */
    public void setReciboGlosa(CtGlosaRecibo value) {
        this.reciboGlosa = value;
    }

    /**
     * Obt�m o valor da propriedade reciboGlosaOdonto.
     * 
     * @return
     *     possible object is
     *     {@link CtGlosaReciboOdonto }
     *     
     */
    public CtGlosaReciboOdonto getReciboGlosaOdonto() {
        return reciboGlosaOdonto;
    }

    /**
     * Define o valor da propriedade reciboGlosaOdonto.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGlosaReciboOdonto }
     *     
     */
    public void setReciboGlosaOdonto(CtGlosaReciboOdonto value) {
        this.reciboGlosaOdonto = value;
    }

    /**
     * Obt�m o valor da propriedade reciboGlosaStatus.
     * 
     * @return
     *     possible object is
     *     {@link CtRespostaGlosa.ReciboGlosaStatus }
     *     
     */
    public CtRespostaGlosa.ReciboGlosaStatus getReciboGlosaStatus() {
        return reciboGlosaStatus;
    }

    /**
     * Define o valor da propriedade reciboGlosaStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link CtRespostaGlosa.ReciboGlosaStatus }
     *     
     */
    public void setReciboGlosaStatus(CtRespostaGlosa.ReciboGlosaStatus value) {
        this.reciboGlosaStatus = value;
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
     *         &lt;element name="nrProtocoloRecursoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
     *         &lt;element name="dataEnvioRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *         &lt;element name="dataRecebimentoRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
     *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
     *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
     *         &lt;element name="nrProtocoloSituacaoRecursoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
     *         &lt;element name="dataSituacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *         &lt;element name="situacaoProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusProtocolo"/>
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
        "nrProtocoloRecursoGlosa",
        "dataEnvioRecurso",
        "dataRecebimentoRecurso",
        "numeroLote",
        "registroANS",
        "dadosPrestador",
        "nrProtocoloSituacaoRecursoGlosa",
        "dataSituacao",
        "situacaoProtocolo"
    })
    public static class ReciboGlosaStatus {

        @XmlElement(required = true)
        protected String nrProtocoloRecursoGlosa;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dataEnvioRecurso;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dataRecebimentoRecurso;
        @XmlElement(required = true)
        protected String numeroLote;
        @XmlElement(required = true)
        protected String registroANS;
        @XmlElement(required = true)
        protected CtContratadoDados dadosPrestador;
        @XmlElement(required = true)
        protected String nrProtocoloSituacaoRecursoGlosa;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dataSituacao;
        @XmlElement(required = true)
        protected String situacaoProtocolo;

        /**
         * Obt�m o valor da propriedade nrProtocoloRecursoGlosa.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNrProtocoloRecursoGlosa() {
            return nrProtocoloRecursoGlosa;
        }

        /**
         * Define o valor da propriedade nrProtocoloRecursoGlosa.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNrProtocoloRecursoGlosa(String value) {
            this.nrProtocoloRecursoGlosa = value;
        }

        /**
         * Obt�m o valor da propriedade dataEnvioRecurso.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataEnvioRecurso() {
            return dataEnvioRecurso;
        }

        /**
         * Define o valor da propriedade dataEnvioRecurso.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataEnvioRecurso(XMLGregorianCalendar value) {
            this.dataEnvioRecurso = value;
        }

        /**
         * Obt�m o valor da propriedade dataRecebimentoRecurso.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataRecebimentoRecurso() {
            return dataRecebimentoRecurso;
        }

        /**
         * Define o valor da propriedade dataRecebimentoRecurso.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataRecebimentoRecurso(XMLGregorianCalendar value) {
            this.dataRecebimentoRecurso = value;
        }

        /**
         * Obt�m o valor da propriedade numeroLote.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroLote() {
            return numeroLote;
        }

        /**
         * Define o valor da propriedade numeroLote.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroLote(String value) {
            this.numeroLote = value;
        }

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
         * Obt�m o valor da propriedade nrProtocoloSituacaoRecursoGlosa.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNrProtocoloSituacaoRecursoGlosa() {
            return nrProtocoloSituacaoRecursoGlosa;
        }

        /**
         * Define o valor da propriedade nrProtocoloSituacaoRecursoGlosa.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNrProtocoloSituacaoRecursoGlosa(String value) {
            this.nrProtocoloSituacaoRecursoGlosa = value;
        }

        /**
         * Obt�m o valor da propriedade dataSituacao.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataSituacao() {
            return dataSituacao;
        }

        /**
         * Define o valor da propriedade dataSituacao.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataSituacao(XMLGregorianCalendar value) {
            this.dataSituacao = value;
        }

        /**
         * Obt�m o valor da propriedade situacaoProtocolo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSituacaoProtocolo() {
            return situacaoProtocolo;
        }

        /**
         * Define o valor da propriedade situacaoProtocolo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSituacaoProtocolo(String value) {
            this.situacaoProtocolo = value;
        }

    }

}
