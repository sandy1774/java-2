package com.example.util;

import java.util.Comparator;

import com.example.collecction.Student;

public class StudentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student obj1, Student obj2) {
		return obj1.getStudentName().compareTo(obj2.getStudentName());
	}

}
