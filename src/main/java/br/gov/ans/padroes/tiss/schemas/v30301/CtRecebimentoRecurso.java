
package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_recebimentoRecurso complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_recebimentoRecurso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
 *         &lt;element name="protocoloRecebimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_recursoGlosaRecebimento"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_recebimentoRecurso", propOrder = {
    "mensagemErro",
    "protocoloRecebimento"
})
public class CtRecebimentoRecurso {

    protected CtMotivoGlosa mensagemErro;
    protected CtRecursoGlosaRecebimento protocoloRecebimento;

    /**
     * Obtém o valor da propriedade mensagemErro.
     * 
     * @return
     *     possible object is
     *     {@link CtMotivoGlosa }
     *     
     */
    public CtMotivoGlosa getMensagemErro() {
        return mensagemErro;
    }

    /**
     * Define o valor da propriedade mensagemErro.
     * 
     * @param value
     *     allowed object is
     *     {@link CtMotivoGlosa }
     *     
     */
    public void setMensagemErro(CtMotivoGlosa value) {
        this.mensagemErro = value;
    }

    /**
     * Obtém o valor da propriedade protocoloRecebimento.
     * 
     * @return
     *     possible object is
     *     {@link CtRecursoGlosaRecebimento }
     *     
     */
    public CtRecursoGlosaRecebimento getProtocoloRecebimento() {
        return protocoloRecebimento;
    }

    /**
     * Define o valor da propriedade protocoloRecebimento.
     * 
     * @param value
     *     allowed object is
     *     {@link CtRecursoGlosaRecebimento }
     *     
     */
    public void setProtocoloRecebimento(CtRecursoGlosaRecebimento value) {
        this.protocoloRecebimento = value;
    }

}
