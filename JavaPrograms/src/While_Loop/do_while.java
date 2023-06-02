package While_Loop;

import java.util.Scanner;

public class do_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int sum =0;
		int count =1;
		do{
			System.out.println("Enter a number");
			int n = Integer.parseInt(sc.nextLine());
			sum = sum+n;
			count++;
		}
		
	while(count<=5);
		System.out.println("sum ="+sum);
		
	
		}
	}




