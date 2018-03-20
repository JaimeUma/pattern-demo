package FactoryMethodPattern.Demo;

public class UrukHai extends Orc {

    @Override
    public void display() {
        System.out.println("you just got a frightening uruk-hai on your screen");
    }

    @Override
    public double getDamage() {
        return 4.2; // uruk-hais are no joke
    }

}
