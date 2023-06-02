package While_Loop;

import java.util.Scanner;

public class Seed_Number {
	private static boolean isSeed(int x, int y) {
		int sum =0;
		int remainder =0;
		
		int temp = x;
		while(x>0) {
			remainder = x%10;
			sum = sum+ temp*remainder;
			x= x/10;
		}
		if(sum ==y) {
			return true;
			
		}else {
             return false;
	}

}
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("x");
	int x = sc.nextInt();
	System.out.println("y");
	int y = sc.nextInt();
	boolean flag = isSeed(x,y);
	if(flag == true) {
		System.out.println("is seed");
	}
	else {
		System.out.println(" no seed");
	}
}
}




