package com.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
	
	private int id  ;
	private String item ;
	private float price ;
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Product(int i, String string, float f) {
	}

	public static void main(String[] args) {
		
		
		
	   List < Product > productsList = new ArrayList < Product > ();
		
	   productsList.add(new Product(1, "HP Laptop", 25000f));
       productsList.add(new Product(2, "Dell Laptop", 30000f));
       productsList.add(new Product(3, "Lenevo Laptop", 28000f));
       productsList.add(new Product(4, "Sony Laptop", 28000f));
       productsList.add(new Product(5, "Apple Laptop", 90000f));
		
        productsList.stream().filter(p -> p.getPrice()>25000.0).map((product) -> product.getPrice()).collect(Collectors.toList()).forEach(System.out::println);
       
       
       
       
       
       
       
		
	}

}
