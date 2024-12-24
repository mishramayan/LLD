public class Table implements Furniture{

    private String material;
    private String dimensions;

    public Table(String material, String dimensions) {
        this.material = material;
        this.dimensions = dimensions;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public String getType() {
        return "Table";
    }

    @Override
    public String getDimensions() {
        return dimensions;
    }
}
