public class Dessert implements Dish{

    private String name;
    private double price;
    private int time;

    public Dessert(String name, double price, int time){
        this.name = name;
        this.price = price;
        this.time = time;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getPreparationTime() {
        return time;
    }

}
