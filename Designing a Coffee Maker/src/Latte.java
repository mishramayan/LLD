public class Latte extends BaseCoffee{
    public Latte() {
        System.out.println("Base drink is latte.");
    }

    @Override
    public double cost() {
        return 4.25;
    }
}
