package IfCondition;

import java.util.Scanner;

public class Biggest_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a  value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		System.out.println();
		int c = sc.nextInt();
		
		if(a>b) {
			if (a>c) {
				System.out.println("a is biggest number");
			}
				else 
					System.out.println("c is biggest number");
			}
		
			else if (b>c) {
				System.out.println("b is biggest number");
				
			}	
				else {
				
			System.out.println(" c is biggest number");
				}
			
	

	}
}
