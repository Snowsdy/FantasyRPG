package com.snowsdy.fantasyrpg.model.classes;

import com.snowsdy.fantasyrpg.model.race.IRace;
import com.snowsdy.fantasyrpg.model.stats.Dexterity;
import com.snowsdy.fantasyrpg.model.stats.Strength;

public class Thief extends Class{
    public Thief(IRace race) {
        super("Voleur", race);
        setPv(6);
    }

    @Override
    public int getDefense() {
        return (getCharacteristicModifier(getRace().getStat(new Dexterity())) + 2);
    }

    @Override
    public int getRangedAttack() {
        return (getCharacteristicModifier(getRace().getStat(new Dexterity())) + 10);
    }

    @Override
    public int getPhysicalAttack() {
        return (getCharacteristicModifier(getRace().getStat(new Strength())) + 1);
    }
}
