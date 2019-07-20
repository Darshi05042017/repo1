package com.lti.flightreservation.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.flightreservation.entity.Register;





@Repository
public class UserLoginDao {

	@PersistenceContext
	EntityManager entityManager;
	
	public Register fetchOne(String email) {
		
		return (Register) entityManager.createQuery("select reg from Register reg where reg.email=:em").setParameter("em", email).getSingleResult();
		
	}
}
