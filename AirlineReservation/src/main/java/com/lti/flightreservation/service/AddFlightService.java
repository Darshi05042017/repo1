package com.lti.flightreservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.flightreservation.dao.AddFlightDao;
import com.lti.flightreservation.dto.AddFlightDTO;
import com.lti.flightreservation.entity.AddFlightEntity;
import com.lti.flightreservation.status.StatusFlightAdd;

@Component
public class AddFlightService {
	
	@Autowired 
	private AddFlightDao addFlightDao;
	
	@Transactional
	public StatusFlightAdd save(AddFlightDTO addFlightDTO) {
		
		
			AddFlightEntity afe= new AddFlightEntity();
			
			afe.setFlightId(addFlightDTO.getFlightId());
			afe.setCompanyName(addFlightDTO.getCompanyName());
			afe.setCapacity(addFlightDTO.getCapacity());
			afe.setSource(addFlightDTO.getSource());
			afe.setDestination(addFlightDTO.getDestination());
			afe.setDuration(addFlightDTO.getDuration());
			afe.setDepartureDate(addFlightDTO.getDepartureDate());
			afe.setArrivalTime(addFlightDTO.getArrivalTime());
			afe.setEconomyClassSeats(addFlightDTO.getEconomyClassSeats());
			afe.setEconomyPrice(addFlightDTO.getEconomyPrice());
			afe.setBussinessClassSeats(addFlightDTO.getBussinessClassSeats());
			afe.setBusinessPrice(addFlightDTO.getBusinessPrice());
			afe.setStat(addFlightDTO.getStat());
			
			
			String status1= addFlightDao.save(afe);
			
			StatusFlightAdd status = new StatusFlightAdd();
			status.setStatus(status1);
			return status;
		
		}
	} 


