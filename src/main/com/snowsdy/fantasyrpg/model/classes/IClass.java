package com.snowsdy.fantasyrpg.model.classes;

import com.snowsdy.fantasyrpg.model.race.IRace;

public interface IClass {
    String getName();

    IRace getRace();

    int getLifePoint();

    int getMagicalAttack();

    int getPhysicalAttack();

    int getRangedAttack();

    int getDefense();

    int getCharacteristicModifier(final int characLvl);
}
