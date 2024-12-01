package dicounts.ecommerce.strategy;

public class PercentageDiscountStrategy implements DiscountStrategy {

	@Override
	public double discount(double price, double discountRate) {
		// TODO Auto-generated method stub
		double priceAfterDiscount = price - (price*(discountRate/100));
		
		System.out.println("Price after " + discountRate + "% discount is " + priceAfterDiscount);
		return priceAfterDiscount;
	}

}
