package StrategyPattern.Demo;

public class BigSwordAttack implements IAttack {

    @Override
    public void hit() {
        System.out.println("hit hard with big sword");
    }
}
