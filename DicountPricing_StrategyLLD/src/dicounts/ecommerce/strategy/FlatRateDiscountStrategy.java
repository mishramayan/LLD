package dicounts.ecommerce.strategy;

public class FlatRateDiscountStrategy implements DiscountStrategy {

	@Override
	public double discount(double price, double flatRate) {
		// TODO Auto-generated method stub
		double priceAfterDiscount = price - flatRate;
		
		System.out.println("Price after $" + flatRate + " discount is " + priceAfterDiscount);
		return priceAfterDiscount;
	}

}
