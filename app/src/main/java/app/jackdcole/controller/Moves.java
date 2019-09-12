package app.jackdcole.controller;

import app.jackdcole.deck.Deck;

public interface Moves {

    void stand();

    void hit(Deck deck);

    void doubleDown();

    void split();

    void surrender();
}
