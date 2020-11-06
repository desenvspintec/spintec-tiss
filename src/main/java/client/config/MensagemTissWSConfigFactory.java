package com.spin.verificaelegibilidade.tiss.client.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spin.verificaelegibilidade.annotation.TissVersion;
import com.spin.verificaelegibilidade.annotation.TissVersionQualifier;
import com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.api.MensagemTissWSI;

@Component
public class MensagemTissWSConfigFactory {

	@Autowired
    private List<MensagemTissWSConfig<?, ?, ?>> configInstance;

    @SuppressWarnings("unchecked")
    public <PortType, Response, Mensagem> MensagemTissWSConfig<PortType, Response, Mensagem>
            getConfiguration(Class<? extends MensagemTissWSI> tipoMensagem, String versao) {
        final List<MensagemTissWSConfig<?, ?, ?>> selected = select(new TissVersionQualifier(tipoMensagem, versao));

        if (selected.isEmpty()) {
            throw new IllegalArgumentException(
                    String.format("NÃO EXISTE CONFIGURAÇÃO DO WEB SERVICE TISS DE [%s] NA VERSÃO [%s]", tipoMensagem.getSimpleName(), versao));
        }
        if (selected.size() > 1) {
            throw new IllegalArgumentException(String.format("EXISTE MAIS DE UMA CONFIGURAÇÃO DO WEB SERVICE TISS DE [%s] NA VERSÃO [%s]",
                    tipoMensagem.getSimpleName(), versao));
        }

        return (MensagemTissWSConfig<PortType, Response, Mensagem>) selected.get(0);
    }

    private List<MensagemTissWSConfig<?, ?, ?>>select(TissVersionQualifier tissVersionQualifier) {
		List<MensagemTissWSConfig<?, ?, ?>> lista = new ArrayList<>();
		for(MensagemTissWSConfig<?, ?, ?> inst : configInstance) {
			Class<? extends MensagemTissWSConfig> cls = inst.getClass();
			if(cls.isAnnotationPresent(TissVersion.class)) {
				TissVersion version = cls.getAnnotation(TissVersion.class);
				boolean equals = version.equals(tissVersionQualifier);
				if(equals) {
					lista.add(inst);
				}
			}
		}
		return lista;
	}
}
