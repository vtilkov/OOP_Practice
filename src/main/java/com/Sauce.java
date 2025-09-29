package com;

//Перечисления острота соуса
enum Spiciness {
    VERY_SPICY("очень острый"),
    SPICY("острый"),
    NOT_SPICY("не острый");

    private final String description;

    private Spiciness(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}

public class Sauce {
    private String name; // условие название
    private Spiciness spiciness; // условие остроту

    // Конструктор требует указать название и остроту
    public Sauce(String name, Spiciness spiciness) {
        this.name = name;
        this.spiciness = spiciness;
    }

    public String getName() {
        return name;
    }

    public Spiciness getSpiciness() {
        return spiciness;
    }

    @Override
    public String toString() {
        return "Соус " + name + ": " + spiciness.getDescription();
    }

    public String toShortString() {
        return name + " (" + spiciness.getDescription() + ")";
    }
}