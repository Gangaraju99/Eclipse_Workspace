package forloop.java;

import java.util.Scanner;

public class Find_Fibonacci {
private static int fibonacci(int n) {
		
		int a =0;
		int b = 1;
		int c=0;
		for( int i = 3; i<=n;i++) {
			c= a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	
    return c; 
}
public static void main(String[] args) 
{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter n value");
	int n = sc.nextInt();
	int h = fibonacci(n);
	System.out.println();
	
}	
	
}

