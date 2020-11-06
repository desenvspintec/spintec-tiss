
package br.gov.ans.padroes.tiss.schemas.v30301;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * lote de recurso de glosa
 * 
 * <p>Classe Java de ct_guiaRecursoLote complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_guiaRecursoLote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="guiaRecursoGlosaOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}cto_recursoGlosaOdonto"/>
 *         &lt;element name="guiaRecursoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_recursoGlosa"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_guiaRecursoLote", propOrder = {
    "guiaRecursoGlosaOdonto",
    "guiaRecursoGlosa"
})
public class CtGuiaRecursoLote {

    protected CtoRecursoGlosaOdonto guiaRecursoGlosaOdonto;
    protected CtmRecursoGlosa guiaRecursoGlosa;

    /**
     * Obtém o valor da propriedade guiaRecursoGlosaOdonto.
     * 
     * @return
     *     possible object is
     *     {@link CtoRecursoGlosaOdonto }
     *     
     */
    public CtoRecursoGlosaOdonto getGuiaRecursoGlosaOdonto() {
        return guiaRecursoGlosaOdonto;
    }

    /**
     * Define o valor da propriedade guiaRecursoGlosaOdonto.
     * 
     * @param value
     *     allowed object is
     *     {@link CtoRecursoGlosaOdonto }
     *     
     */
    public void setGuiaRecursoGlosaOdonto(CtoRecursoGlosaOdonto value) {
        this.guiaRecursoGlosaOdonto = value;
    }

    /**
     * Obtém o valor da propriedade guiaRecursoGlosa.
     * 
     * @return
     *     possible object is
     *     {@link CtmRecursoGlosa }
     *     
     */
    public CtmRecursoGlosa getGuiaRecursoGlosa() {
        return guiaRecursoGlosa;
    }

    /**
     * Define o valor da propriedade guiaRecursoGlosa.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmRecursoGlosa }
     *     
     */
    public void setGuiaRecursoGlosa(CtmRecursoGlosa value) {
        this.guiaRecursoGlosa = value;
    }

}
