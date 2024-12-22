public class Mushrooms extends PizzaBase{

    PizzaBase pizzaBase;

    public Mushrooms(PizzaBase pizza){
        this.pizzaBase = pizza;
    }

    @Override
    public int cost(){
        return this.pizzaBase.cost() + 3;
    }
}
