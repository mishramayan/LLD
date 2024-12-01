package discounts.ecommerce;

import dicounts.ecommerce.strategy.BOGODiscountStrategy;

public class BOGODiscount extends Discount {
	
	BOGODiscount(){
		super(new BOGODiscountStrategy());
	}
}
