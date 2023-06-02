package com.sekhar.item;

public class Item {
	private int itemId;
	private String itemname;
	private double itemprice;
	private int numberOfUnits;
	private String category;

	public Item() {

	}

	public Item(int itemId, String itemname, double itemprice, int numberOfUnits, String category) {
		super();
		this.itemId = itemId;
		this.itemname = itemname;
		this.itemprice = itemprice;
		this.numberOfUnits = numberOfUnits;
		this.category = category;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public double getItemprice() {
		return itemprice;
	}

	public void setItemprice(double itemprice) {
		this.itemprice = itemprice;
	}

	public int getNumberOfUnits() {
		return numberOfUnits;
	}

	public void setNumberOfUnits(int numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}