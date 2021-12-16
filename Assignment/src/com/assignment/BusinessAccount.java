package com.assignment;
import com.assignment.BankAccount;

public class BusinessAccount extends BankAccount{
	
	 private int minimumbalance = 25000;
	 private int depositupto = 10000000;
	 public BusinessAccount(double currentBalance) {
			super(currentBalance);
		}
		
	   @Override
		public double deposit(double amount) {
	    	 if(amount <depositupto) {
	    		 System.out.println("despoited your amount");
	    		 setCurrentBalance(getCurrentBalance()+amount);
	    		 return getCurrentBalance();
	    	 }
	    	 else {
	    		 System.out.println("error");
	    	 }
			return 0;
	     }
	     
	    @Override
	     public double withdraw(double amount) {
	    	 if(amount >minimumbalance) {
	    		 System.out.println("withdrawed your amount");
	    		 setCurrentBalance(getCurrentBalance()-amount);
	    		 return getCurrentBalance();
	    		 
	    	 }
	    	 else {
	    		 System.out.println("error");
	    	 }
			return 0;
	     }
	}


