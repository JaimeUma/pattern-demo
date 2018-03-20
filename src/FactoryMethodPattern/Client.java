package FactoryMethodPattern;

public class Client {

	public static void main(String[] args) {
		Product p = null;

		if (args[0].equals("one")) {
			p = new ProductOne();
		} else if (args[0].equals("two")) {
			p = new ProductTwo();
		} else {
			System.out.println("product not supported");
		}

		if (p != null) {
			p.doStuff();
		}
	}
}
