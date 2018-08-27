package rs.etf.m2m.reporter.models.utilities;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EMProducer {

	@Produces
	@EMPU
	@PersistenceContext(unitName = "derbyPU")
	private EntityManager em;

}
