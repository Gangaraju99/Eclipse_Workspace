package com.oops.exception;

import javax.naming.InvalidNameException;

public class Validator {

	public boolean validate (Applicant applicant)   {

		try {

			validateName(applicant.getName());
			validateJobProfile(applicant.getJobProfile());
			validateAge(applicant.getAge());

		} 
		catch (Exception ex) {
			System.out.println(ex.getMessage());
			return false;
		}
	
	return true;
	}

	private boolean validateName(String name) throws InvalidNameException {
			if(name==null || name.trim().length() == 0){
				throw new InvalidNameException("Name of the applicant is invalid");
			}
			return true;
		}

	private boolean validateJobProfile (String jobProfile) {
				if(jobProfile == null || jobProfile.trim().length() ==0) {
					throw new InvalidJobProfileException("JobProfile is not applicable");
				}
			if(!jobProfile.equalsIgnoreCase ("Officier") || !jobProfile.equalsIgnoreCase("clerk") ||
					!jobProfile.equalsIgnoreCase("Associate")){
				throw new InvalidJobProfileException("jobprofile is not matching");
			}
			return true;
			}


	private boolean validateAge(int age) {
		if (age < 21 || age > 35) {
			throw new InvalidAgeException("Age of the applicant is not allowed");
		}
		return true;
	}

}
