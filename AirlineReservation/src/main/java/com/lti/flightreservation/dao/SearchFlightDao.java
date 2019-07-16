package com.lti.flightreservation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.flightreservation.entity.AddFlightEntity;


@Repository
public class SearchFlightDao {
	
	@PersistenceContext
	private EntityManager entitymanager;

	public List<AddFlightEntity> search(AddFlightEntity afe) {
		Query query = entitymanager.createQuery("SELECT adf from AddFlightEntity adf where adf.departureDate=:dt and adf.source1=:sr and adf.destination=:dest and adf.stat=:st");
	      query.setParameter("st", afe.getStat());
	      query.setParameter("dt", afe.getDepartureDate());
	      query.setParameter("sr", afe.getSource1());
	      query.setParameter("dest", afe.getDestination());
	      
	      List<AddFlightEntity> resultList = query.getResultList();
	     
	     return resultList;
		
	}

	

}
