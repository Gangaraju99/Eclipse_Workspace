package While_Loop;

import java.util.Scanner;

public class English_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("number");
		int number = sc.nextInt();
		String w = convertNumberToWords(number);
		System.out.println(w);
	}
	private static String convertNumberToWords(int number) {
		String words = "";
		String unitsArray[] = { "Zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "ninteen" };
		String tensArray[] = { "zero", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };
		if (number == 0) {
			System.out.println("zero");
		}
		if ((number / 1000000) > 0) {
			words += convertNumberToWords(number / 1000000) + "million";
			number = number % 1000000;
		}
		
		if ((number / 1000 > 0)) {
			words += convertNumberToWords(number / 1000) + " " + "thousand" + " ";
			number = number % 1000;
		}

		if ((number / 100 > 0)) {
			words += convertNumberToWords(number / 100) + " " + "hundred" + " ";
			number = number % 100;
		}
		if (number > 0) {
			if (number < 20) {
				words += unitsArray[number] + " ";

			} else {
				
				words += tensArray[number / 10];
				if ((number % 10) > 0) {
					words += " " + unitsArray[number % 10];
				}
			}
		}
		 return words;
		//System.out.println(words);
		
	
}


}
