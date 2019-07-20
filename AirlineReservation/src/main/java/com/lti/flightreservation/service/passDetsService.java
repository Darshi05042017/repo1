package com.lti.flightreservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.flightreservation.dao.StatusDTO;
import com.lti.flightreservation.dao.passDetailsDao;
import com.lti.flightreservation.dto.passDetsDTO;
import com.lti.flightreservation.entity.PassAddDets;





@Service
public class passDetsService {
	
	@Autowired
	private passDetailsDao passdetailsDao;
	
	@Transactional
	public StatusDTO save(passDetsDTO[] passdetsDTO) {
		//Copying the data from the DTO to entity 
		StatusDTO status = new StatusDTO();

			for(passDetsDTO p:passdetsDTO) {
				
				PassAddDets pass=new PassAddDets();
				pass.setGender(p.getGender());
				pass.setName(p.getName());
				pass.setPhNo(p.getPhNo());
				pass.setRegister(p.);
				passdetailsDao.save(pass);
			}
		
			status.setId(0);
			status.setMessage("THE DETAILS HAVE BEEN ADDED SUCCESSFULLY ");
			
		
		return status;
	}
	

	}
	

