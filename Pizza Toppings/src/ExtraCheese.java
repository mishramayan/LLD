public class ExtraCheese extends Toppings{

    PizzaBase pizzaBase;

    public ExtraCheese(PizzaBase pizza){
        this.pizzaBase = pizza;
    }

    @Override
    public int cost() {
        return this.pizzaBase.cost() + 2;
    }
}
