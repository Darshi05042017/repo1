package com.lti.flightreservation.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.flightreservation.entity.Register;




@Repository
public class RegisterDao {

		@PersistenceContext
		private EntityManager entityManager;
		
		public String save(Register register) {
			Register u=entityManager.merge(register);
			System.out.println("dao called");
			return "success";
		}
}
		