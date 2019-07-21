package com.lti.flightreservation.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="AR_BOOKDETAILS")
public class BookDetailsEntity {
	@Id
    @GeneratedValue
	private int bookid;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="flightId")
	@JsonIgnore
	private AddFlightEntity addFlightEntity;
	
	private String fclass;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	@JsonIgnore
	private Register registeruser;
	
	@OneToOne(mappedBy="bookentity",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JsonIgnore	
	private PaymentEntity paymentEntity;
	private int noOfPass;
	private double amount;
	
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public AddFlightEntity getAddFlightEntity() {
		return addFlightEntity;
	}
	public void setAddFlightEntity(AddFlightEntity addFlightEntity) {
		this.addFlightEntity = addFlightEntity;
	}
	public String getFclass() {
		return fclass;
	}
	public void setFclass(String fclass) {
		this.fclass = fclass;
	}
	public Register getRegisteruser() {
		return registeruser;
	}
	public void setRegisteruser(Register registeruser) {
		this.registeruser = registeruser;
	}
	public int getNoOfPass() {
		return noOfPass;
	}
	public void setNoOfPass(int noOfPass) {
		this.noOfPass = noOfPass;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	

}
