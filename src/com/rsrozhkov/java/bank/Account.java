package com.rsrozhkov.java.bank;

class Account {
    private double amount;
    private final String number;
    private final String owner;


    Account(final String number, final String owner) {
        this.amount = 0;
        this.number = number;
        this.owner = owner;
    }

    private synchronized double withdraw(final double amountToWithdraw) {
        double delta = amount - amountToWithdraw;
        if (delta>=0) {
            this.amount = delta;
            return amountToWithdraw;
        }
        else if (amount>0) {
            this.amount = 0;
            return amount;
        }
        else return 0;
    }

    private synchronized double deposit(final double amountToDeposit) {
        if (amountToDeposit<=0) return 0;
        amount = amount+amountToDeposit;
        return amountToDeposit;
    }

    class Card {
        final private String number;
        final private String owner;

        public Card(final String number, final String owner) {
            this.number = number;
            this.owner = owner;
        }

        public String getNumber() {
            return number;
        }

        public String getOwner() {
            return owner;
        }

        public String getAccountNumber() {
            return Account.this.number;
        }

        public String getAccountOwner() {
            return  Account.this.owner;
        }

        public double getAmount() {
            return Account.this.amount;
        }

        public double withdraw(final double amountToWithdraw) {
            return Account.this.withdraw(amountToWithdraw);
        }

        public double deposit(final double amountToDeposit) {
            return Account.this.deposit(amountToDeposit);
        }

        public void showCardInfo() {
            System.out.println("Account: " + this.getAccountNumber() + ", Owner: " + this.getAccountOwner()
                    + "\nCard: " + this.getNumber() + ", Owner: " + this.getOwner() + ", amount: " + this.getAmount());
            System.out.println();
        }

    }
}
