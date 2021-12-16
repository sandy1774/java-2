package com.example;

import java.util.Map;
import java.util.Set;

public class Doctor {
	private int id;
	private String name;
	private String specialization;
	private String location;
	
	private Set<Patient> patientList;
	private Map<String, Staff> staffDetails;
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Set<Patient> getPatientList() {
		return patientList;
	}

	public void setPatientList(Set<Patient> patientList) {
		this.patientList = patientList;
	}

	public Map<String, Staff> getStaffDetails() {
		return staffDetails;
	}

	public void setStaffDetails(Map<String, Staff> staffDetails) {
		this.staffDetails = staffDetails;
	}

	public Doctor(int id, String name, String specialization, String location, Set<Patient> patientList,
			Map<String, Staff> staffDetails) {
		super();
		this.id = id;
		this.name = name;
		this.specialization = specialization;
		this.location = location;
		this.patientList = patientList;
		this.staffDetails = staffDetails;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", specialization=" + specialization + ", location=" + location
				+ ", patientList=" + patientList + ", staffDetails=" + staffDetails + "]";
	}

	
}
