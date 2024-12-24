public class Chair implements Furniture{

    private String material;
    private String dimensions;

    public Chair(String material, String dimensions) {
        this.material = material;
        this.dimensions = dimensions;
    }

    @Override
    public String getType() {
        return "Chair";
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public String getDimensions() {
        return dimensions;
    }

}
