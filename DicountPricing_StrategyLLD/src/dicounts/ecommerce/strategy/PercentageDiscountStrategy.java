package dicounts.ecommerce.strategy;

public class PercentageDiscountStrategy implements DiscountStrategy {

	@Override
	public double discount(double price, double discountRate) {
		// TODO Auto-generated method stub
		if (price < 0 || discountRate < 0) {
		    throw new IllegalArgumentException("Price and discount rate must be non-negative.");
		}

		double priceAfterDiscount = price - (price*(discountRate/100));
		
		System.out.println("Price after " + discountRate + "% discount is " + priceAfterDiscount);
		return priceAfterDiscount;
	}

}
