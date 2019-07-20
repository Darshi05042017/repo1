package com.lti.flightreservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.flightreservation.dao.GetAmountDao;
import com.lti.flightreservation.dto.AddFlightDTO;
import com.lti.flightreservation.entity.AddFlightEntity;

@Service
public class GetAmountService {
	@Autowired
	private GetAmountDao gad;
	
	@Transactional
	public AddFlightEntity fetchAmount(AddFlightDTO addFlightDTO) {
		AddFlightEntity afe= new AddFlightEntity();
		afe.setFlightId(addFlightDTO.getFlightId());
		AddFlightEntity list = gad.getPrice(afe);
			return list;
		}
		
	}


