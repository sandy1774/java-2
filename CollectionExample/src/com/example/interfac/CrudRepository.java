package com.example.interfac;



import java.util.List;

import com.example.collecction.Student;

public interface CrudRepository <T>{
	
	public boolean add(T object);
	public List <T>findAll();
	public Student updateMark(T object, double revisedMark);
	public boolean remove(T object);
	
}
