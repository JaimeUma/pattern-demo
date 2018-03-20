package StrategyPattern.Demo;

public class Client {

    public static void main(String[] args) {

        Weapon orc = new Weapon(new SwordAttack());
        orc.hit();

        Weapon urukhai = new Weapon(new BigSwordAttack());
        urukhai.hit();

        Weapon caveTroll = new Weapon(new ClubAttack());
        caveTroll.hit();
    }

}
