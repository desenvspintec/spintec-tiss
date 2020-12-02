package br.gov.ans.padroes.tiss.schemas.v30500.custom;

import br.gov.ans.padroes.tiss.schemas.v30500.CtSolicitacaoProcedimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_prestadorParaOperadora", propOrder = {
        "solicitacaoProcedimento"
})
public class CtPrestadorParaOperadora {
    @XmlElement(required = true)
    protected CtSolicitacaoProcedimento solicitacaoProcedimento;

    public CtSolicitacaoProcedimento getSolicitacaoProcedimento() {
        return solicitacaoProcedimento;
    }

    public void setSolicitacaoProcedimento(CtSolicitacaoProcedimento solicitacaoProcedimento) {
        this.solicitacaoProcedimento = solicitacaoProcedimento;
    }
}
