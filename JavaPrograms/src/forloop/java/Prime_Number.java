package forloop.java;

import java.util.Scanner;

public class Prime_Number {
	private static int isPrime(int p) {
		int count = 1;
		for (int i = 2; i <= p / 2; i++) {
			if (p % i == 0) {
				count += i;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int k = isPrime(n);
		if (k <= 1) {
			System.out.println(n + " " + "is a prime number");
		} else {
			System.out.println(n + " " + "is not a prime number");
		}
	}

}



