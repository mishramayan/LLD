public class Caramel extends BaseCoffee{

    BaseCoffee baseCoffee;

    public Caramel(BaseCoffee coffee){
        System.out.println("Adding extra caramel.");
        this.baseCoffee = coffee;
    }

    @Override
    public double cost(){
        return baseCoffee.cost() + 1.0;
    }

}
