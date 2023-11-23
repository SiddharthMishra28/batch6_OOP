package com.gyanoholic.oopdemo4;

public class Person {
	
	public String firstName;
	private String lastName;
	private String emailId;
	private String mobileNumber;
	private String adhaar = "326409385738";
	
	// GETTERS AND SETTERS
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getAdhaar() {
		return this.adhaar;
	}
	
	public void setEmail(String email) {
		this.emailId = email;
	}
	
	public void setMobileNumber(String mobNum) {
		this.mobileNumber = mobNum;
	}
}
