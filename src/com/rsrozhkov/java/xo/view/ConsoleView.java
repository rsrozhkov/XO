package com.rsrozhkov.java.xo.view;

import com.rsrozhkov.java.xo.controller.GameController;
import com.rsrozhkov.java.xo.model.Player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleView {

    private final String LINE_CHARACTER = "~";
    private final int BOARD_SIZE = 3;
    private final int LINE_SIZE = 3;

    protected final GameController gameController;

    public ConsoleView(final GameController gameController) {
        this.gameController = gameController;
    }

    public void start() {
        System.out.println("Please input coordinates: ");
        int x = getCoordinate("X");
        int y = getCoordinate("Y");
    }

    public void showGameName() {
        System.out.println(gameController.getGameName());
    }

    public void showPlayersName() {
        System.out.println(gameController.getPlayers());
    }

    public void showBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            showBoardLine(i);
            showLine(LINE_SIZE);
        }
    }

    public void showPlayers() {
        for (Player player:gameController.getPlayers()) {
            System.out.println(player.getName());
        }
    }

    protected void showLine(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(LINE_CHARACTER);
        }
        System.out.println();
    }

    private void showBoardLine(int row) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print(gameController.getBoard().getFigure(row,i));
        }
        System.out.println();
    }

    private int getCoordinate(final String coordinateName) {
        int counter = 0;
        do {
            System.out.print(String.format("Input the coordinate %s", coordinateName));
            try {
                final Scanner in = new Scanner(System.in);
                return in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Coordinate is incorrect");
                counter++;
            }
        } while (counter < 3);
        return -1;
    }
}