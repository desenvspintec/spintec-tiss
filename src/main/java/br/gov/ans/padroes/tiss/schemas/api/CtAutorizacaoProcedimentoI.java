package br.gov.ans.padroes.tiss.schemas.api;

import br.gov.ans.padroes.tiss.schemas.v30301.CtSituacaoAutorizacao;
import br.gov.ans.padroes.tiss.schemas.v30301.Signature;

public interface CtAutorizacaoProcedimentoI {
    CtSituacaoAutorizacao getAutorizacaoProcedimento();
    String getHash();
    Signature getSignature();
}
