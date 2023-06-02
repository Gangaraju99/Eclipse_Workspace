
package com.sekhar.test;

import com.sekhar.Order.Order;
import com.sekhar.coupon.Coupon;
import com.sekhar.coupon.FashonCoupon;
import com.sekhar.coupon.MobileCoupon;
import com.sekhar.item.Item;

public class Test {

	public static void main(String[] args) {
		
		Item item1 = new Item(1,"iphone",12000.0,2,"Mobile");
		Item item2 = new Item(2,"samsung",10000.0,1,"Mobile");
		Item item3 = new Item(3,"shirt",699.0,3,"Fashon");
		
		Item [] items = {item1, item2, item3};
		//create order object ,set the orderid and items array
		// dont set the final price here, bcz it is calculated based on coupons
		
		Order order = new Order ();
		order.setOrderId(1524621);
		order.setItems(items);

		Coupon mobileCoupon = new MobileCoupon();
		order = mobileCoupon.applyCoupon (order, mobileCoupon);
		
		Coupon fashonCoupon = new FashonCoupon();
		order = fashonCoupon.applyCoupon(order, fashonCoupon);
		
		System.out.println("Final price of the order is :"+order.getFinalPrice());
		
		
	}

}
