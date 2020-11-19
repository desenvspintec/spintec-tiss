
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cto_anexoSituacaoInicialnaGTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cto_anexoSituacaoInicialnaGTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroGuiaAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="numeroGuiaReferenciada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="ct_situacaoInicial">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="situacaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_situacaoClinica"/>
 *                   &lt;element name="doencaPeriodontal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_logico" minOccurs="0"/>
 *                   &lt;element name="alteracaoTecidoMole" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_logico" minOccurs="0"/>
 *                   &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *                 &lt;/sequence>
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
@XmlType(name = "cto_anexoSituacaoInicialnaGTO", propOrder = {
    "numeroGuiaAnexo",
    "numeroGuiaReferenciada",
    "numeroGuiaOperadora",
    "ctSituacaoInicial"
})
public class CtoAnexoSituacaoInicialnaGTO {

    @XmlElement(required = true)
    protected String numeroGuiaAnexo;
    @XmlElement(required = true)
    protected String numeroGuiaReferenciada;
    protected String numeroGuiaOperadora;
    @XmlElement(name = "ct_situacaoInicial", required = true)
    protected CtoAnexoSituacaoInicialnaGTO.CtSituacaoInicial ctSituacaoInicial;

    /**
     * Obt�m o valor da propriedade numeroGuiaAnexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaAnexo() {
        return numeroGuiaAnexo;
    }

    /**
     * Define o valor da propriedade numeroGuiaAnexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaAnexo(String value) {
        this.numeroGuiaAnexo = value;
    }

    /**
     * Obt�m o valor da propriedade numeroGuiaReferenciada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaReferenciada() {
        return numeroGuiaReferenciada;
    }

    /**
     * Define o valor da propriedade numeroGuiaReferenciada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaReferenciada(String value) {
        this.numeroGuiaReferenciada = value;
    }

    /**
     * Obt�m o valor da propriedade numeroGuiaOperadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaOperadora() {
        return numeroGuiaOperadora;
    }

    /**
     * Define o valor da propriedade numeroGuiaOperadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaOperadora(String value) {
        this.numeroGuiaOperadora = value;
    }

    /**
     * Obt�m o valor da propriedade ctSituacaoInicial.
     * 
     * @return
     *     possible object is
     *     {@link CtoAnexoSituacaoInicialnaGTO.CtSituacaoInicial }
     *     
     */
    public CtoAnexoSituacaoInicialnaGTO.CtSituacaoInicial getCtSituacaoInicial() {
        return ctSituacaoInicial;
    }

    /**
     * Define o valor da propriedade ctSituacaoInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link CtoAnexoSituacaoInicialnaGTO.CtSituacaoInicial }
     *     
     */
    public void setCtSituacaoInicial(CtoAnexoSituacaoInicialnaGTO.CtSituacaoInicial value) {
        this.ctSituacaoInicial = value;
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
     *         &lt;element name="situacaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_situacaoClinica"/>
     *         &lt;element name="doencaPeriodontal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_logico" minOccurs="0"/>
     *         &lt;element name="alteracaoTecidoMole" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_logico" minOccurs="0"/>
     *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
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
        "situacaoClinica",
        "doencaPeriodontal",
        "alteracaoTecidoMole",
        "observacao"
    })
    public static class CtSituacaoInicial {

        @XmlElement(required = true)
        protected CtSituacaoClinica situacaoClinica;
        protected Boolean doencaPeriodontal;
        protected Boolean alteracaoTecidoMole;
        protected String observacao;

        /**
         * Obt�m o valor da propriedade situacaoClinica.
         * 
         * @return
         *     possible object is
         *     {@link CtSituacaoClinica }
         *     
         */
        public CtSituacaoClinica getSituacaoClinica() {
            return situacaoClinica;
        }

        /**
         * Define o valor da propriedade situacaoClinica.
         * 
         * @param value
         *     allowed object is
         *     {@link CtSituacaoClinica }
         *     
         */
        public void setSituacaoClinica(CtSituacaoClinica value) {
            this.situacaoClinica = value;
        }

        /**
         * Obt�m o valor da propriedade doencaPeriodontal.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDoencaPeriodontal() {
            return doencaPeriodontal;
        }

        /**
         * Define o valor da propriedade doencaPeriodontal.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDoencaPeriodontal(Boolean value) {
            this.doencaPeriodontal = value;
        }

        /**
         * Obt�m o valor da propriedade alteracaoTecidoMole.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAlteracaoTecidoMole() {
            return alteracaoTecidoMole;
        }

        /**
         * Define o valor da propriedade alteracaoTecidoMole.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAlteracaoTecidoMole(Boolean value) {
            this.alteracaoTecidoMole = value;
        }

        /**
         * Obt�m o valor da propriedade observacao.
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

    }

}
