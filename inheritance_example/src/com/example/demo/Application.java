package com.example.demo;

import com.example.demo.model.Employee;
import com.example.demo.model.Manager;
import com.example.demo.services.EmployeeService;

public class Application {
	public static void main(String[] args) {
		Employee ram=new Employee(101, "ramesh","manager",60000);
		String[] skills= {"java", "c", "c++", "python"};
		Manager mgr=new Manager(102,"Suresh","Manager",75000,skills);
		//even if we didnt call toString(), it will be called automatically
		//System.out.println(ram.hello());
		System.out.println(mgr.getEmplyoeeId());
		System.out.println(mgr.getEmplyoeeName());
		System.out.println(mgr.getDesignation());
		for(String eachSkill:mgr.getSkillSet())
			System.out.println(eachSkill);
		
		
		EmployeeService empSer=new EmployeeService();
		Employee[] empList=new Employee[4];
		Employee e1 = new Employee(11,"ddd","manager",9999);
	    Employee e2= new Employee(12,"ppp","dev",999000);
	    Employee e3= new Employee(18,"ppp","dev",999000);
	    empList[0]=e1;
	    empList[1]=e2;
	    empList[2]=e3;
	    empSer.printEmployees(empList);
	    
	    //Employee[] empList = {mgr1, mgr2}
	    
	    
	    
	    
	    
	    
	    
	    
	    


	}

}
