package com.snowsdy.fantasyrpg.model;

import com.snowsdy.fantasyrpg.model.classes.IClass;
import com.snowsdy.fantasyrpg.model.stats.IStat;

public class Character implements ICharacter{

    private int level;
    private final IClass raceClass;

    public Character(final IClass rClass) {
        this.raceClass = rClass;
        setLevel(1);
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public IClass getClassRace() {
        return this.raceClass;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getCharacteristic(final IStat characName) {
        return this.raceClass.getRace().getStat(characName);
    }

    @Override
    public int getCharacteristicModifier(final int value) {
        return this.raceClass.getCharacteristicModifier(value);
    }

    @Override
    public String toString() {
        return "Character {\n" +
                " name=" + getClassRace().getName() + ' ' +
                getClassRace().getRace().getName() + '\n' +
                " level=" + getLevel() + '\n' +
                this.getClassRace();
    }
}
