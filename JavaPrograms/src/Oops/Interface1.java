package Oops;

interface Tax {
	public abstract double calculateTax(double price);
}

class PurchaseDetails implements Tax {

	int purchaseId;
	String paymentType;
	double taxpercentage;

	public PurchaseDetails(int purchaseId, String paymentType, double taxpercentage) {
		super();
		this.purchaseId = purchaseId;
		this.paymentType = paymentType;
		this.taxpercentage = taxpercentage;
	}

	public double calculateTax(double price) {

		if (paymentType.equals("Debitcard")) {
			taxpercentage = 2;

		} else if (paymentType.equals(" Creditcard")) {
			taxpercentage = 4;

		} else {
			taxpercentage = 8;
		}

		return taxpercentage;

	}

}

class Seller implements Tax {
	int sellerId;
	String location;
	double taxpercentage;

	public Seller(int sellerId, String location, double percentage) {
		super();
		this.sellerId = sellerId;
		this.location = location;
		this.taxpercentage = percentage;
	}

	public double calculateTax(double price) {

		if (location.equals("Europe")) {
			taxpercentage = 12;

		} else if (location.equals(" Canada")) {
			taxpercentage = 14;

		} else {
			taxpercentage = 20;
		}
		return taxpercentage;
	}

}

public class Interface1 {

	public static void main(String[] args) {

		PurchaseDetails purchaseDetails = new PurchaseDetails(1, "Debitcard", 0);
		double tax = purchaseDetails.calculateTax(899.0);
		System.out.println("The applied tax on card is :" + tax);

		Seller seller = new Seller(2, " Canda", 0.0);
		double locationtax = seller.calculateTax(699.0);
		System.out.println("The applied tax based on location is :" + locationtax);

	}

}



/*
 switch(paymentType){
  case " Debitcard": 
     this.taxpercentage =2;
     break;
  case " creditcard":
     this.taxpercentage =4;
     break;
  default : this.taxpercentage =6;
      break;
*/