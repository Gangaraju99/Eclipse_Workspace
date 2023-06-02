package com.sekhar.coupon;

import com.sekhar.Order.Order;
import com.sekhar.item.Item;

public  class FashonCoupon  extends Coupon{

	public Order applyCoupon(Order order, Coupon coupon) {
		Item[] items = order.getItems();
		double finalOrderPrice = order.getFinalPrice();

		for (Item item : items) {
			double price = 0;
			if (item.getCategory().equals("Fashon")) {
				if (item.getNumberOfUnits() % 2 == 0) {
					price = item.getNumberOfUnits() / 2 * item.getItemprice();

				} 
				else {
					price = (item.getNumberOfUnits() / 2 * item.getItemprice()) + item.getItemprice() / 2;

				}

			}
		
		finalOrderPrice += price;
		}
	order.setFinalPrice(finalOrderPrice);
	return order;
	}
}
