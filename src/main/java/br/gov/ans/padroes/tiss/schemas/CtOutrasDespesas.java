
package br.gov.ans.padroes.tiss.schemas;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_outrasDespesas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_outrasDespesas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="despesa" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sequencialItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico4"/>
 *                   &lt;element name="codigoDespesa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_outrasDespesas"/>
 *                   &lt;element name="servicosExecutados" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoExecutadoOutras"/>
 *                   &lt;element name="itemVinculado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico4" minOccurs="0"/>
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
@XmlType(name = "ct_outrasDespesas", propOrder = {
    "despesa"
})
public class CtOutrasDespesas {

    @XmlElement(required = true)
    protected List<CtOutrasDespesas.Despesa> despesa;

    /**
     * Gets the value of the despesa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the despesa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDespesa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtOutrasDespesas.Despesa }
     * 
     * 
     */
    public List<CtOutrasDespesas.Despesa> getDespesa() {
        if (despesa == null) {
            despesa = new ArrayList<CtOutrasDespesas.Despesa>();
        }
        return this.despesa;
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
     *         &lt;element name="sequencialItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico4"/>
     *         &lt;element name="codigoDespesa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_outrasDespesas"/>
     *         &lt;element name="servicosExecutados" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoExecutadoOutras"/>
     *         &lt;element name="itemVinculado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico4" minOccurs="0"/>
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
        "sequencialItem",
        "codigoDespesa",
        "servicosExecutados",
        "itemVinculado"
    })
    public static class Despesa {

        @XmlElement(required = true)
        protected BigInteger sequencialItem;
        @XmlElement(required = true)
        protected String codigoDespesa;
        @XmlElement(required = true)
        protected CtProcedimentoExecutadoOutras servicosExecutados;
        protected BigInteger itemVinculado;

        /**
         * Obt�m o valor da propriedade sequencialItem.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSequencialItem() {
            return sequencialItem;
        }

        /**
         * Define o valor da propriedade sequencialItem.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSequencialItem(BigInteger value) {
            this.sequencialItem = value;
        }

        /**
         * Obt�m o valor da propriedade codigoDespesa.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoDespesa() {
            return codigoDespesa;
        }

        /**
         * Define o valor da propriedade codigoDespesa.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoDespesa(String value) {
            this.codigoDespesa = value;
        }

        /**
         * Obt�m o valor da propriedade servicosExecutados.
         * 
         * @return
         *     possible object is
         *     {@link CtProcedimentoExecutadoOutras }
         *     
         */
        public CtProcedimentoExecutadoOutras getServicosExecutados() {
            return servicosExecutados;
        }

        /**
         * Define o valor da propriedade servicosExecutados.
         * 
         * @param value
         *     allowed object is
         *     {@link CtProcedimentoExecutadoOutras }
         *     
         */
        public void setServicosExecutados(CtProcedimentoExecutadoOutras value) {
            this.servicosExecutados = value;
        }

        /**
         * Obt�m o valor da propriedade itemVinculado.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getItemVinculado() {
            return itemVinculado;
        }

        /**
         * Define o valor da propriedade itemVinculado.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setItemVinculado(BigInteger value) {
            this.itemVinculado = value;
        }

    }

}
