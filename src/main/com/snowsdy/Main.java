package com.snowsdy;

import com.snowsdy.fantasyrpg.model.classes.*;
import com.snowsdy.fantasyrpg.model.race.*;

public class Main {
    public static void main(String[] args) {
        IClass entity = new Wizard(new HalfOrc());
        System.out.println(entity);
        System.out.println("Défense : " + entity.getDefense());
        System.out.println("CAC : " + entity.getPhysicalAttack());
        System.out.println("Ranged : " + entity.getRangedAttack());
        System.out.println("Magic : " + entity.getMagicalAttack());
    }
}