package facade;

import base.Crust;
import cheese.CheeseType;
import toppings.AddOns;

public interface FacadeInterface {
    void BakePizza(Crust crust, CheeseType cheeseType, AddOns[] toppings);
    void calculateTotalPrice();
    void printBills();
}
