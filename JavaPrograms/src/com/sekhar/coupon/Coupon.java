package com.sekhar.coupon;

import com.sekhar.Order.Order;

public abstract class Coupon {

	public abstract Order applyCoupon (Order order, Coupon coupon);
}
