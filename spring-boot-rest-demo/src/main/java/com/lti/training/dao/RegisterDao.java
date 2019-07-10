package com.lti.training.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.training.entity.User;

//@Component
@Repository
public class RegisterDao {

	@PersistenceContext
	private EntityManager entitymanager;
	
	public int save(User user) {
		User u=entitymanager.merge(user);
		return u.getId();
	}
	
	public User search(String email) {
		Query q=entitymanager.createQuery("select u from User u where u.email =:em");
		q.setParameter("em",email);
	   User us=(User)q.getSingleResult();
		return us;
	}
}
