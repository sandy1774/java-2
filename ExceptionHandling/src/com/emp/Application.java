package com.emp;
import java.io.IOException;
import java.util.logging.*;
public class Application {
	public static void main(String[] args) {
		Logger logger=LoggingUtility.getLogger(Application.class);
		FileHandler handler;
		try {
			handler = new FileHandler("logs.log", true);
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
