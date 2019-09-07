package app.jackdcole.deck;

public class Card {

    public int number;

    public Suit suit;

    public Card() {
        // default constructor
    }

    public Card(int number, Suit suit) {
        this.number = number;
        this.suit = suit;
    }

    public int getNumber() {
        return number;
    }

    public Suit getSuit() {
        return suit;
    }
}
