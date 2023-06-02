package forloop.java;

import java.util.Scanner;

public class Maths_Table {
	private static int isTable( int p) {
		for (int i = 1;i<=20;++i) {
			//int k = p*i;
			System.out.println(p+"*"+i+"="+(p*i)
					);
		}
		return p;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner (System.in);
		int p = sc.nextInt();
		int j = isTable(p);
		System.out.println(j);
		
	}





	}

