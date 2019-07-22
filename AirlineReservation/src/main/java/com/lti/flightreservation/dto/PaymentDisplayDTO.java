package com.lti.flightreservation.dto;

public class PaymentDisplayDTO {
	private int paymentid;
	private int bookid;
	private String fclass;
	private int noOfPass;
	private String paydate;
	private String paymode;
	private double payamount;
	
	public synchronized double getPayamount() {
		return payamount;
	}
	public synchronized void setPayamount(double payamount) {
		this.payamount = payamount;
	}
	public synchronized int getPaymentid() {
		return paymentid;
	}
	public synchronized void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}
	public synchronized int getBookid() {
		return bookid;
	}
	public synchronized void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public synchronized String getFclass() {
		return fclass;
	}
	public synchronized void setFclass(String fclass) {
		this.fclass = fclass;
	}
	public synchronized int getNoOfPass() {
		return noOfPass;
	}
	public synchronized void setNoOfPass(int noOfPass) {
		this.noOfPass = noOfPass;
	}
	public synchronized String getPaydate() {
		return paydate;
	}
	public synchronized void setPaydate(String paydate) {
		this.paydate = paydate;
	}
	public synchronized String getPaymode() {
		return paymode;
	}
	public synchronized void setPaymode(String paymode) {
		this.paymode = paymode;
	}
	
	

}
