package com.example.demo.model;

public class Manager extends Employee {
	private String[] skillSet;

	public Manager(int emplyoeeId, String emplyoeeName, String designation, double salary, String[] skillSet) {
		super(emplyoeeId, emplyoeeName, designation, salary);
		this.skillSet = skillSet;
	}

	public Manager() {
		super();
	
	}

	public String[] getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String[] skillSet) {
		this.skillSet = skillSet;
	}
	
	public String hello() {
		return "hi";
	}
}
