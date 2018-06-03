package com.rsrozhkov.java.xo.view;

import com.rsrozhkov.java.xo.controller.GameController;

public class AdvConsoleView extends ConsoleView {

    public AdvConsoleView(final GameController gameController) {
        super(gameController);
    }

    @Override
    public void showGameName() {
        showLine(3);
        System.out.println(gameController.getGameName());
    }
}