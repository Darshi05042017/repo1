package com.lti.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.training.DTO.AdminLoginDTO;
import com.lti.training.DTO.StatusDTO;
import com.lti.training.dao.adminLoginDao;
import com.lti.training.entity.AdminLogin;


//@Component
@Service
public class AdminLoginService {
	
	@Autowired
	private adminLoginDao adminloginDao;
	
	@Transactional
	public StatusDTO save(AdminLoginDTO adminloginDTO) {
		//Copying the data from the DTO to entity 
		AdminLogin adminlogin = new AdminLogin();
		
		adminlogin.setName(adminloginDTO.getName());
		adminlogin.setPassword(adminloginDTO.getPassword());
	
		
		
		int id =adminloginDao.save(adminlogin);
		
		StatusDTO status = new StatusDTO();
		status.setId(id);
		status.setMessage("CONGRATULATIONS !! You Have Logged in Successfully ");
		return status;
	
	}
	

	}
	

