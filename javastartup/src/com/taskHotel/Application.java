package com.taskHotel;

import com.taskCustomer.Customer;
import com.taskEmployee.Employee;
import com.taskEmployeeService.EmployeeService;

public class Application {
	public static void main(String[] args) {
		Customer cust=new Customer();
		cust.setName("yyy");
		cust.setPlace("chennai");
		cust.setEmailId("raj@excelacom.in");
		System.out.println(cust.getName());
		System.out.println(cust.getPlace());
		System.out.println(cust.getEmailId());
		System.out.println("\n");
		
		Employee emp=new Employee();
		EmployeeService service=new EmployeeService();
		emp.setVaccinated(true);
		emp.setCabNo("TN-05-3003");
		emp.setSalary(10000);
		System.out.println(emp.getCabNo());
		System.out.println(emp.getSalary());
		System.out.println(emp.isVaccinated());
		System.out.println("Bonus:" + service.calculateBonus(emp));
		System.out.println("\n");
		
		Hotel hotell= new Hotel();
		hotell.setNoOfRooms(199);
		hotell.setRatePerDay(4000);
		hotell.setRating(5.5);
		System.out.println(hotell.getNoOfRooms());
		System.out.println(hotell.getRatePerDay());
		System.out.println(hotell.getRating());
		
		
		
		
	}

}
