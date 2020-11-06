package com.spin.verificaelegibilidade.tiss.builder.elegibilidade.v30301;

import javax.xml.namespace.QName;

import org.springframework.stereotype.Component;

import com.spin.verificaelegibilidade.annotation.TissVersion;
import com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.api.PedidoElegibilidadeWSI;
import com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.api.RespostaElegibilidadeWSI;
import com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301.PedidoElegibilidadeWS;
import com.spin.verificaelegibilidade.tiss.br.gov.ans.tiss.ws.tipos.tissverificaelegibilidade.v30301.TissFault;
import com.spin.verificaelegibilidade.tiss.br.gov.ans.tiss.ws.tipos.tissverificaelegibilidade.v30301.TissVerificaElegibilidadePortType;
import com.spin.verificaelegibilidade.tiss.client.config.InterfaceTissWS;
import com.spin.verificaelegibilidade.tiss.client.config.MensagemTissWSConfig;

@Component
@TissVersion(tipoMensagem = PedidoElegibilidadeWSI.class, versao = "3.03.01")
public class PedidoElegibilidadeWSConfig
	implements MensagemTissWSConfig<TissVerificaElegibilidadePortType, RespostaElegibilidadeWSI, PedidoElegibilidadeWSI> {

    private String urlWs = "http://webservice.unimedblumenau.com.br:8180/TISS30301OPS/tissVerificaElegibilidade";

    private String urlWsdl = "http://webservice.unimedblumenau.com.br:8180/TISS30301OPS/tissVerificaElegibilidade?wsdl";

    @Override
    public Class<TissVerificaElegibilidadePortType> getTissPortTypeClass() {
        return TissVerificaElegibilidadePortType.class;
    }

    @Override
    public QName getServiceName() {
        return new QName("http://www.ans.gov.br/tiss/ws/tipos/tissverificaelegibilidade/v30301", "tissVerificaElegibilidade");
    }

    @Override
    public QName getPortName() {
        return new QName("tissVerificaElegibilidade_Port");
    }

    @Override
    public InterfaceTissWS<TissVerificaElegibilidadePortType, RespostaElegibilidadeWSI> getCallerFunciton(PedidoElegibilidadeWSI mensagem) {
        return caller -> {
            try {
                return caller.tissVerificaElegibilidadeOperation((PedidoElegibilidadeWS) mensagem);
            } catch (final TissFault tissFault) {
                throw new RuntimeException(tissFault);
            }
        };
    }

	@Override
	public String getUrlWs() {
		return urlWs;
	}

	@Override
	public String getUrlWsdl() {
		return urlWsdl;
	}
}
