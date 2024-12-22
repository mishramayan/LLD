public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the pizza store.");
        int totalCost = new Mushrooms(new Pepperoni(new CheesePizza())).cost();
        System.out.println("Total cost: " + totalCost);

        int totalCost2 = new ExtraCheese(new Pepperoni(new FarmHousePizza())).cost();
        System.out.println("Total cost: " + totalCost2);
    }
}