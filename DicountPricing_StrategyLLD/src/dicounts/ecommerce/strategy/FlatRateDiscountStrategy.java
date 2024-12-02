package dicounts.ecommerce.strategy;

public class FlatRateDiscountStrategy implements DiscountStrategy {

	@Override
	public double discount(double price, double flatRate) {
		// TODO Auto-generated method stub
		if (price < 0 || flatRate < 0 || flatRate > price) {
		    throw new IllegalArgumentException("Price and discount rate must be non-negative.");
		}

		double priceAfterDiscount = price - flatRate;
		
		System.out.println("Price after $" + flatRate + " discount is " + priceAfterDiscount);
		return priceAfterDiscount;
	}

}
