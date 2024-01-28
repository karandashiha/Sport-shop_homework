package app;

import java.util.List;

public class Order {
    private List<Product> products;

    public Order(List<Product> products) {
        this.products = products;
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void printOrderDetails(String orderName) {
        System.out.println(orderName);
        for (Product product : products) {
            System.out.println("Назва товару: " + product.getName());
            System.out.println("Фірма-виробник: " + product.getManufacturer());
            System.out.println("Ціна товару: " + product.getPrice());
            System.out.println("--------------------");
        }
        System.out.println("Загальна вартість замовлення: " + calculateTotal());
        System.out.println();
    }
}
