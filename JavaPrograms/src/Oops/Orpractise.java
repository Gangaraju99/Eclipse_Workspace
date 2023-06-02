package Oops;

class Validator{
	
	public String validate(String user, String pwd) {
		
		if( user!= null && pwd != null) {
			if(user.length()>=5 && pwd.length()>=8) {
				return " success";
			}
		}
	return " failed";
			
	}

}

class Customvalidator extends  Validator{
	 public String validate (String user, String pwd) {
		 if(user!=null && pwd != null) {
			 if(user.length()>=8 && pwd.length()>=12) {
				 return "success";
			 }
		 }
	return "failed";
	 }
}

public class Orpractise {
	public static void main(String[] args) {
		
		Validator validator = new Validator();
		String result =validator.validate("slkf","jaljofoi");
		System.out.println(result);

		
		
    Customvalidator cv = new Customvalidator();
   String cvr =  cv.validate("klmslmflml","465648agfsgsf");
    System.out.println(cvr);
	
	String test =cv.validate("jlsfjj","jfdlfjsi");
	
	System.out.println(test);
	}

}
