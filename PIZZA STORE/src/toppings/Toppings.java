package toppings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Toppings {

    private final HashMap<String, Double> toppings;
    double totalPriceForToppings;
    List<String> toppingsList;

    public Toppings() {
        toppings = new HashMap<>();
        totalPriceForToppings = 0.00;
        toppingsList = new ArrayList<>();
        toppings.put(AddOns.PEPPERONI.toString(),2.50);
        toppings.put(AddOns.BEEF.toString(), 1.00);
        toppings.put(AddOns.CHICKEN.toString(), 2.00);
        toppings.put(AddOns.SALAMI.toString(), 1.50);
        toppings.put(AddOns.SAUSAGE.toString(), 3.50);
        toppings.put(AddOns.VEGETABLES.toString(), 2.00);
        toppings.put(AddOns.PINEAPPLE.toString(), 0.99);
    }

    public void addTopping(AddOns topping) {
        toppingsList.add(topping.toString());
    }

    public void toppingsPrint() {
        System.out.println("\nToppings: ");
        for(String topping : toppingsList) {
            System.out.println(topping + ": " + toppings.get(topping));
        }
    }

    public double calculateCostOfToppings(){
        for(String topping: toppingsList){
            if(toppings.containsKey(topping)){
                totalPriceForToppings += toppings.get(topping);
            } else{
                System.out.println("No such topping: " + topping);
            }
        }

        System.out.println("\nTotal cost of your toppings: " + totalPriceForToppings);
        return totalPriceForToppings;
    }

}
