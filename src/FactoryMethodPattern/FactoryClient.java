package FactoryMethodPattern;

public class FactoryClient {

    public static void main(String[] args) {

        Factory productFactory = new Factory();
        Product p = productFactory.makeProduct(args[0]);
        if (p!= null) {
        p.doStuff();
        }
        else {
            System.out.println("product not supported");
        }

        // so what's the big deal?
    }

}
