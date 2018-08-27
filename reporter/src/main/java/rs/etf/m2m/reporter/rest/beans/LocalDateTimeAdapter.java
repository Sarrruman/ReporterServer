package rs.etf.m2m.reporter.rest.beans;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime> {

	@Override
	public String marshal(LocalDateTime v) throws Exception {
		return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(v);
	}

	@Override
	public LocalDateTime unmarshal(String v) throws Exception {
		return LocalDateTime.parse(v, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
	}
}
