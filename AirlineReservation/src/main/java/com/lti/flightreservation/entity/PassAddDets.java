package com.lti.flightreservation.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lti.flightreservation.dto.RegisterDTO;

@Entity
@Table(name="AR_PASS_DETAILS")
public class PassAddDets {
	@Id
	@GeneratedValue
	private int bid;
	private String gender;
	
	private String name;
	private long phNo;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	@JsonIgnore
	private Register register;
	
	
	
	public Register getRegister() {
		return register;
	}
	public void setRegister(Register i) {
		this.register = i;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	
	
}
