public class CheesePizza extends PizzaBase{
    public CheesePizza(){
        System.out.println("This is a cheese pizza base, which costs $10.");
    }

    @Override
    public int cost(){
        return 10;
    }
}
