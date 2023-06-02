package forloop.java;

import java.util.Scanner;

public class Pattern {
	
	private static void triangle( int n) {
		int x=1;
		for ( int i = 1; i<= n; i++) {
			for (int j =1  ; j<=i;j++) {
				
				System.out.print((x++)+" ");
				
			}
			
	System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("n");
		int n= sc.nextInt();
		triangle(n);

		}
	
	}

