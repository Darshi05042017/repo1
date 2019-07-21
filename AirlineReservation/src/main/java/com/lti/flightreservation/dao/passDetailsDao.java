package com.lti.flightreservation.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.flightreservation.entity.PassAddDets;
import com.lti.flightreservation.entity.Register;




//@Component
@Repository
public class passDetailsDao {

	@PersistenceContext
	private EntityManager entitymanager;
	
	public int save(PassAddDets passdets) {
		PassAddDets u=entitymanager.merge(passdets);
		return u.getBid();
	}

	public  Register find(Class<Register> class1, int id) {
		Register register = entitymanager.find(class1,id);
		
		return register;
	}
	
	/*public User search(String email) {
		Query q=entitymanager.createQuery("select u from User u where u.email =:em");
		q.setParameter("em",email);
	   User us=(User)q.getSingleResult();
		return us;
	}*/
}
