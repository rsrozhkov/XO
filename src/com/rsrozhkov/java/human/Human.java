package com.rsrozhkov.java.human;

class Human {

    private HumanRelations humanRelations;
    final private String name;
    final private int age;

    Human(HumanBuilder humanBuilder) {

        this.humanRelations = humanBuilder.getHumanRelations();
        this.name = humanBuilder.getName();
        this.age = humanBuilder.getAge();
    }



   @Override
    public String toString() {
        return "Name: "+name+"\nAge: "+ age+"\nRelations: "+ humanRelations.getRelations();
   }

    enum HumanRelations {

        DIVORCED("divorced"),ACTIVE_SEARCH("active search"),SINGLE("single"),COMPLEX("complex"),IN_LOVE("in love");

        private final String relations;

        HumanRelations(final String relations) {
            this.relations = relations;
        }

        String getRelations(){
            return relations;
        }
    }

}

class HumanBuilder {
    private Human.HumanRelations humanRelations;
    private String name;
    private int age;

    HumanBuilder humanRelations(final Human.HumanRelations humanRelations) {
        this.humanRelations = humanRelations;
        return this;
    }

    HumanBuilder name(final String name) {
        this.name = name;
        return this;
    }

    HumanBuilder age(final int age) {
        this.age = age;
        return this;
    }

    Human.HumanRelations getHumanRelations() {
        return humanRelations;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    Human build() {
        return new Human(this);
    }

}