package com.lti.flightreservation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.flightreservation.entity.BookDetailsEntity;
import com.lti.flightreservation.entity.Register;

@Repository
public class BookHistoryDao {
	@PersistenceContext
	private EntityManager entitymanager;

	public List<BookDetailsEntity> fetchHistory(int id) {
		Query query= entitymanager.createQuery("select c from BookDetailsEntity c where c.registeruser.id=:id");
		query.setParameter("id",id);
		List<BookDetailsEntity> resultList = query.getResultList();
		return resultList;
	}

}
