package com.lti.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.lti.flightreservation.dto.BookDetailsDTO;
import com.lti.flightreservation.entity.BookDetailsEntity;
import com.lti.flightreservation.service.BookDetailsService;
import com.lti.flightreservation.status.StatusBookDetails;




@RestController
public class BookDetailsController {

	@Autowired
	private BookDetailsService bookDetailsService;
	
	
	@RequestMapping(path="/bookFlight", method=RequestMethod.POST)
	public BookDetailsEntity bookDetails(@RequestBody BookDetailsDTO bookDetailstDTO) {
		
		
		return bookDetailsService.bookDetails(bookDetailstDTO);
	}
}
