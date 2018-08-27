@XmlJavaTypeAdapters({ @XmlJavaTypeAdapter(type = LocalDateTime.class, value = LocalDateTimeAdapter.class) })
package rs.etf.m2m.reporter.rest.beans;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
