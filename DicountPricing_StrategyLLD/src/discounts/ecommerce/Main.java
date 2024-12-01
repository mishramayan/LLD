package discounts.ecommerce;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Discount discountObj = new PercentageDiscount();
		discountObj.discount(150, 10);
		
		Discount discountObj1 = new FlatRateDiscount();
		discountObj1.discount(199, 30);
		
		Discount discountObj2 = new BOGODiscount();
		discountObj2.discount(200, 0);
	}

}
