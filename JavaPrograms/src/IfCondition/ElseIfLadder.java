package IfCondition;

import java.util.Scanner;

public class ElseIfLadder {
	public static void main(String[] args) {
		//Biggest Number
			
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		System.out.println("Enter c value");
		int c = sc.nextInt();
		if (a>c&&a>b) 
			System.out.println("a is biggest number");
		else if (b>c&&b>a)
			System.out.println("b is biggest number");
		else if (c>a&&c>b)
			System.out.println(" c is biggest number");
		else {
		System.out.println("all are equal");
		}
		
		
		
		
		
		//Current Bill
		
		System.out.println("Enter Number of Units");
		int units = sc.nextInt();
		 
		if (units<=300) {
		  double currentBill = (units*2.75);
		}
		else if (units <=500) {
		double currentBill = 300*2.75 +(units-300)*4.87;
		}
				 
		else if (units >500) {
		double currentBill = 300*2.75+200*4.87+(units-500)*6.90;
		System.out.println("Total Bill = " + currentBill);
		 }
		
		
		// Division By 3&5
		
		System.out.println("Enter a number");
		int k = sc.nextInt();
		if (k%3==0&&k%5==0){
		 System.out.println("zip");
		}
		else if ( k%3==0) {
		 
		System.out.println("zap");
		 }
		else if(k%5==0){
		System.out.println("zup");
		}
		else {
		System.out.println("The given numbere is not divisible by 3 &5");
		}
			
		// Seven Number
		
		System.out.println("Enter first number");
		int f = sc.nextInt();
		System.out.println("Enter middle number");
		int m = sc.nextInt();
		System.out.println("Enter last number");
		int l = sc.nextInt();
		
		if (l==7) {
			System.out.println(m*m);
		}
		else if (m==7) {
			System.out.println("hi");
		}
		else if (f==7) {
			System.out.println("bye");
		}
		else {
			System.out.println("There is no seven number");
		}
		
		
				
		 
		
	}
}
