package SingletonPattern.Demo;

public class Tile {

    final private int one;
    final private int two;

    public Tile(int one, int two) {
        this.one = one;
        this.two = two;
    }

    @Override
    public String toString() {
        return one + ":" + two;
    }

}
