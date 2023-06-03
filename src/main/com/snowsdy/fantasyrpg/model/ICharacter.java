package com.snowsdy.fantasyrpg.model;

import com.snowsdy.fantasyrpg.model.classes.IClass;
import com.snowsdy.fantasyrpg.model.stats.IStat;

public interface ICharacter {
    IClass getClassRace();

    int getLevel();

    int getCharacteristic(final IStat characName);

    int getCharacteristicModifier(final int value);
}
