package com.snowsdy.fantasyrpg.model.race;

import com.snowsdy.fantasyrpg.model.stats.*;

import java.util.ArrayList;


abstract class Race implements IRace {

    private final String race;
    private final ArrayList<IStat> stats;

    public Race(final String eRace) {
        this.race = eRace;
        this.stats = new ArrayList<>();
        // Add all stats :
        this.stats.add(new Charisma());
        this.stats.add(new Dexterity());
        this.stats.add(new Constitution());
        this.stats.add(new Intelligence());
        this.stats.add(new Strength());
        this.stats.add(new Witness());
    }

    @Override
    public String getName() {
        return this.race;
    }

    @Override
    public void addStat(final IStat stat) {
        this.stats.add(stat);
    }

    @Override
    public void removeAt(final int index) {
        this.stats.remove(index);
    }

    @Override
    public void removeStat(final IStat stat) {
        this.stats.remove(stat);
    }

    public ArrayList<IStat> getStats() {
        return this.stats;
    }

    @Override
    public void setStat(final IStat stat, final int newVal) {
        for (IStat iStat : this.stats) {
            if (iStat.getName().equals(stat.getName())) {
                iStat.setValue((iStat.getValue() + newVal));
            }
        }
    }

    @Override
    public void setBonusStats() {
    }

    @Override
    public void setMalusStats() {
    }

    @Override
    public int getStat(IStat stat) {
        for (IStat iStat : this.stats) {
            if (iStat.getName().equals(stat.getName())) return iStat.getValue();
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Race {\n" +
                " name=" + this.getName() + ",\n" +
                " stats=" + this.stats + '\n' +
                '}';
    }
}
