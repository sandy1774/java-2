package com.training;

public class TestGreeting {

	public static void main(String[] args) {
		Greeting gobj=new Greeting();
		System.out.println(gobj.getMessage(args[1]));
		System.out.println(Greeting.print());
	}
	

}
