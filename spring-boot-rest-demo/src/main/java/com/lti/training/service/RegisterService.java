package com.lti.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.training.DTO.StatusDTO;
import com.lti.training.DTO.UserDTO;
import com.lti.training.dao.RegisterDao;
import com.lti.training.entity.User;

//@Component
@Service
public class RegisterService {
	
	@Autowired
	private RegisterDao registerDao;
	
	@Transactional
	public StatusDTO save(UserDTO userDTO) {
		//Copying the data from the DTO to entity 
		User user = new User();
		
		user.setName(userDTO.getName());
		user.setEmail(userDTO.getEmail());
		user.setDob(userDTO.getDob());
		user.setPhNo(userDTO.getPhNo());
		user.setPass(userDTO.getPass());
		user.setCnfpass(userDTO.getCnfpass());
		
		
		
		
		int id =registerDao.save(user);
		
		StatusDTO status = new StatusDTO();
		status.setId(id);
		status.setMessage("CONGRATULATIONS !! You Have Registered Successfully ");
		return status;
	
	}
	

	}
	

