package IfCondition;

import java.util.Scanner;

public class Control_IF {
	public static void main (String [] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter customer type");
			String customerType = sc.nextLine();
			System.out.println("Enter Quantity");
			int a = Integer.parseInt(sc.nextLine());
			System.out.println("Enter Price");
			double price = Double.parseDouble(sc.nextLine());
			double totalPrice = a*price;
			double discount = 0.0;
		
			if ( customerType.equals("premium") ) {
				discount = price * 10/100;
				totalPrice = totalPrice - discount;
				
				
			}
		System.out.println("Customer Type :"+ customerType);
		System.out.println("Discount:"+ discount);
		System.out.println("Total Price :"+ totalPrice);
		
		
		System.out.println("Enter Brand Name");
		String brandName = sc.nextLine();
		System.out.println("Enter Shoetype");
		String shoetype = sc.nextLine();
		System.out.println("Enter Price");
		double prices = Double.parseDouble(sc.nextLine());
		if ( shoetype.equals("leather"));
		 double gst = prices *18/100;
		 prices = prices+gst;
		 System.out.println("Brand :" + ""+ brandName);
		 System.out.println("Shoetype:"+""+shoetype);
		 System.out.println("prices ="+prices);
		 System.out.println("GST ="+gst);
		 
		 
		 
		 
		 
		 
		
		
		
				
		
		
		
			
			
			
		
		
	
		
	}

	}}




