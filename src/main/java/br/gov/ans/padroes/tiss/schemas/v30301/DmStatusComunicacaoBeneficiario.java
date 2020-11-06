
package br.gov.ans.padroes.tiss.schemas.v30301;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dm_statusComunicacaoBeneficiario.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="dm_statusComunicacaoBeneficiario">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="B"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dm_statusComunicacaoBeneficiario")
@XmlEnum
public enum DmStatusComunicacaoBeneficiario {

    P,
    B;

    public String value() {
        return name();
    }

    public static DmStatusComunicacaoBeneficiario fromValue(String v) {
        return valueOf(v);
    }

}
