package com.exception.service;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import com.emp.*;
public class TestCustomException {

	public static void main(String[] args) {
		Logger logger=LoggingUtility.getLogger(TestCustomException.class);
		try {
			FileHandler handler = new FileHandler("logs.log", true);
			logger.addHandler(handler);
		} catch (SecurityException e1) {

			e1.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		Employee ram=new Employee();
		ram.setEmplyoeeId(101);
		ram.setDesignation("dev");
		ram.setEmplyoeeName("ram");
		ram.setSalary(6767);
		logger.info(ram.toString());
		try {
			Employee shyam=new Employee(101, "sss", "dev", 6000);
			logger.info(shyam.toString());
		} catch (RangeCheckException e) {

			logger.warning(e.getMessage());
		}

	}

}
