package com.spin.verificaelegibilidade.tiss.client.config;

import com.spin.verificaelegibilidade.tiss.br.gov.ans.tiss.ws.tipos.tissverificaelegibilidade.v30301.TissFault;

public interface InterfaceTissWS<PortType, Response> {
	
    Response apply(PortType t) throws TissFault;
    
}
