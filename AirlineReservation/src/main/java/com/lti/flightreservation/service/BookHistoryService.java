package com.lti.flightreservation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.flightreservation.dao.BookHistoryDao;
import com.lti.flightreservation.dto.BookingHistoryDTO;
import com.lti.flightreservation.dto.RegisterDTO;
import com.lti.flightreservation.entity.BookDetailsEntity;



@Service
public class BookHistoryService {
	
	@Autowired
	private BookHistoryDao bhd;
	
	

	@Transactional
	public List<BookingHistoryDTO> bookHistory(RegisterDTO register) {
	
		List<BookingHistoryDTO> bhdt=new ArrayList<BookingHistoryDTO>();
		
		int id=register.getId();
		List<BookDetailsEntity> reg=bhd.fetchHistory(id);
		for(BookDetailsEntity b:reg) {
			BookingHistoryDTO bhdto=new BookingHistoryDTO();
			bhdto.setBookId(b.getBookid());
			bhdto.setFlightid(b.getAddFlightEntity().getFlightId());
			bhdto.setNoOfPassenger(b.getNoOfPass());
			bhdto.setAmount(b.getAmount());
			bhdto.setSource(b.getAddFlightEntity().getSource1());
			bhdto.setDestination(b.getAddFlightEntity().getDestination());
			bhdto.setArrivalTime(b.getAddFlightEntity().getArrivalTime());
			bhdto.setDepartureTime(b.getAddFlightEntity().getDepartureTime());
			bhdto.setTravelDate(b.getAddFlightEntity().getDepartureDate());
			bhdto.setDuration(b.getAddFlightEntity().getDuration());
			bhdto.setTravelClass(b.getFclass());
			bhdt.add(bhdto);
		}
		
		return bhdt;
	
	}

}
