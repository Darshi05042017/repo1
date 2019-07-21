package com.lti.flightreservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.flightreservation.dao.StatusDTO;
import com.lti.flightreservation.dao.passDetailsDao;
import com.lti.flightreservation.dto.passDetsDTO;
import com.lti.flightreservation.entity.PassAddDets;
import com.lti.flightreservation.entity.Register;





@Service
public class passDetsService {
	
	@Autowired
	private passDetailsDao passdetailsDao;
	
	@Transactional
	public StatusDTO save(passDetsDTO[] passdetsDTO) {
		//Copying the data from the DTO to entity 
		StatusDTO status = new StatusDTO();
		Register register;

			for(passDetsDTO p:passdetsDTO) {
				
				PassAddDets pass=new PassAddDets();
				pass.setGender(p.getGender());
				pass.setName(p.getName());
				pass.setPhNo(p.getPhNo());
			/* pass.setRegister(p.getUserid()); */
				int id= p.getUserid();
				register= passdetailsDao.find(Register.class,id);
				pass.setRegister(register);
				
				passdetailsDao.save(pass);
				
			}
			
			status.setId(0);
			status.setMessage("THE DETAILS HAVE BEEN ADDED SUCCESSFULLY ");
			
		
		return status;
	}
	

	}
	

