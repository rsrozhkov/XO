package com.rsrozhkov.java.xo.model;

public class Player {

    private String name;
    private final String figure;

    public Player(final String name, String figure) {
        this.name = name;
        this.figure = figure;
    }

    public String getName() {
        return name;
    }

    public String getFigure() {
        return figure;
    }
}