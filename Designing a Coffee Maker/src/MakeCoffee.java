public class MakeCoffee {
    public static void main(String[] args) {
        System.out.println("Hello, Welcome to coffee shop!");

        double coffeePrice = new Milk(new Sugar(new Sugar(new WhippedCream(new Espresso())))).cost();
        System.out.println("Total cost of your coffee is "+coffeePrice);

        double coffeePrice2 = new Caramel(new Sugar(new Cappuccino())).cost();
        System.out.println("Total cost of your coffee is "+coffeePrice2);
    }
}