package com.snowsdy.fantasyrpg.model.classes;

import com.snowsdy.fantasyrpg.model.race.IRace;
import com.snowsdy.fantasyrpg.model.stats.Dexterity;
import com.snowsdy.fantasyrpg.model.stats.Strength;

public class Marauder extends Class{
    public Marauder(IRace race) {
        super("Rôdeur", race);
        setPv(8);
    }

    @Override
    public int getDefense() {
        return (getCharacteristicModifier(getRace().getStat(new Dexterity())) + 5);
    }

    @Override
    public int getRangedAttack() {
        return (getCharacteristicModifier(getRace().getStat(new Dexterity())) + 4);
    }

    @Override
    public int getPhysicalAttack() {
        return (getCharacteristicModifier(getRace().getStat(new Strength())) + 4);
    }
}
