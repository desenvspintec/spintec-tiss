
package br.gov.ans.padroes.tiss.schemas;

import br.gov.ans.padroes.tiss.schemas.api.DmSimNaoI;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dm_simNao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="dm_simNao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dm_simNao")
@XmlEnum
public enum DmSimNao implements DmSimNaoI {

    S,
    N;

    public String value() {
        return name();
    }

    public static DmSimNao fromValue(String v) {
        return valueOf(v);
    }

}
