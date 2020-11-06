package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.api;

public interface CtRespostaElegibilidadeI {

	CtMotivoGlosaI getMensagemErro();

    CtElegibilidadeReciboI getReciboElegibilidade();
}
