public class MainCourse implements Dish{

    private String name;
    private int time;
    private double price;

    public MainCourse(String name, double price, int time){
        this.name = name;
        this.time = time;
        this.price = price;
    }

    @Override
    public String getName() {
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
