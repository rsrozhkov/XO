package com.rsrozhkov.java.human;

public class Main {

    public static void main(String[] args) {

        Human humanVasya = new HumanBuilder()
                .name("Vasily")
                .age(31)
                .humanRelations(Human.HumanRelations.DIVORCED)
                .build();

        System.out.println(humanVasya.toString());
    }
}