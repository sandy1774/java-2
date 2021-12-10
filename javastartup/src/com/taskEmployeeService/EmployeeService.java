package com.taskEmployeeService;

import com.taskEmployee.Employee;

public class EmployeeService {
	
	
	public double calculateBonus(Employee emp) {
		 double bonus= (emp.getSalary()*33)/100;
		 return bonus;
		
		
	}

}
