package com.example;
import java.util.*;

import com.example.services.DoctorService;
public class Application {

	public static void main(String[] args) {
		
	
		
		Patient kanic=new Patient(99, "kanic", "chennai","ss@");	
		Patient ram=new Patient(95, "ram", "chennai","ss@");	
		
		HashSet<Patient> patientList=new HashSet<Patient>();
		
		patientList.add(kanic);
		patientList.add(ram);
	
		
		Staff rani=new Staff(55, "rani", "nurse");
		Staff kishore=new Staff(56, "kishore", "nurse");
		
		HashMap<String, Staff> staffList=new HashMap<String, Staff>();
		
		staffList.put("nurse", rani);
		staffList.put("sugartester", kishore);
		
		
		Doctor ramesh=new Doctor(444,"sandy","cardiologist","chennai",patientList,staffList);
		Doctor suresh=new Doctor(445,"suresh","ent","chennai",patientList,staffList);
		
		DoctorService service=new DoctorService();
		System.out.println(service.add(ramesh));
		System.out.println(service.add(suresh));
		
//		Collection<Doctor> docList=service.findAll();
		
		for(Doctor eachDoctor:service.findAll()) {
			System.out.println(eachDoctor.getName());
			System.out.println(eachDoctor.getPatientList());
			System.out.println(eachDoctor.getStaffDetails().get("nurse"));
			//System.out.println(eachDoctor.getStaffDetails());
			}
		
		System.out.println(service.remove(ramesh));
		
		for(Doctor eachDoctor:service.findAll()) {
			System.out.println(eachDoctor);
			
			//System.out.println(eachDoctor.getStaffDetails());
			}
		
		System.out.println(service.updateStaffId(suresh, 1212));
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
