package com.lti.flightreservation.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.flightreservation.entity.AddFlightEntity;

@Repository
public class GetAmountDao {
	@PersistenceContext
	private EntityManager entitymanager;
	

	public AddFlightEntity getPrice(AddFlightEntity afe) {
		Query query = entitymanager.createQuery("select c from AddFlightEntity c where c.flightId=:id");
		query.setParameter("id", afe.getFlightId());
	     
	      AddFlightEntity list = (AddFlightEntity) query.getSingleResult();
	      return list;
	}

	

}
