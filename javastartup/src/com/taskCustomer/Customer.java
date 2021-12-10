package com.taskCustomer;

public class Customer {

	private String name;
	private String place;
	private String emailId;
	public Customer() {
		super();
		
	}
	public Customer(String name, String place, String emailId) {
		super();
		this.name = name;
		this.place = place;
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
