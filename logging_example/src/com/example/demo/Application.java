package com.example.demo;
import java.io.IOException;
import java.util.logging.*;

import com.example.demo.utils.LoggingUtility;

public class Application {
	//SimpleFormatter form;

//	static Logger logger=Logger.getLogger(Application.class.getClass().getName());
	
	  
	public static void main(String[] args) {
		
		
//		logger.setLevel(Level.INFO);
		Logger logger=LoggingUtility.getLogger(Application.class);

		
		FileHandler handler;
		try {
			handler = new FileHandler("mylogs.log", true);
			logger.addHandler(handler);
		} catch (SecurityException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		logger.severe("critical message");
		logger.warning("warning");
		logger.info("logger implemented successfully");
		logger.fine("finer txt");
	}

}
