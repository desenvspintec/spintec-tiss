package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.api;

import com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.api.MensagemTissWSI;

public interface PedidoElegibilidadeWSI extends MensagemTissWSI {

    CtElegibilidadeVerificaI getPedidoElegibilidade();

    String getHash();
}
