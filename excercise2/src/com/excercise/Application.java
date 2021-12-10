package com.excercise;

public class Application {
	public static void main(String[] args) {
		
		final String NAME="IDEA";
		Address address=new Address("2/3", "tirumalastreet","tamilnadu");
		MobileBill mobileBill=new MobileBill("xxx", 9999, "prepaid",address);
		MobileBillService mobService=new MobileBillService();
		
		
		System.out.println("plan of customer" + mobService.findAmount(mobileBill) );
		
		System.out.println(mobileBill.getCustomerName()+mobileBill.getMobilenumber());
		
		
	}

}
