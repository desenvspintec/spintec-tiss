package br.gov.ans.padroes.tiss.schemas.api;

import br.gov.ans.padroes.tiss.schemas.api.MensagemTissWSI;

public interface PedidoElegibilidadeWSI extends MensagemTissWSI {

    CtElegibilidadeVerificaI getPedidoElegibilidade();

    String getHash();
}
