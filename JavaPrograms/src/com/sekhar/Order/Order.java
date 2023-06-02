package com.sekhar.Order;

import com.sekhar.item.Item;

public class Order {

	private int orderId;
	private Item[] items;
	private double finalPrice;
	
	public Order() {
}

	public Order(int orderId, double finalProce, Item[] items) {
	
		this.orderId = orderId;
		this.items = items;
		this.finalPrice = finalPrice;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double fianlPrice) {
		this.finalPrice = fianlPrice;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}
	

	
	
	
}