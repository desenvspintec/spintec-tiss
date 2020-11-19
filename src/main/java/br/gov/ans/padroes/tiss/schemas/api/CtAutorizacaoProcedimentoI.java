package br.gov.ans.padroes.tiss.schemas.api;

import br.gov.ans.padroes.tiss.schemas.CtSituacaoAutorizacao;
import br.gov.ans.padroes.tiss.schemas.Signature;

public interface CtAutorizacaoProcedimentoI {
    CtSituacaoAutorizacao getAutorizacaoProcedimento();
    String getHash();
    Signature getSignature();
}
