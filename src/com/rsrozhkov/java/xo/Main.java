package com.rsrozhkov.java.xo;

import com.rsrozhkov.java.xo.controller.GameController;
import com.rsrozhkov.java.xo.view.AdvConsoleView;
import com.rsrozhkov.java.xo.view.ConsoleView;

public class Main {

    public static void main(String[] args) {
        final GameController gameController = new GameController();
        final AdvConsoleView advConsoleView = new AdvConsoleView(gameController);
        final ConsoleView consoleView = new ConsoleView(gameController);
        startGame(advConsoleView);
    }

    private static void startGame(final ConsoleView advConsoleView) {
        advConsoleView.showGameName();
    }
}