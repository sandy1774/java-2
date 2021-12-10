package com.example.demo;

public class Employee {
	private int emplyoeeId;
	private String emplyoeeName;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + emplyoeeId;
		result = prime * result + ((emplyoeeName == null) ? 0 : emplyoeeName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (emplyoeeId != other.emplyoeeId)
			return false;
		if (emplyoeeName == null) {
			if (other.emplyoeeName != null)
				return false;
		} else if (!emplyoeeName.equals(other.emplyoeeName))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	private String designation;
	private double salary;
	public Employee() {
		super();
		
	}
	public Employee(int emplyoeeId, String emplyoeeName, String designation, double salary) {
		super();
		this.emplyoeeId = emplyoeeId;
		this.emplyoeeName = emplyoeeName;
		this.designation = designation;
		this.salary = salary;
	}
	public int getEmplyoeeId() {
		return emplyoeeId;
	}
	public void setEmplyoeeId(int emplyoeeId) {
		this.emplyoeeId = emplyoeeId;
	}
	public String getEmplyoeeName() {
		return emplyoeeName;
	}
	public void setEmplyoeeName(String emplyoeeName) {
		this.emplyoeeName = emplyoeeName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
	
	
	
	

