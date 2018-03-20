package StrategyPattern;

public class StrategyOne implements IStrategy {

    @Override
    public void execute() {
        System.out.println("Strategy ONE executed");
    }
}
