public class Cappuccino extends BaseCoffee{

    public Cappuccino() {
        System.out.println("Base drink is cappuccino.");
    }

    @Override
    public double cost() {
        return 4.75;
    }
}
