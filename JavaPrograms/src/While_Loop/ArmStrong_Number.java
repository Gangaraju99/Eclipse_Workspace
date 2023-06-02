package While_Loop;

import java.util.Scanner;

public class ArmStrong_Number {
	public static void main(String[] args) {
		//If sum of the nth power of each digit of a number is equal to the same number then it is called an armstrong number.
		Scanner sc = new Scanner (System.in);
		System.out.println("x value");
		int x = sc.nextInt();
		System.out.println("y value");
		int y = sc.nextInt();
		for(int i = x;i<=y;i++) {
		int temp=i;
		int sum = 0;
		int remainder =0;
		
		String str = String.valueOf(i);
		int len = str.length();
		while(temp!=0) {
			remainder = temp%10;
			sum = (int) (sum+Math.pow(remainder, len));
			temp=temp/10;
		}
	if(sum==i) {
		
		System.out.println(sum+"The given number is armstrong number");
	}
	else {
		System.out.println("The given number is not a armstrong number");
	}
	}
	}
}






