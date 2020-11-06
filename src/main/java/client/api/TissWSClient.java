package com.spin.verificaelegibilidade.tiss.client.api;

import java.util.Optional;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.api.CabecalhoTransacaoTISSI;
import com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.api.MensagemTissWSI;
import com.spin.verificaelegibilidade.tiss.client.builder.MensagemTissWSBuilder;
import com.spin.verificaelegibilidade.tiss.client.builder.MensagemTissWSBuilderFactory;
import com.spin.verificaelegibilidade.tiss.client.config.MensagemTissWSConfig;
import com.spin.verificaelegibilidade.tiss.client.config.MensagemTissWSConfigFactory;

@Component
public class TissWSClient<MensagemWS extends MensagemTissWSI, MensagemObj, Response>  {
	
	@Inject
	private MensagemTissWSBuilderFactory builderFactory;
	
	@Inject
	private MensagemTissWSConfigFactory configFactory;
	
	@Inject
	private TissWSCaller<Object, Response> wsCaller;

	public Response chamarWS(MensagemObj obj, Class<MensagemWS> tipoMensagem, String versao) throws Throwable {
        final MensagemTissWSBuilder<MensagemWS, MensagemObj> builder = builderFactory.getBuilder(tipoMensagem, versao);
        final MensagemWS mensagemTiss = builder.builder(obj);

        final MensagemTissWSConfig<Object, Response, MensagemWS> conf = configFactory.getConfiguration(tipoMensagem, versao);
        return chamarWS(mensagemTiss, conf);
    }

    private Response chamarWS(MensagemWS mensagemTiss, MensagemTissWSConfig<Object, Response, MensagemWS> conf) throws Throwable {
        final CabecalhoTransacaoTISSI cabecalho = mensagemTiss.getCabecalho();
        Optional.ofNullable(cabecalho).map(CabecalhoTransacaoTISSI::getNrANSDestino)
                .orElseThrow(() -> new IllegalArgumentException("O registro ANS da operadora precisa ser definido no cabeçalho da mensagem TISS"));

        final String wsUrl = conf.getUrlWs();
        final String wsdlUrl = conf.getUrlWsdl();

        return wsCaller.chamarWS(conf.getTissPortTypeClass(), cabecalho, wsUrl, wsdlUrl, conf.getServiceName(), conf.getPortName(),
                conf.getCallerFunciton(mensagemTiss));
    }
}
