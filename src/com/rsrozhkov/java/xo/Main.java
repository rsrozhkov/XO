package com.rsrozhkov.java.xo;

import com.rsrozhkov.java.xo.controller.GameController;
import com.rsrozhkov.java.xo.model.Board;
import com.rsrozhkov.java.xo.model.Figure;
import com.rsrozhkov.java.xo.view.AdvConsoleView;
import com.rsrozhkov.java.xo.view.ConsoleView;

public class Main {

    public static void main(String[] args) {
        final Board board = new Board();
        board.setFigure(0,0,Figure.X);
        board.setFigure(0,1,Figure.X);
        board.setFigure(0,2,Figure.X);
        board.setFigure(1,0,Figure.X);
        board.setFigure(1,1,Figure.O);
        board.setFigure(1,2,Figure.X);
        board.setFigure(2,0,Figure.X);
        board.setFigure(2,1,Figure.O);
        board.setFigure(2,2,Figure.X);


        final GameController gameController = new GameController(null,null,board);
        final AdvConsoleView advConsoleView = new AdvConsoleView(gameController);
        final ConsoleView consoleView = new ConsoleView(gameController);
        consoleView.showBoard();
        //startGame(consoleView);
    }

    private static void startGame(final ConsoleView advConsoleView) {
        advConsoleView.showGameName();
    }
}