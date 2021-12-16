package com.assignment;

public abstract class BankAccount {
	private double currentBalance;
	

	        
	  public abstract  double deposit(double amount);
		
	  public abstract  double withdraw(double amount);

	public BankAccount(double currentBalance) {
		super();
		this.currentBalance = currentBalance;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

}
	  
	



