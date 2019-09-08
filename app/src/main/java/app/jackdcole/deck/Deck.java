package app.jackdcole.deck;

import java.util.ArrayList;
import java.util.Random;

public class Deck extends Card {

    public ArrayList<Card> deck;

    public final int DECK_SIZE = 52;

    public Deck() {
        deck = new ArrayList<Card>();

        createDeck();
    }

    public ArrayList<Card> createDeck() {
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
            deck.add(new Card(number, suit));
        }
        shuffle();
        return deck;
    }

    public ArrayList<Card> shuffle() {
        Random rand = new Random();

        for (int i = 0; i < DECK_SIZE; i++) {
            int r = i + rand.nextInt(DECK_SIZE - i);

            Card temp1 = deck.get(r);
            Card temp2 = deck.get(i);
            deck.set(i, temp1);
            deck.set(r, temp2);
        }

        return deck;
    }

    public Card removeCard() {
        Card next = deck.remove(0);
        return next;
    }

    public void addCard(Card card) {
        deck.add(card);
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }
}
