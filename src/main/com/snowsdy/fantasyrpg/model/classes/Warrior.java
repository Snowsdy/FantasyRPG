package com.snowsdy.fantasyrpg.model.classes;

import com.snowsdy.fantasyrpg.model.race.IRace;
import com.snowsdy.fantasyrpg.model.stats.Dexterity;
import com.snowsdy.fantasyrpg.model.stats.Strength;

public class Warrior extends Class {
    public Warrior(IRace race) {
        super("Guerrier", race);
        setPv(10);
    }

    @Override
    public int getPhysicalAttack() {
        return (getCharacteristicModifier(getRace().getStat(new Strength())) + 10);
    }

    @Override
    public int getDefense() {
        return (getCharacteristicModifier(getRace().getStat(new Dexterity())) + 10);
    }

    @Override
    public int getRangedAttack() {
        return (getCharacteristicModifier(getRace().getStat(new Dexterity())) + 1);
    }
}
