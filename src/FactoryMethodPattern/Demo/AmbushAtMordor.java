package FactoryMethodPattern.Demo;

import java.util.ArrayList;

public class AmbushAtMordor {

    public static void main(String[] args) {

        System.out.println("Welcome to Mordor!\n");
        System.out.println("Enter at your own risk...\n");

        String[] attackers = { "orc", "uruk-hai", "orc", "uruk-hai",
                "cave-troll", "uruk-hai", "cave-troll", "orc" };
        EnemyFactory mordor = new EnemyFactory();
        ArrayList<Enemy> horde = new ArrayList<Enemy>();
        for (int i = 0; i < attackers.length; i++) {
            horde.add(mordor.makeEnemy(attackers[i]));
        }

        double totalDamage = 0.0;
        for (Enemy e : horde) {
            e.display();
            System.out.println(String.format("damage inflicted: %.2f\n",
                    e.getDamage()));
            totalDamage += e.getDamage();
        }
        System.out.println("You have just been inflicted a total damage of "
                + totalDamage);
        System.out.println("I told you! Mordor...one does not simply walk in...");
    }
}
