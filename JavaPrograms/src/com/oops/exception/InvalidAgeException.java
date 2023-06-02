package com.oops.exception;

public class InvalidAgeException extends RuntimeException  {

	
	public InvalidAgeException() {
		
	}
	
	public InvalidAgeException(String message) {
		super(message);
	}
	
	
}
