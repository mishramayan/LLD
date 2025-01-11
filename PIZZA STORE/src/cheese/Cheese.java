package cheese;

import base.Crust;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cheese {
    private final HashMap<String, Double> cheese;
    double totalPriceForCheese;
    List<String> cheeseList;

    public Cheese() {
        cheese = new HashMap<>();
        totalPriceForCheese = 0.00;
        cheeseList = new ArrayList<>();
        cheese.put(CheeseType.MOZZARELLA.toString(), 4.50);
        cheese.put(CheeseType.CHEDDAR.toString(), 2.99);
        cheese.put(CheeseType.PARMESAN.toString(), 3.50);
    }

    public void addCheese(CheeseType cheeseType) {
        cheeseList.add(cheeseType.toString());
    }

    public void cheesePrint() {
        System.out.println("\nCheese: ");
        for(String cheeseType : cheeseList) {
            System.out.println(cheeseType + ": " + cheese.get(cheeseType));
        }
    }

    public double calculateCostOfCheese(){
        for(String cheeseType: cheeseList){
            if(cheese.containsKey(cheeseType)){
                totalPriceForCheese += cheese.get(cheeseType);
            } else{
                System.out.println("No such cheese: " + cheeseType);
            }
        }

        System.out.println("\nTotal cost of your cheese: " + totalPriceForCheese);
        return totalPriceForCheese;
    }
}
