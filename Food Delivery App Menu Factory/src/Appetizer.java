public class Appetizer implements Dish{

    private String name;
    private int time;
    private double price;

    public Appetizer(String name, double price, int time){
        this.name = name;
        this.time = time;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPreparationTime() {
        return time;
    }
}
