package com.example;
import java.util.*;

import com.example.collecction.Student;

public class Application {

	public static void main(String[] args) {
		
		ArrayList <Student> studList=new ArrayList<Student>();
		Student ram=new Student(101,"Ram",50);
		Student suresh=new Student(102,"Suresh",70);
		Student anand=new Student(103,"Anand",60);
		Student nandha=new Student(104,"Nandha",80);
		Student kumar=new Student(105,"Kumar",40);
		String rakesh=new String("Rakesh");
		studList.add(ram);
		studList.add(suresh);
		studList.add(anand);
		studList.add(nandha);
		studList.add(kumar);
		
		//cannot add other than student object to the studList since student is enclosed
		// in a diamond braces
		
		//studList.add(rakesh);
		System.out.println(studList.get(1));
		
		for(Student eachStudent: studList) {
			System.out.println(eachStudent);
		}
		Object[] list=studList.toArray();
		//downcasting the object to student
		//toArray() method return type is object[]
		//but we require student array, so we are doing
		//downcasting
		
		for(Object obj:list) {
			Student stud=(Student)obj;
			System.out.println(stud.getStudentName());
		}
 		
		
	}

}
