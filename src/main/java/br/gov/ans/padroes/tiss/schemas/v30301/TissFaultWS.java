
package br.gov.ans.padroes.tiss.schemas.v30301;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="tissFault" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tissFault"/>
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
    "tissFault"
})
@XmlRootElement(name = "tissFaultWS")
public class TissFaultWS {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected StTissFault tissFault;

    /**
     * Obtém o valor da propriedade tissFault.
     * 
     * @return
     *     possible object is
     *     {@link StTissFault }
     *     
     */
    public StTissFault getTissFault() {
        return tissFault;
    }

    /**
     * Define o valor da propriedade tissFault.
     * 
     * @param value
     *     allowed object is
     *     {@link StTissFault }
     *     
     */
    public void setTissFault(StTissFault value) {
        this.tissFault = value;
    }

}
