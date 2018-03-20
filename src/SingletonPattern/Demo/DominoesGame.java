package SingletonPattern.Demo;

import java.util.ArrayList;

public class DominoesGame {

    public static void main(String[] args) {
    	// singleton se usa en este ejemplo solo a modo ilustrativo
    	// habría mejores formas de implementar este ejemplo
        Deck deckOne = Deck.getInstance();
        System.out.println("deck 1 : " + System.identityHashCode(deckOne));
        System.out.print("deck 1 contents: ");
        for (Tile t : deckOne.getTiles()) {
            System.out.print(t + " ");
        }
        System.out.println("");
        ArrayList<Tile> playerOne = deckOne.takeTiles(7);
        System.out.print("player one hand: ");
        for (Tile t : playerOne) {
            System.out.print(t + " ");
        }
        System.out.println("");

        Deck deckTwo = Deck.getInstance();
        System.out.println("deck 2 : " + System.identityHashCode(deckTwo));
        System.out.print("deck 2 contents: ");
        for (Tile t : deckTwo.getTiles()) {
            System.out.print(t + " ");
        }
        System.out.println("");
        ArrayList<Tile> playerTwo = deckTwo.takeTiles(7);
        System.out.print("player two hand: ");
        for (Tile t : playerTwo) {
            System.out.print(t + " ");
        }
        System.out.println("");
    }
}
