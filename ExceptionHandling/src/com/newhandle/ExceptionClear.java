package com.newhandle;

public class ExceptionClear {

	public static void main(String[] args) {
		
		try {
			System.out.println(args[0]);
		} catch (Exception e) {
			System.out.println("add comm line arg");
			e.printStackTrace();
		}

	}

}
