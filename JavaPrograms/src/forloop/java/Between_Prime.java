package forloop.java;

import java.util.Scanner;

public class Between_Prime {
	private static void primes(int x, int y) {
		for (int i = x; i <= y; i++) {
			boolean flag = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println(i);
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("enter second number");
		int y = Integer.parseInt(sc.nextLine());
		primes(x, y);
	}

}



