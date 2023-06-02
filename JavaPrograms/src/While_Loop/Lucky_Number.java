package While_Loop;

import java.util.Scanner;

public class Lucky_Number {
	// If sum of the squares of even position digits of a number is multiple of 9
		// then it is a lucky number.

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("n value");
			String n = sc.nextLine();
			int sum = 0;
			String str = String.valueOf(n);
			char[] ch = str.toCharArray();
			for (int i = 1; i < str.length(); i++) {
				sum = sum + (ch[i] * ch[i]);
			i++;
			}

			
			if (sum % 9 == 0) {
				System.out.println("It is a lucky number:"+n);
			} else {
				System.out.println("It is not a lucky number"+n);
			}

		}
	}

