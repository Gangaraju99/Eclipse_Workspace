package SekharSir_Questions;

import java.util.Scanner;

public class Adam_Number {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int userNumber = Integer.parseInt(sc.next());
		int store = userNumber;
		int userNumberSquare = (userNumber * userNumber);

		int reverseNumber = 0;
		while (userNumber > 0) {

			int remainder = userNumber % 10;
			userNumber = userNumber / 10;
			reverseNumber = reverseNumber * 10 + remainder;
		}
		int squareOfReverseNumber = (reverseNumber * reverseNumber);

		int reverseuserNumberSquare = 0;
		while (userNumberSquare > 0) {
			int remainder = userNumberSquare % 10;
			userNumberSquare = userNumberSquare / 10;
			reverseuserNumberSquare = reverseuserNumberSquare * 10 + remainder;
		}

		if (reverseuserNumberSquare == squareOfReverseNumber) {
			System.out.println("The given number" + " " + store + " " + "is Adam Number");
		} else {
			System.out.println(" The given number" + " " + store + " " + "is not a Adam NUmber");
		}

	}

}
