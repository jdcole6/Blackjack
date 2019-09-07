package app.jackdcole.deck;

import java.util.Random;

public class Deck extends Card {

    public Card[] deck;

    public final int DECK_SIZE = 52;

    public Deck() {
        deck = new Card[DECK_SIZE];

        createDeck();
    }

    public Card[] createDeck() {
        for (int i = 0; i < DECK_SIZE; i++) {
            int number = 0;
            Suit suit = Suit.CLUBS;

            if (i == 13) {
                suit = Suit.SPADES;
                number = 0;
            }
            if (i == 26) {
                suit = Suit.DIAMONDS;
                number = 0;
            }
            if (i == 39) {
                suit = Suit.HEARTS;
                number = 0;
            }
            deck[i] = new Card(number, suit);
        }
        shuffle();
        return deck;
    }

    public Card[] shuffle() {
        Random rand = new Random();

        for (int i = 0; i < DECK_SIZE; i++) {
            int r = i + rand.nextInt(DECK_SIZE - i);

            Card temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        return deck;
    }

    public Card[] getDeck() {
        return deck;
    }
}
