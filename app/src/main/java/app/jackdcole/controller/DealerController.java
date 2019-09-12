package app.jackdcole.controller;

import app.jackdcole.deck.Deck;
import app.jackdcole.deck.Hand;

public class DealerController implements Moves {

    public Hand dealerHand;

    public DealerController() {
        dealerHand = new Hand();
    }

    public void dealerLogic(Deck deck) {
        if (dealerHand.getSize() < 2) {
            dealerHand.addCard(deck.removeCard());
        } else {
            if (dealerHand.sumTotal() < 17) {
                hit(deck);
            } else {
                stand();
            }
        }
    }

    @Override
    public void stand() {
        // advance turn
    }

    @Override
    public void hit(Deck deck) {
        dealerHand.addCard(deck.removeCard());
    }

    @Override
    public void doubleDown() {
        // not used for dealer
    }

    @Override
    public void split() {
        // not used for dealer
    }

    @Override
    public void surrender() {
        // not used for dealer
    }

    public Hand getHand() {
        return dealerHand;
    }
}
