package com.snowsdy.fantasyrpg.model.stats;

import java.util.Random;

abstract class Stat implements IStat{
    private String name;
    private int value;

    public Stat(String name) {
        this.name = name;
        this.value = (new Random().nextInt(16) + 3);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Stat {" +
                "\n name='" + name + '\'' + ",\n" +
                " value=" + value + '\n' +
                '}';
    }
}
