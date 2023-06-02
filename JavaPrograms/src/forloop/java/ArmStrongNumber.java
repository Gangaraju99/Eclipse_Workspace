package forloop.java;

import java.util.Scanner;

class demo{
	privae
}

public class ArmStrongNumber {
private static void isarmstrong(int n ) {
	int temp = n;
	double sum =0;
	int remainder = 0;
	String str = String.valueOf(n);
	int len = str.length();
	while(n!=0) {
		remainder = n%10;
		sum = sum + Math.pow(remainder,len);
		n = n/10;
	}
	if(sum == temp) {
		System.out.println("The given number is an armstrong number");
	}else {
		System.out.println("It is not an armstrong number");
	}
}

public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter n value");
	int n = sc.nextInt();
	
 isarmstrong(n);
	
}







}
