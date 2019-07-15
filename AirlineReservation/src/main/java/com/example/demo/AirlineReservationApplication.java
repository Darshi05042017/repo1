package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.lti.flightreservation.controller")
@ComponentScan("com.lti.flightreservation.dto")
@ComponentScan("com.lti.flightreservation.dao")
@ComponentScan("com.lti.flightreservation.service")
@ComponentScan("com.lti.flightreservation.status")
@EntityScan("com.lti.flightreservation.entity")
public class AirlineReservationApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(AirlineReservationApplication.class, args);
	
	}

}
 