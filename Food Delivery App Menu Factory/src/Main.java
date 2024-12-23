
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Food Delivery App!");

        //Request a Main Course dish
        Dish appetizer = DishFactory.createDish("Appetizer","Garlic Bread");
        System.out.println("Dish: " + appetizer.getName());
        System.out.println("Price: $" + appetizer.getPrice());
        System.out.println("Preparation Time: " + appetizer.getPreparationTime() + " minutes\n");

        //Request a Main Course dish
        Dish mainCourse = DishFactory.createDish("MainCourse","Margherita Pizza");
        System.out.println("Dish: " + mainCourse.getName());
        System.out.println("Price: $" + mainCourse.getPrice());
        System.out.println("Preparation Time: " + mainCourse.getPreparationTime() + " minutes\n");

        // Request a Dessert dish
        Dish dessert = DishFactory.createDish("Dessert", "Chocolate Cake");
        System.out.println("Dish: " + dessert.getName());
        System.out.println("Price: $" + dessert.getPrice());
        System.out.println("Preparation Time: " + dessert.getPreparationTime() + " minutes\n");

        // Request a Beverage
        Dish beverage = DishFactory.createDish("Beverage", "Coffee");
        System.out.println("Dish: " + beverage.getName());
        System.out.println("Price: $" + beverage.getPrice());
        System.out.println("Preparation Time: " + beverage.getPreparationTime() + " minutes");

    }
}