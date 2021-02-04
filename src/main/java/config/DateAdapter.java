package config;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAdapter extends XmlAdapter<String, XMLGregorianCalendar> {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public String marshal(XMLGregorianCalendar v) throws Exception {
        synchronized (dateFormat) {
            return dateFormat.format(v);
        }
    }

    @Override
    public XMLGregorianCalendar unmarshal(String v) throws Exception {
        synchronized (dateFormat) {
            Date date = dateFormat.parse(v);

            GregorianCalendar gcal = new GregorianCalendar();
            gcal.setTime(date);

            XMLGregorianCalendar xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);

            return xmlGregCal;
        }
    }

}
