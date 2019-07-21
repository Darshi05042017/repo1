package com.lti.flightreservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.flightreservation.dao.PaymentDao;
import com.lti.flightreservation.dto.PaymentDYTO;
import com.lti.flightreservation.entity.AddFlightEntity;
import com.lti.flightreservation.entity.BookDetailsEntity;
import com.lti.flightreservation.entity.PaymentEntity;

@Service
public class PaymentService {

	@Autowired
	private PaymentDao paydao; 
	
	@Transactional
	public PaymentEntity pay(PaymentDYTO paymenttDTO) {
		
		PaymentEntity payentity=new PaymentEntity();
		int bookid= paymenttDTO.getBookid();
		BookDetailsEntity bookingId = paydao.find(BookDetailsEntity.class,bookid);
		System.out.println(bookingId.getBookid());
		payentity.setBookentity(bookingId);
		payentity.setFlclass(paymenttDTO.getFclass());
		payentity.setPayDate(paymenttDTO.getPayDate());
		payentity.setPaymode(paymenttDTO.getMode());
		payentity.setPaymentAmount(paymenttDTO.getPaymentAmount());
		payentity.setPaymentStatus(paymenttDTO.getPaymentStatus());
		PaymentEntity payent=paydao.fetchPayment(payentity);
		return payent;
	}

}
