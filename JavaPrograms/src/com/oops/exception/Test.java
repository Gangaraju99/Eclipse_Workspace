package com.oops.exception;

public class Test {
	
	public static void main(String[] args) {
		
		
		Applicant applicant = new Applicant("raju","Officier",23);
		
		Validator validator = new Validator();
		
	boolean flag = 	validator.validate(applicant);
		
		
		System.out.println(flag);
		
	}

}
