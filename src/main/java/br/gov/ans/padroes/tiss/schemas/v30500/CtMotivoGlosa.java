
package br.gov.ans.padroes.tiss.schemas.v30500;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_motivoGlosa complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_motivoGlosa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
 *         &lt;element name="descricaoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_motivoGlosa", propOrder = {
    "codigoGlosa",
    "descricaoGlosa"
})
public class CtMotivoGlosa {

    @XmlElement(required = true)
    protected String codigoGlosa;
    protected String descricaoGlosa;

    /**
     * Obt�m o valor da propriedade codigoGlosa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoGlosa() {
        return codigoGlosa;
    }

    /**
     * Define o valor da propriedade codigoGlosa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoGlosa(String value) {
        this.codigoGlosa = value;
    }

    /**
     * Obt�m o valor da propriedade descricaoGlosa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoGlosa() {
        return descricaoGlosa;
    }

    /**
     * Define o valor da propriedade descricaoGlosa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoGlosa(String value) {
        this.descricaoGlosa = value;
    }

}
