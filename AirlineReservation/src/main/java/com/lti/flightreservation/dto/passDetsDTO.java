package com.lti.flightreservation.dto;

import com.lti.flightreservation.entity.Register;

public class passDetsDTO {
	
    private int id;
    private String gender;
	
	private String name;
	private long phNo;
	private int userid;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "passDetsDTO [id=" + id + ", gender=" + gender + ", name=" + name + ", phNo=" + phNo + "]";
	}
	public passDetsDTO() {
		
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
}