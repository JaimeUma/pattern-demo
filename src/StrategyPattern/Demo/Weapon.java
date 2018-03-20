package StrategyPattern.Demo;


public class Weapon {

    IAttack attack;

    public Weapon(IAttack attack) {
        this.attack = attack;
    }

    public void hit() {
        attack.hit();
    }

}
