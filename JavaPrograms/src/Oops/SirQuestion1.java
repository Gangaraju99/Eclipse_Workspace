package Oops;

class Product{
	private int  id ;
	private String name;
	private double price;
	private double rating;
	 
	public void setId(int id) {
		this.id= id;
	}
	public int getId() {
		return id;
	}
  public void setName(String name) {
	this.name=name;
   }

  public String getName() {
	  return name;
  }
  public void setPrice(double price) {
	  this.price = price;
  }
  public double getDouble() {
	  return price;
  }
  public void setRating(double rating) {
	  this.rating = rating ;
	  
  }

public double getRating() {
	return rating;
}  
  
 public void display() {
	 System.out.println("Id:"+id);
	 System.out.println("product name:"+name);
	 System.out.println("price:"+price);
	 System.out.println("Rating:"+rating);
	 
 }
}


   // main classs


public class SirQuestion1 {
	
	public static void main(String[] args) {
		
		Product obj1 = new Product ();
		obj1.setId(11188);
		obj1.setName("lenovo");
		obj1.setPrice(44999.00);
		obj1.setRating(4.4);
		//obj1.display();
		
		Product obj2 = new Product ();
		obj2.setId(11189);
		obj2.setName("Asus");
		obj2.setPrice(35000.00);
		obj2.setRating(4.2);
		//obj2.display();
		
		
		Product obj3 = new Product ();
		obj3.setId(11190);
		obj3.setName("HP");
		obj3.setPrice(49000.00);
		obj3.setRating(4.5);
		//obj3.display();
		
		Product obj4 = new Product ();
		obj4.setId(11191);
		obj4.setName("Dell");
		obj4.setPrice(56000.00);
		obj4.setRating(4.6);
		//obj4.display();
		
		Product obj5 = new Product ();
		obj5.setId(11192);
		obj5.setName("Acer");
		obj5.setPrice(32000.00);
		obj5.setRating(4.0);
		//obj5.display();
		
		
		// Adding the objects to an Array
		
		 Object [] add = {obj1,obj2,obj3,obj4,obj5};
		add[0] = obj1;
		add[1]= obj2;
		add[2]= obj3;
		add[3]= obj4;
		
	
			
		}
		
		
		
		
			
		
		
		
		
		
		
		
		
	}

	

	 

