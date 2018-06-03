package com.rsrozhkov.java.xo.view;

import com.rsrozhkov.java.xo.controller.GameController;

public class MensConsoleView extends ConsoleView {

    public MensConsoleView(final GameController gameController) {
        super(gameController);
    }

    @Override
    public void showGameName() {
        showLine(3);
        System.out.println(gameController.getGameName());
    }
}