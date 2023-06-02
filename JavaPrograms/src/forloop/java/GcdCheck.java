package forloop.java;

import java.util.Scanner;

public class GcdCheck {
	private static void findgcd(int n1, int n2) {
		int gcd = 1;

		for (int i = 2; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}

		}
		System.out.println(gcd);

	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1 number");
		int x = sc.nextInt();
		System.out.println("Enter n2 number");
		int y = sc.nextInt();
		 findgcd(x, y);

		System.out.println();
	}


}
