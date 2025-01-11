package base;

import toppings.AddOns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Base {

    private final HashMap<String, Double> base;
    double totalPriceForBase;
    List<String> baseList;

    public Base() {
        base = new HashMap<>();
        totalPriceForBase = 0.00;
        baseList = new ArrayList<>();
        base.put(Crust.GLUTENFREE.toString(),10.50);
        base.put(Crust.THICKCRUST.toString(), 7.99);
        base.put(Crust.THINCRUST.toString(), 9.00);
    }

    public void addBase(Crust crust) {
        baseList.add(crust.toString());
    }

    public void basePrint() {
        System.out.println("\nBase: ");
        for(String baseType : baseList) {
            System.out.println(baseType + ": " + base.get(baseType));
        }
    }

    public double calculateCostOfBase(){
        for(String baseType: baseList){
            if(base.containsKey(baseType)){
                totalPriceForBase += base.get(baseType);
            } else{
                System.out.println("No such base: " + baseType);
            }
        }

        System.out.println("\nTotal cost of your base: " + totalPriceForBase);
        return totalPriceForBase;
    }

}
