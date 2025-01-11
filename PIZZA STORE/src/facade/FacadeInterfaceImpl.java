package facade;

import base.Base;
import base.Crust;
import cheese.Cheese;
import cheese.CheeseType;
import toppings.AddOns;
import toppings.Toppings;

public class FacadeInterfaceImpl implements FacadeInterface {

    private final Toppings toppings;
    private final Base base;
    private final Cheese cheese;
    private double totalCost;

    public FacadeInterfaceImpl() {
        this.toppings = new Toppings();
        this.base = new Base();
        this.cheese = new Cheese();
        this.totalCost = 0.00;
    }

    @Override
    public void BakePizza(Crust crust, CheeseType cheeseType, AddOns[] toppingChoices) {
        System.out.println("Customizing your pizza...");

        // Add base
        base.addBase(crust);

        // Add cheese
        cheese.addCheese(cheeseType);

        // Add toppings
        for (AddOns topping : toppingChoices) {
            if (topping != null) {
                toppings.addTopping(topping);
            }
        }
    }

    @Override
    public void calculateTotalPrice() {
        totalCost = toppings.calculateCostOfToppings() + base.calculateCostOfBase() + cheese.calculateCostOfCheese();
    }

    @Override
    public void printBills() {
        System.out.println("\n===== Pizza Bill =====");
        base.basePrint();
        toppings.toppingsPrint();
        cheese.cheesePrint();
        System.out.printf("\nTotal Price: $%.2f\n", totalCost);
        System.out.println("=======================");
    }
}
