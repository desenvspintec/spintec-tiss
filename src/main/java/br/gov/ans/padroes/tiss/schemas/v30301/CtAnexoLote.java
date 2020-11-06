
package br.gov.ans.padroes.tiss.schemas.v30301;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  estrutura da resposta da operadora a um lote de anexos
 * 
 * <p>Classe Java de ct_anexoLote complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_anexoLote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="AnexosGuiasTISS">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="anexoSituacaoInicial" type="{http://www.ans.gov.br/padroes/tiss/schemas}cto_anexoSituacaoInicial" maxOccurs="100"/>
 *                   &lt;element name="anexoSolicitacaoRadio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitacaoRadio"/>
 *                   &lt;element name="anexoSolicitacaoQuimio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitacaoQuimio"/>
 *                   &lt;element name="anexoSolicitacaoOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitacaoOPME"/>
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
@XmlType(name = "ct_anexoLote", propOrder = {
    "numeroLote",
    "anexosGuiasTISS"
})
public class CtAnexoLote {

    @XmlElement(required = true)
    protected String numeroLote;
    @XmlElement(name = "AnexosGuiasTISS", required = true)
    protected CtAnexoLote.AnexosGuiasTISS anexosGuiasTISS;

    /**
     * Obtém o valor da propriedade numeroLote.
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
     * Obtém o valor da propriedade anexosGuiasTISS.
     * 
     * @return
     *     possible object is
     *     {@link CtAnexoLote.AnexosGuiasTISS }
     *     
     */
    public CtAnexoLote.AnexosGuiasTISS getAnexosGuiasTISS() {
        return anexosGuiasTISS;
    }

    /**
     * Define o valor da propriedade anexosGuiasTISS.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAnexoLote.AnexosGuiasTISS }
     *     
     */
    public void setAnexosGuiasTISS(CtAnexoLote.AnexosGuiasTISS value) {
        this.anexosGuiasTISS = value;
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
     *         &lt;element name="anexoSituacaoInicial" type="{http://www.ans.gov.br/padroes/tiss/schemas}cto_anexoSituacaoInicial" maxOccurs="100"/>
     *         &lt;element name="anexoSolicitacaoRadio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitacaoRadio"/>
     *         &lt;element name="anexoSolicitacaoQuimio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitacaoQuimio"/>
     *         &lt;element name="anexoSolicitacaoOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitacaoOPME"/>
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
        "anexoSituacaoInicial",
        "anexoSolicitacaoRadio",
        "anexoSolicitacaoQuimio",
        "anexoSolicitacaoOPME"
    })
    public static class AnexosGuiasTISS {

        protected List<CtoAnexoSituacaoInicial> anexoSituacaoInicial;
        protected CtmAnexoSolicitacaoRadio anexoSolicitacaoRadio;
        protected CtmAnexoSolicitacaoQuimio anexoSolicitacaoQuimio;
        protected CtmAnexoSolicitacaoOPME anexoSolicitacaoOPME;

        /**
         * Gets the value of the anexoSituacaoInicial property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the anexoSituacaoInicial property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAnexoSituacaoInicial().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtoAnexoSituacaoInicial }
         * 
         * 
         */
        public List<CtoAnexoSituacaoInicial> getAnexoSituacaoInicial() {
            if (anexoSituacaoInicial == null) {
                anexoSituacaoInicial = new ArrayList<CtoAnexoSituacaoInicial>();
            }
            return this.anexoSituacaoInicial;
        }

        /**
         * Obtém o valor da propriedade anexoSolicitacaoRadio.
         * 
         * @return
         *     possible object is
         *     {@link CtmAnexoSolicitacaoRadio }
         *     
         */
        public CtmAnexoSolicitacaoRadio getAnexoSolicitacaoRadio() {
            return anexoSolicitacaoRadio;
        }

        /**
         * Define o valor da propriedade anexoSolicitacaoRadio.
         * 
         * @param value
         *     allowed object is
         *     {@link CtmAnexoSolicitacaoRadio }
         *     
         */
        public void setAnexoSolicitacaoRadio(CtmAnexoSolicitacaoRadio value) {
            this.anexoSolicitacaoRadio = value;
        }

        /**
         * Obtém o valor da propriedade anexoSolicitacaoQuimio.
         * 
         * @return
         *     possible object is
         *     {@link CtmAnexoSolicitacaoQuimio }
         *     
         */
        public CtmAnexoSolicitacaoQuimio getAnexoSolicitacaoQuimio() {
            return anexoSolicitacaoQuimio;
        }

        /**
         * Define o valor da propriedade anexoSolicitacaoQuimio.
         * 
         * @param value
         *     allowed object is
         *     {@link CtmAnexoSolicitacaoQuimio }
         *     
         */
        public void setAnexoSolicitacaoQuimio(CtmAnexoSolicitacaoQuimio value) {
            this.anexoSolicitacaoQuimio = value;
        }

        /**
         * Obtém o valor da propriedade anexoSolicitacaoOPME.
         * 
         * @return
         *     possible object is
         *     {@link CtmAnexoSolicitacaoOPME }
         *     
         */
        public CtmAnexoSolicitacaoOPME getAnexoSolicitacaoOPME() {
            return anexoSolicitacaoOPME;
        }

        /**
         * Define o valor da propriedade anexoSolicitacaoOPME.
         * 
         * @param value
         *     allowed object is
         *     {@link CtmAnexoSolicitacaoOPME }
         *     
         */
        public void setAnexoSolicitacaoOPME(CtmAnexoSolicitacaoOPME value) {
            this.anexoSolicitacaoOPME = value;
        }

    }

}
