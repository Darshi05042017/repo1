package com.lti.flightreservation.dto;

import org.springframework.stereotype.Component;

@Component
public class BookingHistoryDTO {
	private int bookId;
	private String flightid;
	private double amount;
	private String source;
	private String destination;
	private int noOfPassenger;
	private String travelClass;
	private String travelDate;
	private String departureTime;
	private String arrivalTime;
	private String duration;
	
	public synchronized String getDuration() {
		return duration;
	}
	public synchronized void setDuration(String duration) {
		this.duration = duration;
	}
	public synchronized int getBookId() {
		return bookId;
	}
	public synchronized void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public synchronized String getFlightid() {
		return flightid;
	}
	public synchronized void setFlightid(String flightid) {
		this.flightid = flightid;
	}
	public synchronized double getAmount() {
		return amount;
	}
	public synchronized void setAmount(double amount) {
		this.amount = amount;
	}
	public synchronized String getSource() {
		return source;
	}
	public synchronized void setSource(String source) {
		this.source = source;
	}
	public synchronized String getDestination() {
		return destination;
	}
	public synchronized void setDestination(String destination) {
		this.destination = destination;
	}
	public synchronized int getNoOfPassenger() {
		return noOfPassenger;
	}
	public synchronized void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}
	public synchronized String getTravelClass() {
		return travelClass;
	}
	public synchronized void setTravelClass(String travelClass) {
		this.travelClass = travelClass;
	}
	public synchronized String getTravelDate() {
		return travelDate;
	}
	public synchronized void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}
	public synchronized String getDepartureTime() {
		return departureTime;
	}
	public synchronized void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public synchronized String getArrivalTime() {
		return arrivalTime;
	}
	public synchronized void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	

}
