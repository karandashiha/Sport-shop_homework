package app;

public abstract class ProductBuilder {
    protected Product product;

    public void createProduct() {
        product = new Product();
    }

    public abstract void buildName(String color);

    public abstract void buildManufacturer(String manufacturer);

    public abstract void buildPrice();

    public Product getProduct() {
        return product;
    }
}
