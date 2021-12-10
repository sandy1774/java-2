package com.taskEmployee;

public class Employee {
	
	private String cabNo;
	private boolean isVaccinated;
	private double salary;
	public Employee() {
		super();
	}
	public Employee(String cabNo, boolean isVaccinated, double salary) {
		super();
		this.cabNo = cabNo;
		this.isVaccinated = isVaccinated;
		this.salary = salary;
	}
	public String getCabNo() {
		return cabNo;
	}
	public void setCabNo(String cabNo) {
		this.cabNo = cabNo;
	}
	public boolean isVaccinated() {
		return isVaccinated;
	}
	public void setVaccinated(boolean isVaccinated) {
		this.isVaccinated = isVaccinated;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
