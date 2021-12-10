package com.modifiers;

public class Application {

	public static void main(String[] args) {

		Student ram=new Student();
//		cant access firstname coz of private modifiers
//		System.out.println(ram.firstName);
		
//		can access fees coz of public modifiers
		System.out.println(ram.fees);
	}

}
