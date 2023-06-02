package Arrays;

import java.util.Scanner;

public class Perfect_Number {

	private static void perfect(int x, int y) {

		for (int i = x; i <= y; i++) {
			int sum = 0;

			for (int j = 1; j <= i / 2; j++) {
				if (i % j == 0) {
					sum += j;
				}

			}
			if (sum == i) {
				System.out.println(i);
			}

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int x = sc.nextInt();
		System.out.println("Enter 2nd number");
		int y = sc.nextInt();
		perfect(x, y);

	}
}



