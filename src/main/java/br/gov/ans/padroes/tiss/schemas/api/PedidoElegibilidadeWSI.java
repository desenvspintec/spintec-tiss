package br.gov.ans.padroes.tiss.schemas.api;

public interface PedidoElegibilidadeWSI extends MensagemTissWSI {

    CtElegibilidadeVerificaI getPedidoElegibilidade();

    String getHash();
}
