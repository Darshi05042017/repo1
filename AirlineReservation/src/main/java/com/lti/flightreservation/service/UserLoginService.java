package com.lti.flightreservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.flightreservation.dao.UserLoginDao;
import com.lti.flightreservation.entity.Register;



@Service
public class UserLoginService {

	@Autowired
	private UserLoginDao userlogindao;
	
	Register reg = new Register();
	
	public Register showSearch(String email) {
		
		System.out.println("service is called");
		
		 return userlogindao.fetchOne(email);	
	}
}
