package biz.pehm.rfk.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import biz.pehm.rfk.constants.Constant;

@Path("/services")
@Stateless
public class FormulaService {
	
	@PersistenceContext(unitName="rfk-entitiesPU")
	EntityManager em;

    @SuppressWarnings("unchecked")
	@GET
    @Produces("application/json")
    public List<Constant> getClichedMessage() {
        Query q = em.createNamedQuery("findAllConstants");
        List<Constant> constants= q.getResultList();
        return constants;
    }
}
