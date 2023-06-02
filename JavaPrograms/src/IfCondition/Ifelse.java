package IfCondition;

import java.util.Scanner;

public class Ifelse {
	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		if (a%2==0) {
		System.out.println("It is a even number");
		}
		
		 
		 else {
			System.out.println(" It is a odd number");
		}

		//

		System.out.println("Enter Username ");
		String username = sc.nextLine();
		
		System.out.println("Enter password");
		String password = sc.nextLine();
		
		if (username.equals("Gatta Gangraju")&& password.equals("Gangaraju123")) {
			
		
		System.out.println("Login Successfully");
		}
		 
		 else {
			 System.out.println(" Login failed");
		
		
		}
				
				
		
		
		
		
		
		
		
		
	}
	
}
