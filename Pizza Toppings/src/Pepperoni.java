public class Pepperoni extends PizzaBase{

    PizzaBase pizzaBase;

    public Pepperoni(PizzaBase pizza){
        this.pizzaBase = pizza;
    }

    @Override
    public int cost(){
        return pizzaBase.cost() + 5;
    }
}
