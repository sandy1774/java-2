package com.excercise;

public class MobileBillService {

	
	public String findAmount(MobileBill mobileBill) {
		
		switch(mobileBill.getPlanname()) {
		case "prepaid":
		return "bill 200";
		
		case "postpaid":
		return "bill 300";
		
		default:
		return "no bill";
		
		}
		
		
	}
	
	
	
}
