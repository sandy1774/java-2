package com.exception.resource;

import java.util.Scanner;

public class trywithResources {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("enter your name");
			String name=sc.next();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
