package app.jackdcole.controller;

import app.jackdcole.deck.Deck;
import app.jackdcole.deck.Hand;

public class UserController implements Moves {

    public Hand userHand;

    public UserController() {
        userHand = new Hand();
    }

    public void userLogic(Deck deck) {
        if (userHand.getSize() < 2) {
            userHand.addCard(deck.removeCard());
        } else {
            boolean temp = true;

            if (temp) {
                stand();
            } else if (temp) {
                hit(deck);
            } else if (temp) {
                doubleDown();
            } else if (temp) {
                split();
            } else if (temp) {
                surrender();
            } else {
                // try again
            }
        }
    }

    @Override
    public void stand() {
        // advance turn
    }

    @Override
    public void hit(Deck deck) {
        userHand.addCard(deck.removeCard());
    }

    @Override
    public void doubleDown() {

    }

    @Override
    public void split() {

    }

    @Override
    public void surrender() {
        // end turn
    }

    public Hand getHand() {
        return userHand;
    }
}
