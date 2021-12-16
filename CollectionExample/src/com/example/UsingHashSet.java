package com.example;

import com.example.collecction.Student;
import java.util.*;

public class UsingHashSet {
	public static void print(Collection<Student> objects) {
		for(Student eachStudent: objects) {
			System.out.println(eachStudent);
		}
	}
	public static void main(String[] args) {
		Student ram=new Student(101,"Ram",50);
		Student suresh=new Student(102,"Suresh",70);
		Student anand=new Student(103,"Anand",60);
		Student anandSenior=new Student(103,"Anand",60);
		
		HashSet<Student> hashset=new HashSet<Student>();
		hashset.add(ram);
		hashset.add(suresh);
		hashset.add(anand);
		boolean isAdded = hashset.add(anandSenior);
		
		print(hashset);
		System.out.println(isAdded);
	}

}
