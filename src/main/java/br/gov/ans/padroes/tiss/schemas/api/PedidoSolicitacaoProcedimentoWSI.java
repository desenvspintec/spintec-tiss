package br.gov.ans.padroes.tiss.schemas.api;

public interface PedidoSolicitacaoProcedimentoWSI extends MensagemTissWSI {

    CtSolicitacaoProcedimentoI getSolicitacaoProcedimento();

    String getHash();
}
