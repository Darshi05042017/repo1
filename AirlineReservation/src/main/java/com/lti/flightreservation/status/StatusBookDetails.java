package com.lti.flightreservation.status;

import org.springframework.stereotype.Component;

@Component
public class StatusBookDetails {

	private int bookid;
	private String message;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
