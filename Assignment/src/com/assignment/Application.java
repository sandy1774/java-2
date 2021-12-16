package com.assignment;

import java.util.Scanner;

import com.assignment.*;
public class Application {
	static String dep = "deposit";
	static String cst = "BusinessAccount";
	public static void main(String[] args) {
		BankAccount businessAccount = new BusinessAccount(1000);
		BankAccount savingsAccount = new SavingsAccount(1000);
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter deposit or withdrawl");
		 String name = sc.next();
		 
		 System.out.println("enter the customer type");
		 String customerType = sc.next();
		 
		 System.out.println("enter the amount");
		 int amount = sc.nextInt();
		 
		 
		 if(name.equals(dep)){
			 if(customerType.equals(cst)) {
				 System.out.println(businessAccount.deposit(amount));
				 
			 }
			 else {
				 System.out.println(savingsAccount.deposit(amount));
			 }
		    }
		 else{
			 if(customerType.equals(cst)) {
				 System.out.println(businessAccount.withdraw(amount));
				
			 }
			 else {
				 savingsAccount.withdraw(amount);
			 }
		 }
		
	}

	}


