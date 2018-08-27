package rs.etf.m2m.reporter.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
public class RESTApplication extends Application {

	public RESTApplication() {
	}

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> s = new HashSet<Class<?>>();

		s.add(ReportService.class);

		return s;
	}

}
