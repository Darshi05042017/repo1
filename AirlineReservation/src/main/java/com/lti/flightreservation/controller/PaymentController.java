package com.lti.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.lti.flightreservation.dto.PaymentDYTO;
import com.lti.flightreservation.entity.PaymentEntity;
import com.lti.flightreservation.service.PaymentService;


@RestController
public class PaymentController {
	
	@Autowired
	private PaymentService payService;
	
	@RequestMapping(path="/payamount", method=RequestMethod.POST)
    public PaymentEntity payment(@RequestBody PaymentDYTO paymenttDTO) {
		
		PaymentEntity paydetails= payService.pay(paymenttDTO);
		
		    return paydetails;
	   }

}
