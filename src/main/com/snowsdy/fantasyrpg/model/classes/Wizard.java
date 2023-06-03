package com.snowsdy.fantasyrpg.model.classes;

import com.snowsdy.fantasyrpg.model.race.IRace;
import com.snowsdy.fantasyrpg.model.stats.Dexterity;
import com.snowsdy.fantasyrpg.model.stats.Intelligence;

public class Wizard extends Class {
    public Wizard(IRace race) {
        super("Magicien", race);
        setPv(4);
    }

    @Override
    public int getDefense() {
        return getCharacteristicModifier(getRace().getStat(new Dexterity()));
    }

    @Override
    public int getMagicalAttack() {
        return (getCharacteristicModifier(getRace().getStat(new Intelligence())) + 5);
    }
}
