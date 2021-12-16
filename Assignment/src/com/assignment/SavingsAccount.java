package com.assignment;

import com.assignment.BankAccount;

public class SavingsAccount extends BankAccount {
	 private int minimumBalance = 5000;
	 private int depositupto = 100000;
	
	 
	  public SavingsAccount(double currentBalance) {
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
	    		 return getCurrentBalance();
	    	 }
		  
	    
	  }
	
	  @Override
	     public double withdraw(double amount) {
		  if(amount >minimumBalance) {
	    		 System.out.println("withdrawl success please collect your cash");
	    		 setCurrentBalance(getCurrentBalance()-amount);
	    		 return getCurrentBalance();
	    	 }
	    	 else {
	    		 System.out.println("minimum balance");
	    		 return getCurrentBalance();
	    	 }
	     }
}
