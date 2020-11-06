
package br.gov.ans.padroes.tiss.schemas.v30301;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_contratadoProfissionalDados complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_contratadoProfissionalDados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomeProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70" minOccurs="0"/>
 *         &lt;element name="conselhoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_conselhoProfissional"/>
 *         &lt;element name="numeroConselhoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15"/>
 *         &lt;element name="UF" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_UF"/>
 *         &lt;element name="CBOS" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_CBOS"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_contratadoProfissionalDados", propOrder = {
    "nomeProfissional",
    "conselhoProfissional",
    "numeroConselhoProfissional",
    "uf",
    "cbos"
})
public class CtContratadoProfissionalDados {

    protected String nomeProfissional;
    @XmlElement(required = true)
    protected String conselhoProfissional;
    @XmlElement(required = true)
    protected String numeroConselhoProfissional;
    @XmlElement(name = "UF", required = true)
    protected String uf;
    @XmlElement(name = "CBOS", required = true)
    protected String cbos;

    /**
     * Obtém o valor da propriedade nomeProfissional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeProfissional() {
        return nomeProfissional;
    }

    /**
     * Define o valor da propriedade nomeProfissional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeProfissional(String value) {
        this.nomeProfissional = value;
    }

    /**
     * Obtém o valor da propriedade conselhoProfissional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConselhoProfissional() {
        return conselhoProfissional;
    }

    /**
     * Define o valor da propriedade conselhoProfissional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConselhoProfissional(String value) {
        this.conselhoProfissional = value;
    }

    /**
     * Obtém o valor da propriedade numeroConselhoProfissional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroConselhoProfissional() {
        return numeroConselhoProfissional;
    }

    /**
     * Define o valor da propriedade numeroConselhoProfissional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroConselhoProfissional(String value) {
        this.numeroConselhoProfissional = value;
    }

    /**
     * Obtém o valor da propriedade uf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUF() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUF(String value) {
        this.uf = value;
    }

    /**
     * Obtém o valor da propriedade cbos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCBOS() {
        return cbos;
    }

    /**
     * Define o valor da propriedade cbos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCBOS(String value) {
        this.cbos = value;
    }

}
