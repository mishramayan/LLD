import facade.FacadeInterface;
import facade.FacadeInterfaceImpl;
import base.Crust;
import cheese.CheeseType;
import toppings.AddOns;

import java.util.Scanner;

public class PizzaShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FacadeInterface facade = new FacadeInterfaceImpl();

        System.out.println("Welcome to Pizza Shop! Let's customize your pizza.");

        // Select crust
        System.out.println("Choose your crust: (1) THIN CRUST, (2) THICK CRUST, (3) GLUTEN FREE");
        int crustChoice = scanner.nextInt();
        Crust crust = switch (crustChoice) {
            case 1 -> Crust.THINCRUST;
            case 2 -> Crust.THICKCRUST;
            case 3 -> Crust.GLUTENFREE;
            default -> {
                System.out.println("Invalid choice. Defaulting to THIN CRUST.");
                yield Crust.THINCRUST;
            }
        };

        // Select cheese
        System.out.println("Choose your cheese: (1) MOZZARELLA, (2) CHEDDAR, (3) PARMESAN");
        int cheeseChoice = scanner.nextInt();
        CheeseType cheeseType = switch (cheeseChoice) {
            case 1 -> CheeseType.MOZZARELLA;
            case 2 -> CheeseType.CHEDDAR;
            case 3 -> CheeseType.PARMESAN;
            default -> {
                System.out.println("Invalid choice. Defaulting to MOZZARELLA.");
                yield CheeseType.MOZZARELLA;
            }
        };

        // Select toppings
        System.out.println("Choose your toppings (enter numbers separated by commas):");
        System.out.println("1. PEPPERONI, 2. SALAMI, 3. CHICKEN, 4. BEEF, 5. VEGETABLES, 6. SAUSAGE, 7. PINEAPPLE");
        scanner.nextLine(); // Consume newline
        String[] toppingChoices = scanner.nextLine().split(",");
        AddOns[] selectedToppings = new AddOns[toppingChoices.length];
        for (int i = 0; i < toppingChoices.length; i++) {
            selectedToppings[i] = switch (Integer.parseInt(toppingChoices[i].trim())) {
                case 1 -> AddOns.PEPPERONI;
                case 2 -> AddOns.SALAMI;
                case 3 -> AddOns.CHICKEN;
                case 4 -> AddOns.BEEF;
                case 5 -> AddOns.VEGETABLES;
                case 6 -> AddOns.SAUSAGE;
                case 7 -> AddOns.PINEAPPLE;
                default -> null;
            };
        }

        // Pass user choices to the facade
        facade.BakePizza(crust, cheeseType, selectedToppings);
        facade.calculateTotalPrice();
        facade.printBills();
    }
}
