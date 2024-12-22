public class VeggiePizza extends PizzaBase{
    public VeggiePizza(){
        System.out.println("This is a veggie pizza base, which costs $13.");
    }

    @Override
    public int cost() {
        return 13;
    }
}
