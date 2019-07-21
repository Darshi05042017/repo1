package com.lti.flightreservation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="Payment_Entity")
public class PaymentEntity {

	@Id
	@GeneratedValue
    private int paymentId;
	
	@OneToOne
	@JoinColumn(name="bookid")
	private BookDetailsEntity bookentity;
	
	private double paymentAmount;
	private String flclass;
	private String payDate;
	private String paymode;
	private String paymentStatus;
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public BookDetailsEntity getBookentity() {
		return bookentity;
	}
	public void setBookentity(BookDetailsEntity bookentity) {
		this.bookentity = bookentity;
	}
	public double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getFlclass() {
		return flclass;
	}
	public void setFlclass(String flclass) {
		this.flclass = flclass;
	}
	public String getPayDate() {
		return payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}
	
	public String getPaymode() {
		return paymode;
	}
	public void setPaymode(String paymode) {
		this.paymode = paymode;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	
	
	
}
