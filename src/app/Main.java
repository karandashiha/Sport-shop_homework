package app;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        ProductBuilder tShirtBuilder = new TShirt();
        ProductBuilder capBuilder = new Cap();

        Order orderA = director.constructOrderA(tShirtBuilder, capBuilder);
        orderA.printOrderDetails("Замовлення A");

        Order orderB = director.constructOrderB(tShirtBuilder, capBuilder);
        orderB.printOrderDetails("Замовлення B");
    }
}
