package FactoryMethodPattern.Demo;

public class Orc extends Enemy {

    @Override
    public void display() {
        System.out.println("you just got an ugly orc on your screen");
    }

    @Override
    public double getDamage() {
        return 1.8; // orcs are pretty weak
    }

}
