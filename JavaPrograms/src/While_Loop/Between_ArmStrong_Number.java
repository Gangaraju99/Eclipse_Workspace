package While_Loop;

import java.util.Scanner;

public class Between_ArmStrong_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("x value");
		int x = sc.nextInt();
		System.out.println("y value");
		int y = sc.nextInt();
		for(int i =x;i<=y;i++) {
			
			int sum =0;
			String str = String.valueOf(i);
			int n = str.length();
			int temp =i;
			while(temp!=0) {
				int remainder = temp%10;
				sum = (int) (sum + Math.pow(remainder,n));
				temp = temp/10;
				
			}
		if(sum == i) {
			System.out.println(i);
		}
		}
		
		
		
		
		
		
		
		
		
		}
		
}
