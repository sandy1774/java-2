package com.constructors;

public class BookApplication {

	public static void main(String[] args) {
		
		
		Book headFirst= new Book();
		
		headFirst.setBookId(100);
		headFirst.setAuthorName("jjjj");
		headFirst.setPrice(500);
		
		
		
		System.out.println(headFirst.getBookId());
		System.out.println(headFirst.getAuthorName());
		System.out.println(headFirst.getPrice());
		
		Book effJava= new Book("jjj",100,500);
		System.out.println(effJava.getAuthorName());
		System.out.println(effJava.getBookId());
		System.out.println(effJava.getPrice());
	}

}
