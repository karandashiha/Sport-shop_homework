package app;

import java.util.ArrayList;
import java.util.List;

public class Director {
    public Order constructOrderA(ProductBuilder tShirtBuilder, ProductBuilder capBuilder) {
        tShirtBuilder.createProduct();
        tShirtBuilder.buildName("червона");
        tShirtBuilder.buildManufacturer("Active sports");
        tShirtBuilder.buildPrice();

        capBuilder.createProduct();
        capBuilder.buildName("біла");
        capBuilder.buildManufacturer("Smart caps");
        capBuilder.buildPrice();

        List<Product> products = new ArrayList<>();
        products.add(tShirtBuilder.getProduct());
        products.add(capBuilder.getProduct());

        return new Order(products);
    }

    public Order constructOrderB(ProductBuilder tShirtBuilder, ProductBuilder capBuilder) {
        tShirtBuilder.createProduct();
        tShirtBuilder.buildName("синя");
        tShirtBuilder.buildManufacturer("Active sports");
        tShirtBuilder.buildPrice();

        capBuilder.createProduct();
        capBuilder.buildName("чорна");
        capBuilder.buildManufacturer("Smart caps");
        capBuilder.buildPrice();

        List<Product> products = new ArrayList<>();
        products.add(tShirtBuilder.getProduct());
        products.add(capBuilder.getProduct());

        return new Order(products);
    }
}
