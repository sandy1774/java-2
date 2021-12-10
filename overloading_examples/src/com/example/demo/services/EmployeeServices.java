package com.example.demo.services;
import com.example.demo.model.*;
public class EmployeeServices {

	//DRY principle followed; don't repeat;
	public double calculateBonus(Employee employee) {
		return calculateBonus(employee.getSalary());
	}
	
	//overloading
	public double calculateBonus(double salary) {
		return salary*.30;
		
   //overloading- object
		
	}
	public double calculateBonus(Double salary) {
		return salary*.30;
	}
	public Employee updateSalary(Employee employee) {
		double updatedSalary= employee.getSalary()+20000;
		employee.setSalary(updatedSalary);
		return employee;
		
	}
}
