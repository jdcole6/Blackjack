package app.jackdcole.controller;

import app.jackdcole.deck.Deck;

public class MainGameController {

    public DealerController dealer;

    public UserController user;

    public Deck deck;

    public MainGameController() {
        deck = new Deck();
        dealer = new DealerController();
        user = new UserController();

        boolean gameEnd = false;
        while (!gameEnd) {
            userTurn();

            dealerTurn();
        }
    }

    public void userTurn() {
        user.userLogic(deck);
    }

    public void dealerTurn() {
        dealer.dealerLogic(deck);
    }

}
