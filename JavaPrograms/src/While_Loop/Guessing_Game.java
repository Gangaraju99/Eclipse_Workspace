package While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Guessing_Game {
	private static void guessthenumber() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		 int count = 1;
		 do {
			 System.out.println("Guess the number between 1-100");
			 int n = sc.nextInt();
			 int p = r.nextInt(100);//generating random number between 1-100
			 
			 if (n==p) {
				 System.out.println("you entered"+n);
				 System.out.println("system generated number"+p);
				 System.out.println("you won the match");
				 System.exit(1);
			 }else {
				 System.out.println("you entered "+n);
				 System.out.println("system generated "+p);
				 System.out.println("Both are not matched");
			 }
		
		 count++;
		 }
	
	while(count<=3);
		 System.out.println("system won the match");
	}
public static void main(String...args) {
	guessthenumber();
}
}
