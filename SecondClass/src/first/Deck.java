package first;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {

    // Make a normal 52-card deck.
    private final String[] suit = new String[] {
            "spades", "hearts",
            "diamonds", "clubs"
    };
    private final String[] rank = new String[] {
            "ace", "2", "3", "4",
            "5", "6", "7", "8", "9", "10",
            "jack", "queen", "king"
    };
    private  List<String> deck;

    private Deck() {
    }
    public void createDeck(){
        deck = new ArrayList<String>();
        if (deck.size()==0) {
            for (int i = 0; i < suit.length; i++)
                for (int j = 0; j < rank.length; j++)
                    deck.add(rank[j] + " of " + suit[i]);
        }
        Collections.shuffle(deck);
    }

    public <E> List<E> dealHand(List<E> deck, int n) {
        int deckSize = deck.size();
        if (n<deckSize) {
            List<E> handView = deck.subList(deckSize - n, deckSize);
            List<E> hand = new ArrayList<E>(handView);
            handView.clear();
            return hand;
        }
        else System.out.println("Not enough cards!");
        return new ArrayList<>();
    }
}
