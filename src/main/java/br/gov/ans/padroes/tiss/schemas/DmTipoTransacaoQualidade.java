
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dm_tipoTransacaoQualidade.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="dm_tipoTransacaoQualidade">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="QUALIDADE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dm_tipoTransacaoQualidade")
@XmlEnum
public enum DmTipoTransacaoQualidade {

    QUALIDADE;

    public String value() {
        return name();
    }

    public static DmTipoTransacaoQualidade fromValue(String v) {
        return valueOf(v);
    }

}
