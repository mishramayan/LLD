public class FurnitureFactory {

    public static Furniture getFurniture(String furnitureType, String material, String dimensions) {
        switch (furnitureType.toLowerCase()){
            case "sofa":
                if(furnitureType.equalsIgnoreCase("sofa")){
                    return new Sofa(material, dimensions);
                }
            break;

            case "table":
                if(furnitureType.equalsIgnoreCase("table")){
                    return new Table(material, dimensions);
                }
            break;

            case "chair":
                if(furnitureType.equalsIgnoreCase("chair")){
                    return new Chair(material, dimensions);
                }
            break;

            default:
                throw new IllegalArgumentException("Invalid furniture type");
        }

        throw new IllegalArgumentException("Furniture type was not found.");
    }
}
