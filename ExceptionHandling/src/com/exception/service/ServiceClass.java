package com.exception.service;

public class ServiceClass {
	public double calculateTotalSalary(Employee[] empList) {
		double total=0.0;
		if (empList.length < 2 || empList.length > 5) {
			try {
				throw new RangeCheckException("length should be less than 2 greater than 5");
			} catch (RangeCheckException e) {
				e.printStackTrace();
			}
		} else {
			for (Employee emp : empList) {
				total = total + emp.getSalary();

			}
		}
		return total;
	}
}


