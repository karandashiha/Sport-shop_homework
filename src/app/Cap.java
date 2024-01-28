package app;

public class Cap extends ProductBuilder {
    public void buildName(String color) {
        product.setName(color + " кепка");
    }

    @Override
    public void buildManufacturer(String manufacturer) {
        product.setManufacturer(manufacturer);
    }

    @Override
    public void buildPrice() {
        product.setPrice(15.0);
    }
}
