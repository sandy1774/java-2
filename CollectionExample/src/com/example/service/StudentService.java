package com.example.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.collecction.Student;
import com.example.interfac.CrudRepository;
import com.example.interfac.StudentRepository;
import com.example.util.MarkComparator;

public class StudentService implements StudentRepository<Student> {
	
	private ArrayList<Student> studList;
	

	public StudentService() {
		super();
		studList=new ArrayList();
	}

	@Override
	public boolean add(Student object) {
		
		return studList.add(object);
		
	}

	@Override
	public List<Student> findAll() {
	
		return this.studList;
	}

	@Override
	public Student updateMark(Student object, double revisedMark) {
	     
		int indexPos=studList.indexOf(object);
		Student foundPosition= studList.get(indexPos);
		foundPosition.setMarkScored(revisedMark);
		return studList.set(indexPos,foundPosition);
		
	}

	@Override
	public boolean remove(Student object) {
		
		
		return studList.remove(object);
		
	}

	@Override
	public List<Student> getTopThreeByMark() {
		
		Collections.sort(studList, new MarkComparator());
		ArrayList <Student> list= new ArrayList();
		for(int i=0;i<=2;i++) {
			list.add(studList.get(i));
		}
		return list;
		
		
		
		
		 
	}
	
	

	

}
