package app.jackdcole.deck;

import java.util.ArrayList;

public class Hand extends Card {

    public ArrayList<Card> hand;

    public Hand() {
        hand = new ArrayList<Card>();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public void clearHand() {
        hand.clear();
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int getSize() {
        return hand.size();
    }

    public int sumTotal() {
        int sum = 0;
        for (int i = 0; i < hand.size(); i++) {
            sum += hand.get(i).getNumber();
        }
        return sum;
    }
}
