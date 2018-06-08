package com.rsrozhkov.java.printer;

public class Main {

    public static void main(String[] args) {

        TextPrinter textPrinter = new TextPrinter("Hello Printer!!!");
        textPrinter.printText();

        final IPrinter advPrinter = new TextPrinter("Hello IPrinter!!!") {

            @Override
            public void printText() {
                System.out.println("*******");
                super.printText();
            }
        };

        advPrinter.printText();
    }
}
