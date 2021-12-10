package com.example.demo.services;

import com.example.demo.model.Employee;

public class EmployeeService {

	public void printEmployees(Employee[] emplist) {
		
		for(Employee emp: emplist) {
			System.out.println(emp);
			}
		
	}
}
