package com.lti.flightreservation.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.flightreservation.entity.AddFlightEntity;


@Repository
public class AddFlightDao {

	@PersistenceContext
	private EntityManager entitymanager;
	
	public String save(AddFlightEntity addFlightEntity) {
		entitymanager.merge(addFlightEntity);
		return "Data Inserted Successfully";
	}

	public String delete(AddFlightEntity afe) {
		Query query = entitymanager.createQuery("UPDATE AddFlightEntity ad SET ad.stat = :st "
	              + "WHERE ad.flightId = :id");
		query.setParameter("st", afe.getStat());
	      query.setParameter("id", afe.getFlightId());
	      int rowsUpdated = query.executeUpdate();
	      System.out.println(rowsUpdated);
	      
		return "Flight is Deleted";
	}
}
