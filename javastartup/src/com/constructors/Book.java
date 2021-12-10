package com.constructors;

public class Book {
	
	private String authorName;
	private int bookId;
	private double price;
	public Book() {
		super(); 
		//Either super or this, but never both. coz super/this should be first line
		//this("yyy", 111, 5000);
	
	}
	
	public Book(String authorName, int bookId, double price) {
		super();
		this.authorName =authorName;
		this.bookId = bookId;
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
