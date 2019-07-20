package com.lti.flightreservation.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="AR_TBL_REG")
public class Register {
	
			@Id
		    @GeneratedValue
			private int id;
			private String name;
			@Column(unique = true)
			private String email;
			private String dob;
			private long phNo;
			private int pass;
			private int cnfpass;
			
			@OneToMany(mappedBy="register",fetch=FetchType.EAGER)
			private Set<PassAddDets> passDetails;
			
			public Set<PassAddDets> getPassDetails() {
				return passDetails;
			}
			public void setPassDetails(Set<PassAddDets> passDetails) {
				this.passDetails = passDetails;
			}
			@Override
			public String toString() {
				return "Register [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", phNo=" + phNo
						+ ", pass=" + pass + ", cnfpass=" + cnfpass + ", getId()=" + getId() + ", getName()="
						+ getName() + ", getEmail()=" + getEmail() + ", getDob()=" + getDob() + ", getPhNo()="
						+ getPhNo() + ", getPass()=" + getPass() + ", getCnfpass()=" + getCnfpass() + ", getClass()="
						+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
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
			public long getPhNo() {
				return phNo;
			}
			public void setPhNo(long phNo) {
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
		
		
	