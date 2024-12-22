public class Espresso extends BaseCoffee{
    public Espresso() {
        System.out.println("Base drink is espresso.");
    }

    @Override
    public double cost(){
        return 3;
    }

}
