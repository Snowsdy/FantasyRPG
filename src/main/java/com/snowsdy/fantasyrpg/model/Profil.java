package com.snowsdy.fantasyrpg.model;

public enum Profil implements IProfil{
    WARRIOR("Guerrier"),
    WIZARD("Magicien"),
    PRIEST("Prêtre"),
    THIEF("Voleur"),
    MARAUDER("Rôdeur");
    private String name;

    Profil(String name) {
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
