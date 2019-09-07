package app.jackdcole.deck;

public class Card {

    public int number;

    public String suit;

    public Card() {
        // default constructor
    }

    public Card(int number, String suit) {
        this.number = number;
        this.suit = suit;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }
}
