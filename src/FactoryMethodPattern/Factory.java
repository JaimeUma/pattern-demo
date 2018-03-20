package FactoryMethodPattern;

public class Factory {

    public Product makeProduct(String name) {
        switch (name) {
        case "one":
            return new ProductOne();
        case "two":
            return new ProductTwo();
        default:
            return null;
        }
    }
}
