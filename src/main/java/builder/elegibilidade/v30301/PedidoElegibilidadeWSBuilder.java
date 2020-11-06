package com.spin.verificaelegibilidade.tiss.builder.elegibilidade.v30301;

import java.util.Optional;
import java.util.function.Consumer;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.google.common.base.Strings;
import com.spin.verificaelegibilidade.annotation.TissVersion;
import com.spin.verificaelegibilidade.model.BeneficiarioModel;
import com.spin.verificaelegibilidade.model.ElegibilidadeModel;
import com.spin.verificaelegibilidade.model.IdentificacaoPrestadorModel;
import com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.api.PedidoElegibilidadeWSI;
import com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301.CabecalhoTransacao;
import com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301.CtContratadoDados;
import com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301.CtElegibilidadeVerifica;
import com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301.DmTipoTransacao;
import com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301.PedidoElegibilidadeWS;
import com.spin.verificaelegibilidade.tiss.client.builder.MensagemTissWSBuilder;
import com.spin.verificaelegibilidade.tiss.utils.CalculoHash;
import com.spin.verificaelegibilidade.tiss.utils.v30301.CabecalhoTransacaoBuilder;
import com.spin.verificaelegibilidade.tiss.utils.v30301.EstruturaComumBuilder;

@Component
@TissVersion(tipoMensagem = PedidoElegibilidadeWSI.class, versao = "3.03.01")
public class PedidoElegibilidadeWSBuilder implements MensagemTissWSBuilder<PedidoElegibilidadeWSI, ElegibilidadeModel>{

	@Inject
    private CalculoHash calculoHash;
	
	@Inject
    private CabecalhoTransacaoBuilder cabecalhoBuilder;
	
	@Inject
    private EstruturaComumBuilder comumBuilder;
	
	public PedidoElegibilidadeWSI builder(ElegibilidadeModel pedidoElegibilidade) {
		final PedidoElegibilidadeWS pedidoElegibilidadeWS = new PedidoElegibilidadeWS();
		
		final CabecalhoTransacao cabecalho = criarCabecalho(pedidoElegibilidade);
        pedidoElegibilidadeWS.setCabecalho(cabecalho);

        final CtElegibilidadeVerifica corpo = criarCorpo(pedidoElegibilidade);
        pedidoElegibilidadeWS.setPedidoElegibilidade(corpo);

        final String hash = calculoHash.getHashFromObject(pedidoElegibilidadeWS);
        pedidoElegibilidadeWS.setHash(hash);
		return pedidoElegibilidadeWS;
	}

	private CtElegibilidadeVerifica criarCorpo(ElegibilidadeModel pedidoElegibilidade) {
		final CtElegibilidadeVerifica corpo = new CtElegibilidadeVerifica();
        Optional.ofNullable(pedidoElegibilidade.getIdentificacaoPrestador())
                .map(prest -> criarContratadoDados(prest, pedidoElegibilidade.getNumeroANS())).ifPresent(corpo::setDadosPrestador);

        final BeneficiarioModel beneficiario = pedidoElegibilidade.getBeneficiario();
        if (beneficiario != null) {
            corpo.setNumeroCarteira(beneficiario.getNumeroCarteira());
            corpo.setNomeBeneficiario(beneficiario.getNome());
            corpo.setNumeroCNS(beneficiario.getNumeroCNS() == null ? null : beneficiario.getNumeroCNS().toString());

            Optional.ofNullable(beneficiario.getValidadeCarteira()).map(comumBuilder::getXMLGregorianCalendar)
                    .ifPresent(corpo::setValidadeCarteira);
        }

        return corpo;
	}

	private CabecalhoTransacao criarCabecalho(ElegibilidadeModel pedidoElegibilidade) {
		return cabecalhoBuilder.criarCabecalho(DmTipoTransacao.VERIFICA_ELEGIBILIDADE, pedidoElegibilidade.getSequencialTransacao(),
                pedidoElegibilidade.getNumeroANS(), Optional.ofNullable(pedidoElegibilidade.getIdentificacaoPrestador()), false);
	}
	
	private CtContratadoDados criarContratadoDados(IdentificacaoPrestadorModel identificacao, String registroAns) {
        final CtContratadoDados contratadoDados = new CtContratadoDados();
        definirIdentificacaoPrestador(identificacao, contratadoDados::setCodigoPrestadorNaOperadora,
        		contratadoDados::setCpfContratado, contratadoDados::setCnpjContratado);
        
        contratadoDados.setNomeContratado(identificacao.getNomePrestador());

        return contratadoDados;
    }
	
	public void definirIdentificacaoPrestador(IdentificacaoPrestadorModel identificacao, Consumer<String> setCodigo, Consumer<String> setCPF,
            Consumer<String> setCNPJ) {
        final String cnpj = identificacao.getCnpj();
        if (!Strings.isNullOrEmpty(cnpj)) {
            setCNPJ.accept(cnpj);
            return;
        }

        final String cpf = identificacao.getCpf();
        if (!Strings.isNullOrEmpty(cpf)) {
            setCPF.accept(cpf);
            return;
        }

        final String prestadorOperadoraId = identificacao.getCodigoPrestadorNaOperadora();
        if (!Strings.isNullOrEmpty(prestadorOperadoraId)) {
            setCodigo.accept(prestadorOperadoraId);
        }
    }
	
	
}
