package dicounts.ecommerce.strategy;

public interface DiscountStrategy {
	public double discount(double price, double discountRate);
}
