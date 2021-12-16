package com.exception.service;

	public class Employee {
		
		private int emplyoeeId;
		private String emplyoeeName;
		private String designation;
		private double salary;
		public Employee() {
			super();
			
		}
		public Employee(int emplyoeeId, String emplyoeeName, String designation, double salary) throws RangeCheckException{
			super();
			this.emplyoeeId = emplyoeeId;
			this.emplyoeeName = emplyoeeName;
			this.designation = designation;
			
			if(this.salary<=0) {
				throw new RangeCheckException("salary should be above zero");
			}else {
				this.salary = salary;
			}
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
			if(salary<=0) {
				try {
					throw new RangeCheckException("salary should be above zero");
				} catch (RangeCheckException e) {
					
					e.printStackTrace();
				}
				
			}else {
				
			this.salary = salary;
		}
		}
		@Override
		public String toString() {
			
			return this.emplyoeeId+ "," + this.emplyoeeName+ ","+ this.designation;
		}
		

	}


