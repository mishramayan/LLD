public class DishFactory {

    public static Dish createDish(String category, String type) {
        switch (category.toLowerCase()){
            case "appetizer":
                if(type.equalsIgnoreCase("Garlic Bread")){
                    return new Appetizer("Garlic Bread", 10.0, 10);
                }else if(type.equalsIgnoreCase("Caesar Salad")){
                    return new Appetizer("Caesar Salad", 7.5, 15);
                }
                break;

            case "maincourse":
                if (type.equalsIgnoreCase("Margherita Pizza")) {
                    return new MainCourse("Margherita Pizza", 12.0, 20);
                } else if (type.equalsIgnoreCase("Grilled Salmon")) {
                    return new MainCourse("Grilled Salmon", 18.0, 25);
                }
                break;

            case "dessert":
                if (type.equalsIgnoreCase("Chocolate Cake")) {
                    return new Dessert("Chocolate Cake", 6.5, 15);
                } else if (type.equalsIgnoreCase("Ice Cream")) {
                    return new Dessert("Ice Cream", 4.0, 5);
                }
                break;

            case "beverage":
                if (type.equalsIgnoreCase("Coffee")) {
                    return new Beverages("Coffee", 3.0, 5);
                } else if (type.equalsIgnoreCase("Fresh Juice")) {
                    return new Beverages("Fresh Juice", 4.5, 7);
                }
                break;

            default:
                throw new IllegalArgumentException("Invalid category or type");
        }
        throw new IllegalArgumentException("Dish type not found in the given category.");
    }

}
