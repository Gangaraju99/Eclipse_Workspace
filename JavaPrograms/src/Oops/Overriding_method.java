package Oops;

class Validator {
	/**
	 * here the validation is user - should not the empty and should contain atleast
	 * 5 characters pwd - should not be empty and should contain atleast 8
	 * characters
	 *
	 * 
	 */

	String validate(String user, String pwd) {
		if (user != null && pwd != null) {
			if (user.length() >= 5 && pwd.length() >= 8) {
				return "success";
			}
		}
		return "failed";

	}


	String validate2(String user, String pwd) {
		if (user != null && pwd != null) {
			if (user.length() >= 7 && pwd.length() >= 10) {
				return " success";
			}
		}
		return "failed";
	}









}

class CustomValidator extends Validator {
	/**
	 * here , the validation is user - should not be null && and should contain
	 * atleast 8 characters pwd - should not be null and should contain atleast 12
	 * characters
	 * 
	 */
	String validate(String user, String pwd) {
		if (user != null && pwd != null) {
			if (user.length() >= 8 && pwd.length() >= 12) {
				return " success";
			}
		}
		return "failed";

	}

}

public class Overriding_method {

	public static void main(String[] args) {

		// parent class object

		Validator validator = new Validator();
		String result = validator.validate("smith", "kjf25798");
		System.out.println(result);

		// child class object

		CustomValidator customvalidator = new CustomValidator();
		String output = customvalidator.validate("ajay", "jaoosr52");
		System.out.println(output);

		/**
		 * here , we r creating derived class object and we r storing it in base class
		 * reference variable so, it invokes derived class validate() method
		 * 
		 */
		Validator v = new CustomValidator();
		String s = v.validate("ratantata", " ratan@656");
		System.out.println(s);
		
		
		Validator v2 = new CustomValidator();
		String s2 = v2.validate2("kjjiemg","jajoiojojfojfo");
		System.out.println(s2);

	}

}
