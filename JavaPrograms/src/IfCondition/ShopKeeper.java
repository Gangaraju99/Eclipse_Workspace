package IfCondition;

import java.util.Scanner;

public class ShopKeeper {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		int x = 10;
		int y = 15;
		int z = 43;
		System.out.println("Enter no of five rupee notes");
		int g = sc.nextInt();
		System.out.println("Enter no of one rupee notes ");
		int h = sc.nextInt();
		int r = x-g;
		int m = y-h;
				
		
		
		
				if (8>=g&&3>=h) {
					if (z==(g*5+h*1)) {
					System.out.println("Exact change is avaliable =" +z);
					}
				
					else
					System.out.println("Exact change is not avaliabe");
		
					}
				else {
					System.out.println("-1");
				}
			
	     System.out.println("Remaninig five rupee notes = "+ r);
	     System.out.println("Remaining one rupee notes ="+m);
	 
	 
	 }
	 
			
			}
			
		
	 
		
		
		
		
		

