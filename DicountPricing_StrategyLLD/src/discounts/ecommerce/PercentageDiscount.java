package discounts.ecommerce;

import dicounts.ecommerce.strategy.PercentageDiscountStrategy;

public class PercentageDiscount extends Discount {
	
	PercentageDiscount(){
		super(new PercentageDiscountStrategy());
	}
}
