package com.example;
import java.util.*;

import com.example.collecction.Student;
public class UsingTreeSet {
	public static void print(Collection<Student> objects) {
		for(Student eachStudent: objects) {
			System.out.println(eachStudent);
		}
	}
	public static void main(String[] args) {
		Student ram=new Student(101,"Ram",50);
		Student suresh=new Student(102,"Suresh",70);
		Student anand=new Student(103,"Anand",60);
		
		TreeSet<Student> treeset=new TreeSet<Student>();
		treeset.add(ram);
		treeset.add(suresh);
		treeset.add(anand);
		print(treeset);
	}

}
