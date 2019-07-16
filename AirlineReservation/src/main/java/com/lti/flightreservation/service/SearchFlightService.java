package com.lti.flightreservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.lti.flightreservation.dao.SearchFlightDao;
import com.lti.flightreservation.dto.AddFlightDTO;
import com.lti.flightreservation.entity.AddFlightEntity;

@Component
public class SearchFlightService {
	@Autowired 
	private SearchFlightDao searchFlightDao;

	public List<AddFlightEntity> search(AddFlightDTO addFlightDTO) {
		
		AddFlightEntity afe= new AddFlightEntity();
		afe.setSource1(addFlightDTO.getSource1());
		afe.setDestination(addFlightDTO.getDestination());
		afe.setDepartureDate(addFlightDTO.getDepartureDate());
		afe.setStat("active");
		List<AddFlightEntity> list =searchFlightDao.search(afe);
		return list;
		
	}
	
	
	
	

}
