package com.example.demo;

public class InvalidEmailException extends Exception {
	
	private String message;

	public InvalidEmailException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		
		return this.message;
	}

}
