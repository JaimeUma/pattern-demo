package StrategyPattern.Demo;

public class ClubAttack implements IAttack {

    @Override
    public void hit() {
        System.out.println("hit really hard with humongous club");
    }
}
