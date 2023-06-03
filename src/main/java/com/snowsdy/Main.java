package com.snowsdy;

import com.snowsdy.fantasyrpg.model.Character;
import com.snowsdy.fantasyrpg.model.Profil;
import com.snowsdy.fantasyrpg.model.Race;

public class Main {
    public static void main(String[] args) {
        Character humanWarrior = new Character("Humain guerrier", Profil.WARRIOR, Race.HUMAN);
        System.out.println(humanWarrior);
    }
}