package com.lti.flightreservation.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.flightreservation.entity.PassAddDets;




//@Component
@Repository
public class passDetailsDao {

	@PersistenceContext
	private EntityManager entitymanager;
	
	public int save(PassAddDets passdets) {
		PassAddDets u=entitymanager.merge(passdets);
		return u.getId();
	}
	
	/*public User search(String email) {
		Query q=entitymanager.createQuery("select u from User u where u.email =:em");
		q.setParameter("em",email);
	   User us=(User)q.getSingleResult();
		return us;
	}*/
}
