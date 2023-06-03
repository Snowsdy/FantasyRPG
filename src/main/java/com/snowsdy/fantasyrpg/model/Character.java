package com.snowsdy.fantasyrpg.model;

import java.util.Objects;

public class Character implements ICharacter {

    private final IRace race;
    private final String name;
    private final IProfil profil;
    private int pv;
    private int level;

    private final Stats stats;

    public Character(final String name, final IProfil profil, final IRace race) {
        this.name = name;
        this.race = race;
        this.profil = profil;
        this.stats = new Stats();
        this.level = 1;
        dispatchStatsByRace(this.race);
        dispatchProfil(this.profil);
    }

    private void dispatchProfil(IProfil profil) {
        switch (profil.getName()) {
            default -> {
            }
            case "WARRIOR" -> this.pv = 10;
            case "WIZARD" -> this.pv = 4;
            case "PRIEST", "MARAUDER" -> this.pv = 8;
            case "THIEF" -> this.pv = 6;
        }
    }

    private void dispatchStatsByRace(IRace race) {
        switch (race.getName()) {
            case "ELF" -> {
                this.stats.setStat(Stat.DEXTERITY, this.stats.getStat(Stat.DEXTERITY) + 2);
                this.stats.setStat(Stat.STRENGTH, this.stats.getStat(Stat.STRENGTH) - 2);
            }
            case "DWARF" -> {
                this.stats.setStat(Stat.CONSTITUTION, this.stats.getStat(Stat.CONSTITUTION) + 2);
                this.stats.setStat(Stat.DEXTERITY, this.stats.getStat(Stat.DEXTERITY) - 2);
            }
            case "HALFORC" -> {
                this.stats.setStat(Stat.STRENGTH, this.stats.getStat(Stat.STRENGTH) + 2);
                this.stats.setStat(Stat.INTELLIGENCE, this.stats.getStat(Stat.INTELLIGENCE) - 2);
                this.stats.setStat(Stat.CHARISMA, this.stats.getStat(Stat.CHARISMA) - 2);
            }
            default -> {
            }
        }
    }

    @Override
    public int getCharacteristic(final String characteristicName) {
        return this.stats.getStat(Stat.valueOf(characteristicName));
    }

    @Override
    public int getCharacteristicModifier(final String characteristicName) {
        return (this.stats.getStat(Stat.valueOf(characteristicName)) / 2) - 5;
    }

    @Override
    public int getLifePoint() {
        return this.pv;
    }

    @Override
    public int getMeleeAttack() {
        return this.getCharacteristicModifier(Stat.STRENGTH.name()) + 1;
    }

    @Override
    public int getRangedAttack() {
        return this.getCharacteristicModifier(Stat.DEXTERITY.name()) + 1;
    }

    @Override
    public int getMagicAttack() {
        if (Objects.equals(this.profil.getName(), "WIZARD")) return (this.getCharacteristicModifier(Stat.INTELLIGENCE.name()) + 1);
        if (Objects.equals(this.profil.getName(), "PRIEST")) return (this.getCharacteristicModifier(Stat.WITNESS.name()) + 1);
        return 0;
    }

    @Override
    public IRace getRace() {
        return this.race;
    }

    @Override
    public IProfil getProfil() {
        return this.profil;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    public void setLevel(int lvl) {
        this.level = lvl;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Character{" +
                "race=" + race +
                ", name='" + name + '\'' +
                ", profil=" + profil +
                ", pv=" + pv +
                ", stats=" + stats.getStats() +
                '}';
    }
}
