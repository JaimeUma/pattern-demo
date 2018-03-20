package StrategyPattern;

public class Client {

    public static void main(String[] args) {

        Context first = new Context(new StrategyOne());
        first.execute();

        Context second = new Context(new StrategyTwo());
        second.execute();
    }
}
