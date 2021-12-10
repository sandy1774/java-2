package com.example.demo;

public class Application {
	public static void main(String[] args) {
		
		Employee ram= new Employee(101,"Ramesh","manager",60000);
		Employee shyam= new Employee(101,"Ramesh","manager",60000);
		boolean isEqual=ram.equals(shyam);
		System.out.println("expexted:True => actual="+ isEqual);
		
		Employee oneMoreRam=ram;
		boolean isSame=ram.equals(oneMoreRam);
		System.out.println(isSame);
		}

}
