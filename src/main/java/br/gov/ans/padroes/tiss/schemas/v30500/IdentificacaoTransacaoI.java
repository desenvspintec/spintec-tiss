package br.gov.ans.padroes.tiss.schemas.v30500;

import javax.xml.datatype.XMLGregorianCalendar;

public interface IdentificacaoTransacaoI {
    DmTipoTransacaoI getTipoTransacao();

    String getSequencialTransacao();

    XMLGregorianCalendar getDataRegistroTransacao();

    XMLGregorianCalendar getHoraRegistroTransacao();
}
