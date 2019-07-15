package com.lti.flightreservation.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
}
