package com.snowsdy.fantasyrpg.model.stats;

import java.util.ArrayList;
import java.util.List;

public class Stats {
    private final ArrayList<IStat> stats;

    public Stats(final IStat... stats) {
        this.stats = new ArrayList<>();
        this.stats.addAll(List.of(stats));
    }

    public IStat getStat(final int index) {
        return this.stats.get(index);
    }

}
