package Oops;

class custom {
	String customerEmail;
	String customerName;
	long contact;
	double totalPrice;

	public custom (String customerEmail, String customerName, long contact, double totalPrice) {
		super();
		this.customerEmail = customerEmail;
		this.customerName = customerName;
		this.contact = contact;
		this.totalPrice = totalPrice;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getConatact() {
		return contact;
	}

	public void setConatact(long conatact) {
		this.contact = conatact;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}

  class RegularCustomer extends custom {
	private double discountPercentage;

	public RegularCustomer (String customerEmail, String customerName, long contact, double totalPrice,double discountPercentage){
	super (customerEmail, customerName, contact ,totalPrice) ;
	this.discountPercentage = discountPercentage;
  }

	
	
	public double calculatePriceToPay() {
		double discountPrice = getTotalPrice() * discountPercentage / 100;
		double finalPrice = getTotalPrice() - discountPrice;
		return finalPrice;
	}
}


class PremiumCustomer extends RegularCustomer {
	private int rewardPoints;

	public PremiumCustomer(String customerEmail, String customerName, long contact, double totalPrice,
			double discountPercentage, int rewardPoints) {
		super(customerEmail, customerName, contact, totalPrice, discountPercentage);
		this.rewardPoints = rewardPoints;

	}

	public void doPriceCalculation() {
		double finalPrice = calculatePriceToPay();
		if (this.rewardPoints >= finalPrice) {
			System.out.println("The price " + finalPrice + "is paid with reward points");
			System.out.println("The remaining reward points are :" + (rewardPoints - finalPrice));
		} else {
			System.out.println("The price " + finalPrice + "is paid with reward points :" + rewardPoints);

			System.out.println("The remaining amount is paid with cash is :" + (finalPrice - rewardPoints));
		}
	}

}

public class ConstructorChaining {

	public static void main(String[] args) {

		RegularCustomer regularCustomer = new RegularCustomer("john@gamil.com", "john", 5698741236L, 5699.00, 12);
		double output = regularCustomer.calculatePriceToPay();
		System.out.println("Regular customer has to pay :" + output);
		System.out.println("===============================================================");

		PremiumCustomer premiumcustomer = new PremiumCustomer("adam@gmail.com", "adam", 89574163215L, 8549.00, 12,
				3500);
		premiumcustomer.doPriceCalculation();

	}

}

