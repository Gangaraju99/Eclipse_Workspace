package Pattern;

import java.util.Scanner;

public class Triangle_Pattern {
	
		 private static void isPattern(int b ) {
			 for(int i = 1; i<=b;i++) {
				 for(int j =1 ; j<=i;j++) {
					 System.out.print
					 ("*"+ " ");
				 	  }
			System.out.println();
			 }
			 
		 }
			
			
	 public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter n value");
		 int b = sc.nextInt();
		 isPattern (b);
				
				
			}
				
			 
			 
		 }







