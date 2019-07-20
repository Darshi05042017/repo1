package com.lti.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.lti.flightreservation.dto.RegisterDTO;
import com.lti.flightreservation.dto.StatusDTO;
import com.lti.flightreservation.service.RegisterService;




@RestController
public class RegisterController {

	@Autowired
	private RegisterService registerService;

	@RequestMapping(path="/registered", method=RequestMethod.POST)
		public StatusDTO register(@RequestBody RegisterDTO registerDTO) {
		
		return registerService.save(registerDTO);
	   }
	
	}



