package com.example;

import com.example.collecction.Student;
import java.util.*;

public class UsingLinkedList {

	public static void main(String[] args) {

		Student ram=new Student(101,"Ram",50);
		Student suresh=new Student(102,"Suresh",70);
		Student anand=new Student(103,"Anand",60);
		//Student anandSenior=new Student(103,"Anandsenior",60);
		
		LinkedList<Student> studList=new LinkedList<Student>();
		
		studList.add(ram);
		studList.add(suresh);
		studList.add(anand);
		
		//Iterator <Student> itr1=studList.iterator();
		ListIterator<Student> itr=studList.listIterator();
		System.out.println("Forward Iteration");
		while(itr.hasNext()) {
			System.out.println(itr.next().getStudentName());
		}
		System.out.println("----------------------------");
		System.out.println("backward Iteration");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous().getStudentName());
		}

	}

}
