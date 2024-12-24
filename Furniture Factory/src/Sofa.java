public class Sofa implements Furniture{

    private String material;
    private String dimensions;

    public Sofa(String material, String dimensions) {
        this.material = material;
        this.dimensions = dimensions;
    }

    @Override
    public String getType(){
        return "Sofa";
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
