public class WhippedCream extends BaseCoffee{

    BaseCoffee baseCoffee;

    public WhippedCream(BaseCoffee baseCoffee) {
        System.out.println("Adding extra whipped cream.");
        this.baseCoffee = baseCoffee;
    }

    @Override
    public double cost(){
        return baseCoffee.cost() + 0.50;
    }
}
