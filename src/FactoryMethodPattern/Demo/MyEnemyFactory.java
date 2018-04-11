package FactoryMethodPattern.Demo;

public class MyEnemyFactory implements EnemyFactory {

    public Enemy makeEnemy(String name) {
        switch (name) {
        case "orc":
            return new Orc();
        case "uruk-hai":
            return new UrukHai();
        case "cave-troll":
            return new CaveTroll();
        default:
            return null;
        }
    }

}
