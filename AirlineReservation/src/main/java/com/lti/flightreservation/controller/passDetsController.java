package com.lti.flightreservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lti.flightreservation.dao.StatusDTO;
import com.lti.flightreservation.dto.passDetsDTO;
import com.lti.flightreservation.service.passDetsService;


@RestController
public class passDetsController {


	
	@Autowired
	private passDetsService passdetsService;

	@RequestMapping(path="/passdets", method=RequestMethod.POST)
		public StatusDTO register(@RequestBody passDetsDTO[] passdetsDTO) {
		
		return passdetsService.save(passdetsDTO);
	   }
	
		}


