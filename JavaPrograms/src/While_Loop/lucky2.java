package While_Loop;

import java.util.Scanner;

public class lucky2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n value");
		int n = sc.nextInt();
		int sum = 0;
		String str = String.valueOf(n);
		char[] ch = str.toCharArray();
		int i ;
		 
		for ( i = 1; i < str.length(); i++) {
			sum = sum + (ch[i] * ch[i]);
				i++;
		
		}
		
		
		if (sum % 9 == 0) {
			System.out.println(n+" is a lucky number");
		} else {
			System.out.println("It is not a lucky number");
		}
	}

}   






