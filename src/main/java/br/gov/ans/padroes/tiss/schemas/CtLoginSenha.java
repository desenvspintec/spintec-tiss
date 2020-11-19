
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_loginSenha complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_loginSenha">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="senhaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto32"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_loginSenha", propOrder = {
    "loginPrestador",
    "senhaPrestador"
})
public class CtLoginSenha {

    @XmlElement(required = true)
    protected String loginPrestador;
    @XmlElement(required = true)
    protected String senhaPrestador;

    /**
     * Obt�m o valor da propriedade loginPrestador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginPrestador() {
        return loginPrestador;
    }

    /**
     * Define o valor da propriedade loginPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginPrestador(String value) {
        this.loginPrestador = value;
    }

    /**
     * Obt�m o valor da propriedade senhaPrestador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenhaPrestador() {
        return senhaPrestador;
    }

    /**
     * Define o valor da propriedade senhaPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenhaPrestador(String value) {
        this.senhaPrestador = value;
    }

}
