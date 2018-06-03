package com.rsrozhkov.java.xo.model;

public enum Figure {

    X("X"),O("O");

    private final String figure;

    Figure(final String figure) {
        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }
}