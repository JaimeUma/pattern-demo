package FactoryMethodPattern;

public class MyProductFactory implements ProductFactory {

    @Override
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
