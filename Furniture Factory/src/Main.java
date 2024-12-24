public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Furniture Factory!");

        Furniture chair = FurnitureFactory.getFurniture("Chair", "Wood", "40x40x90 cm");
        System.out.println("Furniture Type: " + chair.getType());
        System.out.println("Material: " + chair.getMaterial());
        System.out.println("Dimensions: " + chair.getDimensions());
        System.out.println();

        Furniture table = FurnitureFactory.getFurniture("Table", "Plastic", "120x80x75 cm");
        System.out.println("Furniture Type: " + table.getType());
        System.out.println("Material: " + table.getMaterial());
        System.out.println("Dimensions: " + table.getDimensions());
        System.out.println();

        Furniture sofa = FurnitureFactory.getFurniture("Sofa", "Metal", "200x90x85 cm");
        System.out.println("Furniture Type: " + sofa.getType());
        System.out.println("Material: " + sofa.getMaterial());
        System.out.println("Dimensions: " + sofa.getDimensions());
    }
}