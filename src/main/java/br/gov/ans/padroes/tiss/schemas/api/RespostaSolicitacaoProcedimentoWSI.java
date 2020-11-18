package br.gov.ans.padroes.tiss.schemas.api;

public interface RespostaSolicitacaoProcedimentoWSI extends MensagemTissWSI {
    CabecalhoTransacaoTISSI getCabecalho();

    String getHash();

    void setHash(String value);
}
