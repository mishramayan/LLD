package dicounts.ecommerce.strategy;

public class BOGODiscountStrategy implements DiscountStrategy {

	@Override
	public double discount(double price, double discountRate) {
		// TODO Auto-generated method stub
		if (price < 0) {
		    throw new IllegalArgumentException("Price and discount rate must be non-negative.");
		}

		double priceAfterDiscount = price/2;
		
		System.out.println("Price after BOGO discount coupon code is " + priceAfterDiscount);
		return priceAfterDiscount;
	}

}
