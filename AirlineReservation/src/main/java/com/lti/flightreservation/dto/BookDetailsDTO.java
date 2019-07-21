package com.lti.flightreservation.dto;

public class BookDetailsDTO {

	private String flightId;
	private String fclass;
	private int userid;
	private int noOfPass;
	private int bookId;
	private double amount;
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getFclass() {
		return fclass;
	}
	public void setFclass(String fclass) {
		this.fclass = fclass;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getNoOfPass() {
		return noOfPass;
	}
	public void setNoOfPass(int noOfPass) {
		this.noOfPass = noOfPass;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	
	
}
