package com.excercise;

public class Address {

	private String plotNo;
	private String streetName;
	private String state;
	public String getPlotNo() {
		return plotNo;
	}
	public void setPlotNo(String plotNo) {
		this.plotNo = plotNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address(String plotNo, String streetName, String state) {
		super();
		this.plotNo = plotNo;
		this.streetName = streetName;
		this.state = state;
	}
	public Address() {
		super();
		
	}
}
