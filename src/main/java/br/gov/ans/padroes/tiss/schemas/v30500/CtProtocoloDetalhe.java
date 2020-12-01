
package br.gov.ans.padroes.tiss.schemas.v30500;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_protocoloDetalhe complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_protocoloDetalhe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="valorTotalProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="glosaProtocolo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="motivosGlosa">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="vlGlosaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosGuiasProtocolo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="dadosGuias" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaDados" maxOccurs="unbounded"/>
 *                   &lt;element name="dadosGuiasOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaDadosOdonto" maxOccurs="unbounded"/>
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
@XmlType(name = "ct_protocoloDetalhe", propOrder = {
    "numeroProtocolo",
    "valorTotalProtocolo",
    "glosaProtocolo",
    "dadosGuiasProtocolo"
})
public class CtProtocoloDetalhe {

    @XmlElement(required = true)
    protected String numeroProtocolo;
    @XmlElement(required = true)
    protected BigDecimal valorTotalProtocolo;
    protected CtProtocoloDetalhe.GlosaProtocolo glosaProtocolo;
    @XmlElement(required = true)
    protected CtProtocoloDetalhe.DadosGuiasProtocolo dadosGuiasProtocolo;

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
     * Obt�m o valor da propriedade valorTotalProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalProtocolo() {
        return valorTotalProtocolo;
    }

    /**
     * Define o valor da propriedade valorTotalProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalProtocolo(BigDecimal value) {
        this.valorTotalProtocolo = value;
    }

    /**
     * Obt�m o valor da propriedade glosaProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link CtProtocoloDetalhe.GlosaProtocolo }
     *     
     */
    public CtProtocoloDetalhe.GlosaProtocolo getGlosaProtocolo() {
        return glosaProtocolo;
    }

    /**
     * Define o valor da propriedade glosaProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProtocoloDetalhe.GlosaProtocolo }
     *     
     */
    public void setGlosaProtocolo(CtProtocoloDetalhe.GlosaProtocolo value) {
        this.glosaProtocolo = value;
    }

    /**
     * Obt�m o valor da propriedade dadosGuiasProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link CtProtocoloDetalhe.DadosGuiasProtocolo }
     *     
     */
    public CtProtocoloDetalhe.DadosGuiasProtocolo getDadosGuiasProtocolo() {
        return dadosGuiasProtocolo;
    }

    /**
     * Define o valor da propriedade dadosGuiasProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProtocoloDetalhe.DadosGuiasProtocolo }
     *     
     */
    public void setDadosGuiasProtocolo(CtProtocoloDetalhe.DadosGuiasProtocolo value) {
        this.dadosGuiasProtocolo = value;
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
     *         &lt;element name="dadosGuias" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaDados" maxOccurs="unbounded"/>
     *         &lt;element name="dadosGuiasOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaDadosOdonto" maxOccurs="unbounded"/>
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
        "dadosGuias",
        "dadosGuiasOdonto"
    })
    public static class DadosGuiasProtocolo {

        protected List<CtGuiaDados> dadosGuias;
        protected List<CtGuiaDadosOdonto> dadosGuiasOdonto;

        /**
         * Gets the value of the dadosGuias property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dadosGuias property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDadosGuias().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtGuiaDados }
         * 
         * 
         */
        public List<CtGuiaDados> getDadosGuias() {
            if (dadosGuias == null) {
                dadosGuias = new ArrayList<CtGuiaDados>();
            }
            return this.dadosGuias;
        }

        /**
         * Gets the value of the dadosGuiasOdonto property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dadosGuiasOdonto property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDadosGuiasOdonto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtGuiaDadosOdonto }
         * 
         * 
         */
        public List<CtGuiaDadosOdonto> getDadosGuiasOdonto() {
            if (dadosGuiasOdonto == null) {
                dadosGuiasOdonto = new ArrayList<CtGuiaDadosOdonto>();
            }
            return this.dadosGuiasOdonto;
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
     *       &lt;sequence>
     *         &lt;element name="motivosGlosa">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="vlGlosaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
        "motivosGlosa",
        "vlGlosaProtocolo"
    })
    public static class GlosaProtocolo {

        @XmlElement(required = true)
        protected CtProtocoloDetalhe.GlosaProtocolo.MotivosGlosa motivosGlosa;
        @XmlElement(required = true)
        protected BigDecimal vlGlosaProtocolo;

        /**
         * Obt�m o valor da propriedade motivosGlosa.
         * 
         * @return
         *     possible object is
         *     {@link CtProtocoloDetalhe.GlosaProtocolo.MotivosGlosa }
         *     
         */
        public CtProtocoloDetalhe.GlosaProtocolo.MotivosGlosa getMotivosGlosa() {
            return motivosGlosa;
        }

        /**
         * Define o valor da propriedade motivosGlosa.
         * 
         * @param value
         *     allowed object is
         *     {@link CtProtocoloDetalhe.GlosaProtocolo.MotivosGlosa }
         *     
         */
        public void setMotivosGlosa(CtProtocoloDetalhe.GlosaProtocolo.MotivosGlosa value) {
            this.motivosGlosa = value;
        }

        /**
         * Obt�m o valor da propriedade vlGlosaProtocolo.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVlGlosaProtocolo() {
            return vlGlosaProtocolo;
        }

        /**
         * Define o valor da propriedade vlGlosaProtocolo.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVlGlosaProtocolo(BigDecimal value) {
            this.vlGlosaProtocolo = value;
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
         *         &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
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
            "motivoGlosa"
        })
        public static class MotivosGlosa {

            @XmlElement(required = true)
            protected List<CtMotivoGlosa> motivoGlosa;

            /**
             * Gets the value of the motivoGlosa property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the motivoGlosa property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMotivoGlosa().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CtMotivoGlosa }
             * 
             * 
             */
            public List<CtMotivoGlosa> getMotivoGlosa() {
                if (motivoGlosa == null) {
                    motivoGlosa = new ArrayList<CtMotivoGlosa>();
                }
                return this.motivoGlosa;
            }

        }

    }

}
