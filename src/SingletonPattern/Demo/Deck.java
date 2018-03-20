package SingletonPattern.Demo;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    // static reference to the one and only instance
    private static Deck theInstance = null;

    // add some instance attributes

    ArrayList<Tile> tiles = new ArrayList<Tile>();

    // private constructor
    private Deck() {
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                tiles.add(new Tile(i, j));
            }
        }
        Collections.shuffle(tiles);
    }

    public static synchronized Deck getInstance() {
        if (theInstance == null) {
            theInstance = new Deck();
        }
        return theInstance;
    }

    // add some instance methods

    public Iterable<Tile> getTiles() {
        return tiles;
    }

    public ArrayList<Tile> takeTiles(int n) {
        ArrayList<Tile> taken = new ArrayList<Tile>();
        for (int i=0; i<n; i++) {
           taken.add(tiles.remove(0));
        }
        return taken;
    }
}
