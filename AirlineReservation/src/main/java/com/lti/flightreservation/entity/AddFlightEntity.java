package com.lti.flightreservation.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="AR_ADDFLIGHT1")
public class AddFlightEntity {
	@Id
    private String flightId;
	
	private String companyName;
	private int capacity;
	private String source1;
	private String destination;
	private String duration;
	
	private String departureTime;
	private String arrivalTime;
	private int economyClassSeats;
	private double economyPrice;
	private int bussinessClassSeats;
	private double businessPrice;
	private String departureDate;
	private int seatsAvailableInEconomy;
	private int seatsAvailableInBusiness;
	private String stat;
	
	@OneToMany(mappedBy="addFlightEntity",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private List<BookDetailsEntity> bookDetailsEnt;
	
	public List<BookDetailsEntity> getBookDetailsEnt() {
		return bookDetailsEnt;
	}

	public void setBookDetailsEnt(List<BookDetailsEntity> bookDetailsEnt) {
		this.bookDetailsEnt = bookDetailsEnt;
	}

	public int getSeatsAvailableInEconomy() {
		return seatsAvailableInEconomy;
	}

	public void setSeatsAvailableInEconomy(int seatsAvailableInEconomy) {
		this.seatsAvailableInEconomy = seatsAvailableInEconomy;
	}

	public int getSeatsAvailableInBusiness() {
		return seatsAvailableInBusiness;
	}

	public void setSeatsAvailableInBusiness(int seatsAvailableInBusiness) {
		this.seatsAvailableInBusiness = seatsAvailableInBusiness;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getSource1() {
		return source1;
	}
	public void setSource1(String source1) {
		this.source1 = source1;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getEconomyClassSeats() {
		return economyClassSeats;
	}
	public void setEconomyClassSeats(int economyClassSeats) {
		this.economyClassSeats = economyClassSeats;
	}
	public double getEconomyPrice() {
		return economyPrice;
	}
	public void setEconomyPrice(double economyPrice) {
		this.economyPrice = economyPrice;
	}
	public int getBussinessClassSeats() {
		return bussinessClassSeats;
	}
	public void setBussinessClassSeats(int bussinessClassSeats) {
		this.bussinessClassSeats = bussinessClassSeats;
	}
	public double getBusinessPrice() {
		return businessPrice;
	}
	public void setBusinessPrice(double businessPrice) {
		this.businessPrice = businessPrice;
	}
	public String getStat() {
		return stat;
	}
	public void setStat(String stat) {
		this.stat = stat;
	}
	

	
	
	
}
