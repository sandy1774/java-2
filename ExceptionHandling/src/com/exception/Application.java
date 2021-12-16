package com.exception;

import com.exception.resource.MyService;

public class Application {

	public static void main(String[] args) {
 	
		MyService myservice=new MyService();
		myservice.mark();
		myservice.markWithNestedTryCatch("50");
		myservice.multipleCatch("45");
		String city=null;
		try {
			myservice.exampleForDeclare(null);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
