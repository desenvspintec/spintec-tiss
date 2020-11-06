package com.spin.verificaelegibilidade.tiss.utils.v30301;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.function.Consumer;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Component;

import com.google.common.base.Strings;
import com.spin.verificaelegibilidade.model.IdentificacaoPrestadorModel;
import com.spin.verificaelegibilidade.tiss.utils.DateUtils;

@Component
public class EstruturaComumBuilder {

	public XMLGregorianCalendar getXMLGregorianCalendar(Date data) {
        final GregorianCalendar dataGC = new GregorianCalendar();
		dataGC.setTime(data);
		return DateUtils.getXMLGregCalendarWithOutTimeZoneAndMillisecond(data);
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
