package com.lti.flightreservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.flightreservation.dto.BookingHistoryDTO;
import com.lti.flightreservation.dto.RegisterDTO;
import com.lti.flightreservation.entity.BookDetailsEntity;
import com.lti.flightreservation.service.BookHistoryService;


@RestController
public class BookHistoryController {

	@Autowired
	private BookHistoryService bhs;
	
	@RequestMapping(path="/bookHistory", method=RequestMethod.POST)
	public List<BookingHistoryDTO> delete(@RequestBody RegisterDTO register) {
		List<BookingHistoryDTO> reg=bhs.bookHistory(register);
		return reg;
	
}
}
