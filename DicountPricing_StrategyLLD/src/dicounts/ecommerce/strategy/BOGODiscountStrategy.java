package dicounts.ecommerce.strategy;

public class BOGODiscountStrategy implements DiscountStrategy {

	@Override
	public double discount(double price, double discountRate) {
		// TODO Auto-generated method stub
		double priceAfterDiscount = price/2;
		
		System.out.println("Price after BOGO discount coupon code is " + priceAfterDiscount);
		return priceAfterDiscount;
	}

}
