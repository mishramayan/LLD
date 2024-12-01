package discounts.ecommerce;

import dicounts.ecommerce.strategy.FlatRateDiscountStrategy;

public class FlatRateDiscount extends Discount {

	FlatRateDiscount(){
		super(new FlatRateDiscountStrategy());
	}
}
