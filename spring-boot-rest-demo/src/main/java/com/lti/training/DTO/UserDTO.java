package com.lti.training.DTO;

import java.sql.Date;

public class UserDTO {
	private String name;
	private String email;
	private String dob;
	private int phNo;
	private int pass;
	private int cnfpass;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getPhNo() {
		return phNo;
	}
	public void setPhNo(int phNo) {
		this.phNo = phNo;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	public int getCnfpass() {
		return cnfpass;
	}
	public void setCnfpass(int cnfpass) {
		this.cnfpass = cnfpass;
	}
	
	
	
	
}
