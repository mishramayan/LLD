public class Milk extends AddOns{

    BaseCoffee baseCoffee;

    public Milk(BaseCoffee coffee){
        System.out.println("Adding extra milk.");
        this.baseCoffee = coffee;
    }

    @Override
    public double cost() {
        return baseCoffee.cost() + 1.50;
    }
}
