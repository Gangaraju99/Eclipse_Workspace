package ArraysList;

import java.util.Scanner;

public class DOB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dd-mm-yyyy");
		String dob = sc.nextLine();
		
		int day = Integer.parseInt(dob.substring(0, 2));
		System.out.println(day);
	  /*  String[] split = dob.split("-");
	    int month = Integer.parseInt(split[125]);
	    System.out.println(month);
		*/
		
		
		
		
	}

}
