package ForLoop_Practise;

import java.util.Scanner;

public class Number_In_Words {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		
		int reverse = 0;
		while (number != 0) {
			reverse = (reverse * 10) + (number % 10);
			number = number / 10;
		}
		int remainder;

		while (reverse != 0) {
			remainder = reverse % 10;
			reverse = reverse / 10;

			switch (remainder) {

			case 0:
				System.out.print("zero" + " ");
				break;

			case 1:
				System.out.print("one" + " ");
				break;
			case 2:
				System.out.print("two" + " ");
				break;
			case 3:
				System.out.print("three" + " ");
				break;
			case 4:
				System.out.print("four" + " ");
				break;
			case 5:
				System.out.print("five" + " ");
				break;
			case 6:
				System.out.print("six" + " ");
				break;

			case 7:
				System.out.print("seven" + " ");
				break;

			case 8:
				System.out.print("eight" + " ");
				break;
			case 9:
				System.out.print("nine" + " ");

				break;
			}
		}
	}

	
			

		
	


}
	


