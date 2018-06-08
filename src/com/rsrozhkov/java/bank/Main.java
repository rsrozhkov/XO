package com.rsrozhkov.java.bank;

public class Main {

    public static void main(String[] args) {
        final Account account = new Account("ABCD_000021", "Roman Rozhkov");
        final Account.Card card1 = account.new Card("7777 7777 7777 7777", "Roman Rozhkov");
        final Account.Card card2 = account.new Card("8888 8888 8888 8888","Sorokina Darya");


        card1.showCardInfo();
        card2.showCardInfo();
        card1.deposit(1000);
        card1.showCardInfo();
        card2.showCardInfo();
        card1.withdraw(500);
        card1.showCardInfo();
        card2.showCardInfo();
        card2.withdraw(250);
        card1.showCardInfo();
        card2.showCardInfo();


    }
}
