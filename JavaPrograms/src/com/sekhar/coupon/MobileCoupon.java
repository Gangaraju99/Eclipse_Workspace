package com.sekhar.coupon;

import com.sekhar.Order.Order;
import com.sekhar.item.Item;

public  class MobileCoupon extends Coupon {

	public Order applyCoupon(Order order, Coupon coupon) {
		
	// read items of the order
	Item[] items = order.getItems();
	double finalOrderPrice = 0;
	for(Item item: items) {
		double price = item.getItemprice() * item.getNumberOfUnits();
		if(item.getCategory().equals("Mobile")) {
			price = price-50;
			finalOrderPrice += price;
		}
	}
order.setFinalPrice(finalOrderPrice);
return order;
	}
}
