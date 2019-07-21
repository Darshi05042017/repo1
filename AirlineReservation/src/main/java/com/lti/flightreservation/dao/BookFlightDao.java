package com.lti.flightreservation.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Repository;

import com.lti.flightreservation.entity.AddFlightEntity;
import com.lti.flightreservation.entity.BookDetailsEntity;
import com.lti.flightreservation.entity.Register;

@Repository
public class BookFlightDao {
	
	@PersistenceContext
	private EntityManager entitymanager;


	public BookDetailsEntity addBookDetails(BookDetailsEntity bde) {
		
		return entitymanager.merge(bde);
	}
	public  Register find(Class<Register> class1, int id) {
		Register register = entitymanager.find(class1,id);
		
		return register;
	}
	public AddFlightEntity findFlight(Class<AddFlightEntity> class1, String flightId) {
		AddFlightEntity flight=entitymanager.find(class1,flightId);
		return flight;
	}

}
