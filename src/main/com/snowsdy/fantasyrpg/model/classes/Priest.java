package com.snowsdy.fantasyrpg.model.classes;

import com.snowsdy.fantasyrpg.model.race.IRace;
import com.snowsdy.fantasyrpg.model.stats.Dexterity;
import com.snowsdy.fantasyrpg.model.stats.Witness;

public class Priest extends Class {
    public Priest(IRace race) {
        super("Prêtre", race);
        setPv(8);
    }

    @Override
    public int getDefense() {
        return getCharacteristicModifier(getRace().getStat(new Dexterity()));
    }

    @Override
    public int getMagicalAttack() {
        return (getCharacteristicModifier(getRace().getStat(new Witness())) + 10);
    }
}
