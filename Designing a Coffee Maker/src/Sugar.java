public class Sugar extends BaseCoffee{

    BaseCoffee baseCoffee;

    public Sugar(BaseCoffee coffee){
        System.out.println("Adding extra sugar.");
        this.baseCoffee = coffee;
    }

    @Override
    public double cost(){
        return this.baseCoffee.cost() + 0.25;
    }

}
