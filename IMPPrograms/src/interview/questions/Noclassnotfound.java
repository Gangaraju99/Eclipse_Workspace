package interview.questions;

public class Noclassnotfound {
	
	public static void main(String[] args) {
		
		try {
	Class.forName("interview.questions.Password1");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}
