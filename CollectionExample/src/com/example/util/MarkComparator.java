package com.example.util;

import java.util.Comparator;

import com.example.collecction.Student;

public class MarkComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getMarkScored()<o2.getMarkScored()) {
			return 1;
		}
		if(o1.getMarkScored()>o2.getMarkScored()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	

}
