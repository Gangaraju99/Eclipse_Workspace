
package Pattern;

import java.util.Scanner;

public class DownWard_Triangle {

	private static void  stars  (int n) {
		for(int i = n; i>=1;i--) {
			for(int j = 1; j<=i;j++) {
				System.out.print("*"+" ");
			}
		System.out.println();
		}
	
		
		
	}

public static void main (String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("n value"
			+ ""
			+ " ");
	int n = sc.nextInt();
   stars(n);
   

	
}


}
