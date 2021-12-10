package com.excercise2;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		
		System.out.println("enter book name");
		String bookname=sc.next();
		
		System.out.println("enter author");
		String author =sc.next();
		
		System.out.println("enter price");
		double price =sc.nextDouble();
		
		System.out.println("enter customertype");
		String customerType=sc.next();
	
		
		Book book=new Book(id,bookname,author,price,customerType);
	    BookService bookSer=new BookService();
	
	System.out.println(bookSer.calculateDiscount(book));
	System.out.println(bookSer.calculateDiscount(book,customerType));
	
	
		
		
		
		
	}

}
