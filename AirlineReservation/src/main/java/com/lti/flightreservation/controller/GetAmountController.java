package com.lti.flightreservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.flightreservation.dto.AddFlightDTO;
import com.lti.flightreservation.entity.AddFlightEntity;
import com.lti.flightreservation.service.GetAmountService;


@RestController
public class GetAmountController {
	
@Autowired
private GetAmountService getAmountServ;
	
	@RequestMapping(path="/getAmount", method=RequestMethod.POST)
		public AddFlightEntity addNewFlight(@RequestBody AddFlightDTO addFlightDTO) {
		System.out.println(addFlightDTO);
		AddFlightEntity list =getAmountServ.fetchAmount(addFlightDTO);
			return list;

}
}