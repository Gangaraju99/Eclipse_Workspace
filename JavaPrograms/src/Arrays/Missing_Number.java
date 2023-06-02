package Arrays;

import java.util.Scanner;

public class Missing_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("n value");
		int n = sc.nextInt();
		int arr [] = {1,2,3,5,6,10,15};
		int sum = (n*(n+1))/2;
		for (int i =0; i<arr.length;i++) {
			
			sum = sum-arr[i];
		}
System.out.println("missing number:"+sum);
		
	
}
}