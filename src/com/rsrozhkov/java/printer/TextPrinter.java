package com.rsrozhkov.java.printer;

class TextPrinter implements IPrinter{
    private final String text;

    TextPrinter(final String text) {
        this.text = text;
    }

    String getText() {
        return text;
    }

    @Override
    public void printText() {
        System.out.println(text);
    }
}
