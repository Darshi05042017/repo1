package com.lti.training.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.training.entity.AdminLogin;


//@Component
@Repository
public class adminLoginDao {

	@PersistenceContext
	private EntityManager entitymanager;
	
	public int save(AdminLogin adminlogin) {
		AdminLogin u=entitymanager.merge(adminlogin);
		return u.getId();
	}
	
	/*public User search(String email) {
		Query q=entitymanager.createQuery("select u from User u where u.email =:em");
		q.setParameter("em",email);
	   User us=(User)q.getSingleResult();
		return us;
	}*/
}
