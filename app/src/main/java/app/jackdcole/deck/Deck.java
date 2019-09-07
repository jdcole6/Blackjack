package app.jackdcole.deck;

public class Deck extends Card {

    public final int DECK_SIZE = 52;

    public Deck() {
        createDeck();
    }

    public Card[] createDeck() {
        Card[] deck = new Card[DECK_SIZE];

        return deck;
    }

    public Card[] shuffle(Card[] deck) {
        return deck;
    }
}
