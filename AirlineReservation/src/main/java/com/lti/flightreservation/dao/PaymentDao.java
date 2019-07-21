package com.lti.flightreservation.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.flightreservation.entity.BookDetailsEntity;
import com.lti.flightreservation.entity.PaymentEntity;
import com.lti.flightreservation.entity.Register;

@Repository
public class PaymentDao {
	
	@PersistenceContext
	private EntityManager entitymanager;
	
	public  BookDetailsEntity find(Class<BookDetailsEntity> class1, int bookid) {
		BookDetailsEntity bookdet = entitymanager.find(class1,bookid);
		return bookdet;
	}
	
	

	public PaymentEntity fetchPayment(PaymentEntity payentity) {
		// TODO Auto-generated method stub
		 return entitymanager.merge(payentity);
	}
}
