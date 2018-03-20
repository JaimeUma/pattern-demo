package FactoryMethodPattern.Demo;

public class CaveTroll extends Troll {

    @Override
    public void display() {
        System.out.println("you just got a rocky cave troll on your screen");
    }

    @Override
    public double getDamage() {
        return 6.0; // not very agile, but quite strong
    }
}
