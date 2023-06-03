package com.snowsdy.fantasyrpg.model.race;

import com.snowsdy.fantasyrpg.model.stats.Dexterity;
import com.snowsdy.fantasyrpg.model.stats.Strength;

public class Elf extends Race {
    private static final int BONUS_DEX = 2;
    private static final int MALUS_STR = -2;

    public Elf() {
        super("Elfe");
        setBonusStats();
        setMalusStats();
    }

    @Override
    public void setBonusStats() {
        this.setStat(new Dexterity(), BONUS_DEX);
    }

    @Override
    public void setMalusStats() {
        this.setStat(new Strength(), MALUS_STR);
    }
}
