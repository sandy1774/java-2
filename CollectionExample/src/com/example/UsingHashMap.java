package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

import com.example.collecction.Student;

public class UsingHashMap {

	public static void main(String[] args) {
		
		Student ram=new Student(101,"Ram",50);
		Student suresh=new Student(102,"Suresh",70);
		Student anand=new Student(103,"Anand",60);
		Student anandSenior=new Student(103,"Anandsenior",60);
		
		
	HashMap<Integer, Student> map=new HashMap<Integer,Student>();
	
	//AutoBoxing features of java allow primitive 989 to be converted
	System.out.println(map.put(989, anand));
	System.out.println(map.put(98, suresh));
	System.out.println(map.put(919, ram));
	System.out.println(map.put(919, anandSenior));
	
	//it will return the new entry and not the old one
	//it replaces the old entry with new one
	
	System.out.println(map.get(919));
	Set<Map.Entry<Integer,Student>> setView= map.entrySet();
	
	Iterator<Map.Entry<Integer, Student>> itr = setView.iterator();
	while(itr.hasNext()) {
		Map.Entry<Integer, Student> eachElement=itr.next();
		System.out.println(eachElement.getValue());
		System.out.println(eachElement.getKey());
		
	}
	Set<Map.Entry<Integer,Student>> studSet= map.entrySet();
	for(Map.Entry<Integer, Student> eachElement:studSet) {
		System.out.println(eachElement.getKey());
		System.out.println(eachElement.getValue());
	}
	
	
	
	}
	

}
