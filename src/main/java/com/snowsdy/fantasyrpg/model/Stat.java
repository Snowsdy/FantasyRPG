package com.snowsdy.fantasyrpg.model;

public enum Stat implements IStat{
    STRENGTH("Force"),
    DEXTERITY("Dextérité"),
    CONSTITUTION("Constitution"),
    WITNESS("Sagesse"),
    CHARISMA("Charisme"),
    INTELLIGENCE("Intelligence");
    private String name;

    private void setName(String name) {
        this.name = name;
    }

    Stat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
