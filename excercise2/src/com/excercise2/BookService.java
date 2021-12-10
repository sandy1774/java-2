package com.excercise2;

public class BookService {
	
	
	public double calculateDiscount(Book book) {
		
		if(book.getPrice()<=500) {
			double discount=(book.getPrice()*.05);
			return discount;
		}
		else if(book.getPrice()>500 && book.getPrice()<1000){
			double discount = (book.getPrice()*0.1);
			return discount;
			
			
		}
		else
		{
			double discount=(book.getPrice()*.12);
			return discount;
		}
	    }
	public double calculateDiscount(Book book,String customerType) {
		
	
		switch(customerType.toLowerCase()) {
		case "corporate":
		if(book.getPrice()<500) {
			double discount=(book.getPrice()*.07);
			return discount;
		}
		else if(book.getPrice()>500 && book.getPrice()<1000){
			double discount = (book.getPrice()*0.12);
			return discount;
		}
		else
		{
			double discount=(book.getPrice()*.15);
			return discount;
		}
		case "retail":
			if(book.getPrice()<=500) {
				double discount=(book.getPrice()*.05);
				return discount;
			}
			else if(book.getPrice()>500 && book.getPrice()<1000){
				double discount = (book.getPrice()*0.10);
				return discount;
					
					
			}
			else
			{
				double discount=(book.getPrice()*.12);
				return discount;
			}
			
		
		    }
		return 0;
	
		
		}
	}




