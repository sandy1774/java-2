package com.example.demo.utils;

import java.util.logging.Logger;

import com.example.demo.Application;

public class LoggingUtility {
	
	public static Logger getLogger(Class clsName) {
		
		      String path = clsName
		                  .getResource("logging.properties")
		                  .getFile();
		      System.setProperty("java.util.logging.config.file", path);
		      return Logger.getLogger(clsName.getName());
		      
		
		
	}

}
