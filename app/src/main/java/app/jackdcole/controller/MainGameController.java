package app.jackdcole.controller;

public class MainGameController {

    public DealerController dealer;

    public UserController user;

    public MainGameController() {
        dealer = new DealerController();
        user = new UserController();

        boolean gameEnd = false;
        while (!gameEnd) {
            userTurn();

            dealerTurn();
        }
    }

    public void userTurn() {

    }

    public void dealerTurn() {

    }

}
