package forloop.java;

import java.util.Scanner;

public class Factor {
	private static int n;

	private static int factorial(int n) {

		int factor = 1;
		for (int i = 1; i <= 5; ++i) {
			factor *= i;
		}
		
		return factor;

	}

	public static void main(String[] args) {
		System.out.println("Enter factorial");
		Scanner sc = new Scanner(System.in);
		int k = factorial(n);
		int n = sc.nextInt();
		System.out.println("factorial value=" + k);

	}

}


