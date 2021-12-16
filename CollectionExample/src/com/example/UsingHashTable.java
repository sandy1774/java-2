package com.example;

import java.util.Hashtable;

import com.example.collecction.Student;

public class UsingHashTable {

	public static void main(String[] args) {
		
		
		Student ram=new Student(101,"Ram",50);
		Student suresh=new Student(102,"Suresh",70);
		Student anand=new Student(103,"Anand",60);
		
		Hashtable<Integer, Student> map=new Hashtable<Integer, Student>();
		map.put(1, null);
		if(map.get(1)==null) {
			map.put(1, anand);
		}
		System.out.println();
	
	
	
	}
	
	
	

}
