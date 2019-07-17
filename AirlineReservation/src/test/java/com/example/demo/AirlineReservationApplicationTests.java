package com.example.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.lti.flightreservation.controller.AddFlightController;
import com.lti.flightreservation.controller.DeleteFlightController;
import com.lti.flightreservation.controller.SearchFlightController;
import com.lti.flightreservation.dao.AddFlightDao;
import com.lti.flightreservation.dao.SearchFlightDao;
import com.lti.flightreservation.dto.AddFlightDTO;
import com.lti.flightreservation.entity.AddFlightEntity;
import com.lti.flightreservation.service.AddFlightService;
import com.lti.flightreservation.service.SearchFlightService;

@RunWith(SpringRunner.class)
@DataJpaTest
@Rollback(false)
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class AirlineReservationApplicationTests {
	@Autowired
	private AddFlightDao ado;
	@Autowired
	private AddFlightService afs;
	@Autowired
	private SearchFlightService sfs;
	@Autowired
	private SearchFlightDao sfd;
	@Autowired
	private DeleteFlightController dfc;
	@Autowired
	private AddFlightDTO afdto;
	@Autowired
	private AddFlightController afc;
	@Autowired
	private SearchFlightController sfc;

	@Test
	public void deleteFlight() {
		AddFlightDTO afe=new AddFlightDTO();
		afe.setFlightId("AirIndia123");
		dfc.delete(afe);
	}
	
	@Test
	public void addNewFlight() {
		AddFlightDTO afe=new AddFlightDTO();
		afe.setFlightId("AirIndia1235");
		afe.setCompanyName("AirIndia");
		afe.setCapacity(50);
		afe.setSource1("Pune");
		afe.setDestination("Chennai");
		afe.setDuration("2:15");
		afe.setDepartureTime("15:45");
		afe.setArrivalTime("15:00");
		afe.setEconomyClassSeats(40);
		afe.setEconomyPrice(1250);
		afe.setBussinessClassSeats(10);
		afe.setBusinessPrice(1550);
		afe.setDepartureDate("2019-07-20");
		afe.setStat("active");
		
		afc.addNewFlight(afe);
	}
	
	@Test
	public void searchFlight() {
		
		AddFlightDTO afe=new AddFlightDTO();
		afe.setSource1("Delhi");
		afe.setDestination("Mumbai");
		afe.setDepartureDate("2019-07-18");
		afe.setFclass("Economy");
		afe.setNoOfPassengers(5);
		List<AddFlightEntity> list= sfc.search(afe);
		
		for(AddFlightEntity af : list) {
			System.out.println(af.getCompanyName());
			System.out.println(af.getSource1());
			System.out.println(af.getDestination());
			System.out.println(af.getEconomyPrice());
			System.out.println(af.getEconomyClassSeats());
			System.out.println(af.getDepartureDate());
			System.out.println(af.getDepartureTime());
			System.out.println(af.getArrivalTime());
			
		}
		
		
		
	}
	

}
