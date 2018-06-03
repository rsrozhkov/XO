package com.rsrozhkov.java.xo.controller;

import com.rsrozhkov.java.xo.helpers.CoordinateHelper;
import com.rsrozhkov.java.xo.model.Board;
import com.rsrozhkov.java.xo.model.Player;

public class GameController {

    private final String gameName;

    private final Board board;

    private final Player[] players;

    public GameController(final String gameName, final Player[] players, final Board board) {
        this.players = players;
        this.board=board;
        if (gameName == null || gameName.isEmpty()) {
            this.gameName = "XO";
        } else {
            this.gameName = gameName;
        }
    }

    public String getGameName() {
        return gameName;
    }

    public Player currentPlayer() {
        return null;
    }

    public Board getBoard() {
        return board;
    }

    private boolean move(final int x, final int y) {
        if (!CoordinateHelper.checkCoordinate(x) || !CoordinateHelper.checkCoordinate(y)) {
            return false;
        }

        //TODO logic to move

        return true;
    }

    public Player[] getPlayers() {
        return players;
    }

}