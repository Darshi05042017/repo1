package com.lti.flightreservation.dto;

import org.springframework.stereotype.Component;

@Component
public class PaymentDYTO {
	
	private String bookid;
	private double paymentAmount;
	private String fclass;
	private String payDate;
	private String mode;
	private String paymentStatus;
	
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getFclass() {
		return fclass;
	}
	public void setFclass(String fclass) {
		this.fclass = fclass;
	}
	public String getPayDate() {
		return payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

}
