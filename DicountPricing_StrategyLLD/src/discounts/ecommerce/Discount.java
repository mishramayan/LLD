package discounts.ecommerce;

import dicounts.ecommerce.strategy.DiscountStrategy;

public class Discount {
	
	DiscountStrategy discountStrategy;
	
	public Discount(DiscountStrategy discountStrategyObj) {
		this.discountStrategy = discountStrategyObj;
	}
	
	public double discount(double price, double rate) {
		return discountStrategy.discount(price, rate);
	}
}
