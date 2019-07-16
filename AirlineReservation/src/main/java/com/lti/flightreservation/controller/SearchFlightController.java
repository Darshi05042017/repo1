package com.lti.flightreservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.flightreservation.dto.AddFlightDTO;
import com.lti.flightreservation.entity.AddFlightEntity;
import com.lti.flightreservation.service.SearchFlightService;
import com.lti.flightreservation.status.StatusFlightAdd;

@RestController
public class SearchFlightController {
	@Autowired
	private SearchFlightService searchFlightService;
	
	@RequestMapping(path="/searchFlight", method=RequestMethod.POST)
		public List<AddFlightEntity> register(@RequestBody AddFlightDTO addFlightDTO) {
	
		List<AddFlightEntity> list =searchFlightService.search(addFlightDTO);
		for(AddFlightEntity fl :list) {
			System.out.println(fl.getCompanyName());
		}
		    
		return list;
	   }

}