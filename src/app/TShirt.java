package app;

public class TShirt extends ProductBuilder {
    public void buildName(String color) {
        product.setName(color + " футболка");
    }

    @Override
    public void buildManufacturer(String manufacturer) {
        product.setManufacturer(manufacturer);
    }

    @Override
    public void buildPrice() {
        product.setPrice(25.0);
    }
}
