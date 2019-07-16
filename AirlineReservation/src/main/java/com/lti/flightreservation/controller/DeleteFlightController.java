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
public class DeleteFlightController {
	
	@Autowired
	private AddFlightService addFlightService;
	private StatusFlightAdd status;

	@RequestMapping(path="/deleteFlight", method=RequestMethod.POST)
		public StatusFlightAdd register(@RequestBody AddFlightDTO addFlightDTO) {
		
		System.out.println(addFlightDTO.getFlightId());
		
		addFlightService.delete(addFlightDTO);
		return status;
	   }

}