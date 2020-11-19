package br.gov.ans.padroes.tiss.schemas.api;

import br.gov.ans.padroes.tiss.schemas.CtSituacaoAutorizacao;

public interface RespostaAutorizacaoProcedimentoWSI {
    CabecalhoTransacaoTISSI getCabecalho();

    CtSituacaoAutorizacao getAutorizacaoProcedimento();

    String getHash();

    void setHash(String value);
}
