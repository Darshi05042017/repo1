package com.lti.flightreservation.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.flightreservation.entity.Register;
import com.lti.flightreservation.service.UserLoginService;



@RestController
public class UserLoginController {

	@Autowired
	private UserLoginService userloginService;
	
	@RequestMapping(path = "/userLogin",method = RequestMethod.GET)
	public Register fetchPassword(@RequestParam("email") String email ) {
		//System.out.println(login.getEmail());
		//System.out.println(login.getPass());
		System.out.println("controller reached");
		
		return userloginService.showSearch(email);
	}
}
