package com.taskHotel;

public class Hotel {
	
	private double rating;
	private int noOfRooms;
	private double ratePerDay;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(float rating, int noOfRooms, double ratePerDay) {
		super();
		this.rating = rating;
		this.noOfRooms = noOfRooms;
		this.ratePerDay = ratePerDay;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getNoOfRooms() {
		return noOfRooms;
	}
	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}
	public double getRatePerDay() {
		return ratePerDay;
	}
	public void setRatePerDay(double ratePerDay) {
		this.ratePerDay = ratePerDay;
	}

}
