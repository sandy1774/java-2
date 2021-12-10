package com.example.demo;

import java.util.Scanner;

import com.example.demo.model.Employee;
import com.example.demo.model.Invoice;
import com.example.demo.services.EmployeeServices;

public class Application {
	public static void main(String[] args) {
		
		int employeeId= Integer.parseInt(args[0]);
		String employeeName=args[1];
		String designation=args[2];
		double salary=Double.parseDouble(args[3]);
	 
		Employee ram=new Employee(employeeId, employeeName, designation, salary );
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int empid=sc.nextInt();
		System.out.println("enter name");
		String empname=sc.next();
		System.out.println("enter desig");
		String desig=sc.next();
		System.out.println("enter sal");
		double sal=sc.nextDouble();
		
		sc.close();
		
		
		
		
		
		
		
		Employee suresh=new Employee(103,"Deva","developer",60000);  
		
		//calling overloaded method
		
		EmployeeServices service= new EmployeeServices();
		System.out.println("Expected:15000 => Actual :"+ (service.calculateBonus(ram)));
		System.out.println("Expected:18000 => Actual: " + (service.calculateBonus(suresh.getSalary())));
		System.out.println(employeeId);
		Double salary2=Double.valueOf(50000);
		System.out.println(service.calculateBonus(salary2));
		int intSalary2= (int)(salary2.doubleValue());
		System.out.println(intSalary2);
		Employee rakesh=new Employee(111,"eee","dev",70000);
		
		service.updateSalary(rakesh);
		
		System.out.println(rakesh.getSalary());
		
		Invoice.showAll();		
		
		
	 	 
  		
	}

}
