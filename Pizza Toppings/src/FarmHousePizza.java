public class FarmHousePizza extends PizzaBase{
    public FarmHousePizza(){
        System.out.println("This is a farm house pizza base, which costs $15.");
    }

    @Override
    public int cost() {
        return 15;
    }
}
