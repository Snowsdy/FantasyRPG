package com.snowsdy.fantasyrpg.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Stats {
    private final Map<Stat, Integer> stats;

    public Stats() {
        this.stats = new HashMap<>();
        for (int i = 0; i < Stat.values().length; i++) {
            this.stats.put(Stat.values()[i], (new Random().nextInt(16) + 3));
        }
    }

    public Map<Stat, Integer> getStats() {
        return this.stats;
    }

    public void setStat(final Stat stat, final int level) {
        this.stats.put(stat, level);
    }

    public int getStat(Stat stat) {
        return this.stats.get(stat);
    }
}
