package com.snowsdy.fantasyrpg.model.race;

import com.snowsdy.fantasyrpg.model.stats.Charisma;
import com.snowsdy.fantasyrpg.model.stats.Intelligence;
import com.snowsdy.fantasyrpg.model.stats.Strength;

public class HalfOrc extends Race {
    public static final int BONUS_STR = 2;
    public static final int MALUS_INT = -2;
    public static final int MALUS_CHARISMA = -2;

    public HalfOrc() {
        super("Demi-Orque");
    }

    @Override
    public void setBonusStats() {
        this.setStat(new Strength(), BONUS_STR);
    }

    @Override
    public void setMalusStats() {
        this.setStat(new Intelligence(), MALUS_INT);
        this.setStat(new Charisma(), MALUS_CHARISMA);
    }
}
