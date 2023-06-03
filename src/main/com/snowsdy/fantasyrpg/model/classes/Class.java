package com.snowsdy.fantasyrpg.model.classes;

import com.snowsdy.fantasyrpg.model.race.IRace;

abstract class Class implements IClass {
    private final String name;
    private final IRace race;
    private int pv;

    public Class(String name, IRace race) {
        this.name = name;
        this.race = race;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLifePoint() {
        return this.pv;
    }

    @Override
    public int getMagicalAttack() {
        return 0;
    }

    @Override
    public int getPhysicalAttack() {
        return 0;
    }

    @Override
    public int getRangedAttack() {
        return 0;
    }

    @Override
    public int getDefense() {
        return 0;
    }

    @Override
    public int getCharacteristicModifier(int caracLvl) {
        return (Math.round(((float) caracLvl / 2)) - 5);
    }

    @Override
    public IRace getRace() {
        return this.race;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getPv() {
        return pv;
    }

    @Override
    public String toString() {
        return "Class {\n" +
                " name=" + this.getName() + '\n' +
                " PV=" + this.getPv() + '\n' +
                " Race=" + this.getRace();
    }
}
