package com.example;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import com.example.collecction.Student;
import com.example.interfac.CrudRepository;
import com.example.interfac.StudentRepository;
import com.example.service.StudentService;
import com.example.util.MarkComparator;
import com.example.util.StudentNameComparator;

public class CrudApplication {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(CrudApplication.class.getClass().getName());

		Student ram=new Student(101,"Ram",50);
		Student suresh=new Student(102,"Suresh",30);
		Student anand=new Student(103,"Anand",60);
		Student nandha=new Student(104,"Nandha",80);
		Student kumar=new Student(105,"Kumar",40);
		
		//CrudRepository repo=new StudentService();
		StudentRepository repo=new StudentService();
		repo.add(ram);
		repo.add(suresh);
		repo.add(anand);
		repo.add(nandha);
		repo.add(kumar);
		
		List<Student> list=repo.findAll();
		//Collections.sort(list);
		Collections.sort(list, new MarkComparator());
		
		
		
 		Iterator <Student> itr=list.iterator();
			
		while(itr.hasNext()) {
			logger.info(itr.next().toString());
			}
		
		boolean result=repo.remove(nandha);
		if(result) {
			System.out.println(nandha + "deleted");
		}
		else {
			throw new RuntimeException("error");
		}
//		
//		for(Student eachList:repo.findAll()) {
//			System.out.println(eachList);
//		}
		
		Student updated=repo.updateMark(suresh, 44);
		System.out.println(updated);
		
	
		
		
		List<Student> top3=repo.getTopThreeByMark();
		for(Student top:top3) {
			System.out.println(top);
		}
		
	
	
		
	

	}

}
