package While_Loop;

import java.util.Scanner;

public class SumOfTheDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("n value");
		int n = sc.nextInt();
		
		int sum = 0;
		int remainder =0;
		while(n>0||(n!=0)) {
			remainder = n%10;
			sum = sum+remainder;
			n=n/10;
		}
System.out.println(sum);
	}

}






