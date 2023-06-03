package com.snowsdy.fantasyrpg.model.race;

import com.snowsdy.fantasyrpg.model.stats.IStat;

public interface IRace {
    String getName();

    void setBonusStats();

    void setMalusStats();

    void addStat(final IStat stat);

    void removeStat(final IStat stat);

    void removeAt(final int index);

    void setStat(final IStat stat, final int newVal);

    int getStat(final IStat stat);
}
