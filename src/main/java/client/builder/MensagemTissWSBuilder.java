package com.spin.verificaelegibilidade.tiss.client.builder;

public interface MensagemTissWSBuilder<MensagemWS, MensagemObj> {
	
	MensagemWS builder(MensagemObj mensagemObj);

}
