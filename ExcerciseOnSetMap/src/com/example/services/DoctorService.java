package com.example.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import com.example.Doctor;
import com.example.repository.CrudOperations;

public class DoctorService implements CrudOperations<Doctor> {

	
	ArrayList<Doctor> hashSet;
	
	public DoctorService() {
		super();
		hashSet =new ArrayList<Doctor>();
	}

	@Override
	
	public boolean add(Doctor object) {
		return hashSet.add(object);
		
		
	}

	@Override
	public Collection<Doctor> findAll() {
		return this.hashSet;
		
		
	}

	@Override
	public Doctor updateStaffId(Doctor object, int docId) {
		int indexPos=hashSet.indexOf(object);
		Doctor foundPosition= hashSet.get(indexPos);
		foundPosition.setId(docId);
		return hashSet.set(indexPos,foundPosition);
		
		
		
	}

	@Override
	public boolean remove(Doctor object) {
		
		return hashSet.remove(object);
	}

}
