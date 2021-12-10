package com.example.demo.model;
import static java.lang.Math.*;

public class Invoice {
	
	//declaring a constant - note all caps - values cannot be changed
	public static final int STARTNUMBER=10;
	private int invoiceNumber;
	private static double discount;
	
	
	public void show() {
		System.out.println(invoiceNumber);
		System.out.println(discount);
		showAll();
		//STARTNUMBER++;
	}
	
	//instance variable cannot be accessed in static method
	public static void showAll() {
		
		//System.out.println(invoiceNumber);
		System.out.println(discount);
		//show();
		
		System.out.println(Math.sqrt(4)); //since static import is used we are not using Math(class name)
		double radian30=toRadians(30);
		double radian60=toRadians(60);
		System.out.println(sin(radian30));
		System.out.println(cos(radian60));
		
	}
	
	
	

}
