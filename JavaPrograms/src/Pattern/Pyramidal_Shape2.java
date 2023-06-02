package Pattern;

import java.util.Scanner;

public class Pyramidal_Shape2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("n value");
		int n = sc.nextInt();
		for ( int i = 1; i<=n;i++) {//rows
			for(int j = 1; j<=n-i;j++) {//spaces
				System.out.print(" ");
				
				
			}
		for(int k =1;k<=i;k++) {//stars
			System.out.print("*"+" ");
		}
		System.out.println();
		}
		
	
      /*  for(int i = 1; i <= n ; i++) {
        	for (int j = 1; j< n ;j++) {
        		System.out.println("*");
        	}
        	
        	}*/
        }
}


