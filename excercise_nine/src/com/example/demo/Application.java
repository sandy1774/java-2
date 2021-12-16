package com.example.demo;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Application {
	public static void main(String[] args) {
		Logger logger=LoggingUtility.getLogger(Application.class);
		FileHandler handler;

		try {	
			handler = new FileHandler("Slogs.log", true);
			logger.addHandler(handler);
			Customer cust = new Customer(102,"nerkundram", "santhosh@gmail");
			logger.info(cust.toString());
		} catch (InvalidEmailException |SecurityException|IOException e) {
			e.printStackTrace();

		}


	}

}
