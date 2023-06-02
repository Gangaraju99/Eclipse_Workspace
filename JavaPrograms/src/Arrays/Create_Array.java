package Arrays;

import java.util.Scanner;

public class Create_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int x = Integer.parseInt(sc.nextLine());
		String [] names = new String[x];
		/*System.out.println("1 name");
		 names[0]= sc.nextLine();
		System.out.println("2nd name");
		names[1] =sc.nextLine();
		System.out.println("3rd name");
		names[2] = sc.nextLine();
		System.out.println("4th name");
		names[3] = sc.nextLine();*/
		for ( int k = 0; k<x; k++) {
			System.out.println("name");
			names [k]= sc.nextLine();
		}
		
	for (int i = 0; i < names.length;i++) {
		System.out.println(names[i]);
		
	}
		
		
		
	
	
	}
}


