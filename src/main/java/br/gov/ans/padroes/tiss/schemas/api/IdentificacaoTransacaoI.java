package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.api;

import javax.xml.datatype.XMLGregorianCalendar;

public interface IdentificacaoTransacaoI {

	DmTipoTransacaoI getTipoTransacao();

    String getSequencialTransacao();

    XMLGregorianCalendar getDataRegistroTransacao();

    XMLGregorianCalendar getHoraRegistroTransacao();
}
