package ForLoop_Practise;

import java.util.Scanner;

public class ThirdMethod {
	private static void Number( int num) {
		//Scanner sc = new Scanner(System.in);
	//	System.out.println("n value");
		//int n = sc.nextInt();
		String str = String.valueOf(num);
		for(int i = 0; i<str.length();i++) {
		char ch = str.charAt(i);
		switch (ch) {

		case '0':
			System.out.print("zero" + " ");
			break;

		case '1':
			System.out.print("one" + " ");
			break;
		case '2':
			System.out.print("two" + " ");
			break;
		case '3':
			System.out.print("three" + " ");
			break;
		case '4':
			System.out.print("four" + " ");
			break;
		case '5':
			System.out.print("five" + " ");
			break;
		case '6':
			System.out.print("six" + " ");
			break;

		case '7':
			System.out.print("seven" + " ");
			break;

		case '8':
			System.out.print("eight" + " ");
			break;
		case '9':
			System.out.print("nine" + " ");

			break;
	}
		}
}
      public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("num");
	int num = sc.nextInt();
	
	Number(num);
      }
}








