package SwitchCase;

import java.util.Scanner;

public class AirLines {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Air line name");
		String airline = sc.nextLine();
		System.out.println("Enter luggage weight");
		int weight = sc.nextInt();
		int allowed_weight = 0;
		switch(airline) {
		case " AirIndia":
				allowed_weight = 40;
				break;
		case "Jetairways":
				allowed_weight = 60;
				break;
					}
		
		if (airline.equals("AirIndia")) {
			if (allowed_weight<weight){
				System.out.println("NOt allowed");
			}
			
			else {
				System.out.println(airline);
				System.out.println(weight);
				
				System.out.println("allowed");
				
			}
			
		}
		
		if (airline.equals("Jetairways")) {
			if (allowed_weight<weight) {
				System.out.println("not allowed this weight" );
			}
			else{
				System.out.println("airline");
				System.out.println(weight);
				System.out.println("allowed");
			}
		}
		
		
		
		
}
}
		

