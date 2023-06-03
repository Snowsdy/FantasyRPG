package com.snowsdy.fantasyrpg.model;

public enum Race implements IRace{
    HUMAN("Humain"),
    ELF("Elfe"),
    DWARF("Nain"),
    HALFORC("Demi-Orc"),
    HALFELF("Demi-Elfe");

    private String name;

    Race(final String name) {
        this.name = name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name();
    }
}
