package com.lti.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.flightreservation.dto.AddFlightDTO;
import com.lti.flightreservation.service.AddFlightService;
import com.lti.flightreservation.status.StatusFlightAdd;


@RestController
public class AddFlightController {
	
	@Autowired
	private AddFlightService addFlightService;
	private StatusFlightAdd status;

	@RequestMapping(path="/addFlight", method=RequestMethod.POST)
		public StatusFlightAdd addNewFlight(@RequestBody AddFlightDTO addFlightDTO) {
		
		StatusFlightAdd status= addFlightService.save(addFlightDTO);
		
		    return status;
	   }

}