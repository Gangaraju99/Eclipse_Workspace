package Oops;



	 class Customer {
		 private String customerEmail ;
		 private  static int seatsAvaliable;
		 private boolean isBooked;
		 private int seatsRequired;
		 static {
			 seatsAvaliable =10;
		 }
		 public Customer(String customerEmail , int seatsRequired) {
			 this.customerEmail=customerEmail;
			 this.seatsRequired=seatsRequired;
		 }
		 public void reverseSeats() {
			 if(seatsAvaliable >= seatsRequired) {
				 isBooked = true;
				 System.out.println("seats Avaliable are"+seatsAvaliable);
				 seatsAvaliable = seatsAvaliable - seatsRequired;
				 System.out.println("Remaining seats are:"+seatsAvaliable);
			 }else {
				
				 isBooked =false;
				 System.out.println("The avaliable seats are :"+seatsAvaliable);
				 System.out.println("Reservation is unsuccessful!!!");
			 }
		 
		 }
		void display() {
			System.out.println("Customer Emain:"+ customerEmail);
			System.out.println("SeatsRequired :"+seatsRequired);
			System.out.println("Status:"+ isBooked);
			
		}
	 }

