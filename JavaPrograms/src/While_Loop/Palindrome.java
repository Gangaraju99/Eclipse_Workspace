package While_Loop;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		//If reverse of a number is same as the given number then it is called palindrome number
		Scanner sc = new Scanner (System.in);
		System.out.println("n value");
		int n= sc.nextInt();
	boolean flag = true;
		 int temp=n;
		int reverse = 0;
		int remainder =0;
		while(n>0) {
			remainder = n%10;
			reverse = reverse*10+remainder;
			n=n/10;
			
		}
if ( reverse==temp) {
	System.out.println("It is a palindrome");
}else {
	System.out.println("It is not a palindrome");}
}

}




