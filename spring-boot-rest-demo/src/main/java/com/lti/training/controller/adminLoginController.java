package com.lti.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.training.DTO.AdminLoginDTO;
import com.lti.training.DTO.StatusDTO;
import com.lti.training.service.AdminLoginService;

@RestController
public class adminLoginController {


	
	@Autowired
	private AdminLoginService adminloginService;

	@RequestMapping(path="/adminLogin", method=RequestMethod.POST)
		public StatusDTO register(@RequestBody AdminLoginDTO adminloginDTO) {
		
		
		    return adminloginService.save(adminloginDTO);
	   }
	
		}


