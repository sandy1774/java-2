package com.example.interfac;

import java.util.List;

import com.example.collecction.Student;

public interface StudentRepository <T> extends CrudRepository <T> {
	
	
	List<Student> getTopThreeByMark();

}
