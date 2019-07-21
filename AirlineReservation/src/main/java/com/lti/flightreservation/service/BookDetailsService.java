package com.lti.flightreservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.flightreservation.dao.BookFlightDao;
import com.lti.flightreservation.dto.BookDetailsDTO;
import com.lti.flightreservation.entity.AddFlightEntity;
import com.lti.flightreservation.entity.BookDetailsEntity;
import com.lti.flightreservation.entity.Register;

@Service
public class BookDetailsService {
	
	@Autowired
	private BookFlightDao bfd;
	
	@Transactional
	public BookDetailsEntity bookDetails(BookDetailsDTO bookDetailstDTO) {
		
		BookDetailsEntity bde=new BookDetailsEntity();
		
		
		int id= bookDetailstDTO.getUserid();
		Register register= bfd.find(Register.class,id);
		bde.setRegisteruser(register);
		String flightId=bookDetailstDTO.getFlightId();
		AddFlightEntity flight = bfd.findFlight(AddFlightEntity.class,flightId);
		bde.setAddFlightEntity(flight);
		String fclass = bookDetailstDTO.getFclass();
		bde.setFclass(fclass);
		double price;
		if(fclass.equals("Economy"))
		{
			price= flight.getEconomyPrice();
		}
		else
			price=flight.getBusinessPrice();
		
		int noOfPassenger= bookDetailstDTO.getNoOfPass();
		bde.setAmount(price * noOfPassenger);
		bde.setNoOfPass(noOfPassenger);
		BookDetailsEntity bdentity=bfd.addBookDetails(bde);
		return bdentity;
	}

}
