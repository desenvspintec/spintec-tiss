package com.spin.verificaelegibilidade.tiss.client.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spin.verificaelegibilidade.annotation.TissVersion;
import com.spin.verificaelegibilidade.annotation.TissVersionQualifier;
import com.spin.verificaelegibilidade.exception.BuilderException;
import com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.api.MensagemTissWSI;

@Component
public class MensagemTissWSBuilderFactory {

	@Autowired
    private List<MensagemTissWSBuilder<?, ?>> builderInstance;

    @SuppressWarnings("unchecked")
    public <MensagemWS, MensagemObj> MensagemTissWSBuilder<MensagemWS, MensagemObj> getBuilder(Class<? extends MensagemTissWSI> tipoMensagem,
            String versao) {
        final List<MensagemTissWSBuilder<?, ?>> selected =
        		select(new TissVersionQualifier(tipoMensagem, versao));

        if (selected.isEmpty()) {
            throw new BuilderException(
                    String.format("NÃO EXISTE BUILDER DO WEB SERVICE TISS DE [%s] NA VERSÃO [%s]", tipoMensagem.getSimpleName(), versao));
        }
        if (selected.size() > 1) {
            throw new BuilderException(
                    String.format("EXISTE MAIS DE UM BUILDER DO WEB SERVICE TISS DE [%s] NA VERSÃO [%s]", tipoMensagem.getSimpleName(), versao));
        }

        return (MensagemTissWSBuilder<MensagemWS, MensagemObj>) selected.get(0);
    }

	private List<MensagemTissWSBuilder<?, ?>> select(TissVersionQualifier tissVersionQualifier) {
		List<MensagemTissWSBuilder<?, ?>> lista = new ArrayList<>();
		for(MensagemTissWSBuilder<?, ?> inst : builderInstance) {
			Class<? extends MensagemTissWSBuilder> cls = inst.getClass();
			if(cls.isAnnotationPresent(TissVersion.class)) {
				TissVersion version = cls.getAnnotation(TissVersion.class);
				boolean equals = tissVersionQualifier.equals(version);
				if(equals) {
					lista.add(inst);
				}
			}
		}
		return lista;
	}
}
