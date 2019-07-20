package com.lti.flightreservation.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.flightreservation.dao.RegisterDao;
import com.lti.flightreservation.dto.RegisterDTO;
import com.lti.flightreservation.dto.StatusDTO;
import com.lti.flightreservation.entity.Register;




@Service
public class RegisterService {

@Autowired
private RegisterDao registerDao;
	
@Transactional
public StatusDTO save(RegisterDTO registerDto){
		
Register r1 = new Register();
	
	r1.setName(registerDto.getName());
	r1.setEmail(registerDto.getEmail());
	r1.setPhNo(registerDto.getPhNo());
	r1.setDob(registerDto.getDob());
	r1.setPass(registerDto.getPass());
	r1.setCnfpass(registerDto.getCnfpass());
	    
	registerDao.save(r1);
  StatusDTO status = new StatusDTO();
		
		status.setMessage("CONGRATULATIONS !! You Have Registered Successfully ");
		System.out.println("service called");
		return status;
	
	}
}
	