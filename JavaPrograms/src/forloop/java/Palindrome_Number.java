package forloop.java;

import java.util.Scanner;

public class Palindrome_Number {
	
	
	// If reverse of a number is same as the given number then it is called
	private static boolean isPalindrome (int n) {
		int temp = n; 
		int reverse = 0;
		int remainder = 0;
		while(n>0) {
			remainder = n%10;
			reverse = reverse *10 + remainder;
			n= n/10;
			
		}
	if(reverse == temp) {
		return true;
	}else {
		return false;
	}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		boolean flag = isPalindrome (n);
		if(flag == true) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
	}

}
