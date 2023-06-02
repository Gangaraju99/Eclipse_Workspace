package Arrays;

import java.util.Scanner;

public class Pairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		int[] pairs = {};
		int[] arr = { 10, 5, 7, 9, 3, 4, 2, 8, 6 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = (i + 1); j < arr.length; j++) {
				if (arr[i] + arr[j] == a) {
				//
					int[] pair = { arr[i], arr[j] };

					System.out.println("("+arr[i]+"&"+
					arr[j]+")");
				}
			}
			
		}
		
	
        
	}
}





