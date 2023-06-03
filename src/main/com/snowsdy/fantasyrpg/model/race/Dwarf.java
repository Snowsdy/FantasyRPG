package com.snowsdy.fantasyrpg.model.race;

import com.snowsdy.fantasyrpg.model.stats.Constitution;
import com.snowsdy.fantasyrpg.model.stats.Dexterity;

public class Dwarf extends Race {
    private static final int BONUS_CONS = 2;
    private static final int MALUS_DEX = -2;

    public Dwarf() {
        super("Nain");
    }

    @Override
    public void setBonusStats() {
        this.setStat(new Constitution(), BONUS_CONS);
    }

    @Override
    public void setMalusStats() {
        this.setStat(new Dexterity(), MALUS_DEX);
    }
}
