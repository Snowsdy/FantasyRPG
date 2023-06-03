package com.snowsdy.fantasyrpg;


import com.snowsdy.fantasyrpg.model.Character;
import com.snowsdy.fantasyrpg.model.classes.*;
import com.snowsdy.fantasyrpg.model.race.*;
import com.snowsdy.fantasyrpg.model.stats.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class CharacterTest {
    private final Character humanWarrior = new Character(new Warrior(new Human()));

    private final Character elfWizard = new Character(new Wizard(new Elf()));

    private final Character dwarfPriest = new Character(new Priest(new Dwarf()));

    @Test
    void getCharacteristic() {
        for (int numTest = 0; numTest < 100; numTest++) {
            assertTrue(this.humanWarrior.getCharacteristic(new Strength()) >= 3);
            assertTrue(this.humanWarrior.getCharacteristic(new Strength()) <= 18);
            assertTrue(this.humanWarrior.getCharacteristic(new Dexterity()) >= 3);
            assertTrue(this.humanWarrior.getCharacteristic(new Dexterity()) <= 18);
            assertTrue(this.humanWarrior.getCharacteristic(new Constitution()) >= 3);
            assertTrue(this.humanWarrior.getCharacteristic(new Constitution()) <= 18);
            assertTrue(this.humanWarrior.getCharacteristic(new Intelligence()) >= 3);
            assertTrue(this.humanWarrior.getCharacteristic(new Intelligence()) <= 18);
            assertTrue(this.humanWarrior.getCharacteristic(new Witness()) >= 3);
            assertTrue(this.humanWarrior.getCharacteristic(new Witness()) <= 18);
            assertTrue(this.humanWarrior.getCharacteristic(new Charisma()) >= 3);
            assertTrue(this.humanWarrior.getCharacteristic(new Charisma()) <= 18);

            assertTrue(this.elfWizard.getCharacteristic(new Strength()) >= 1);
            assertTrue(this.elfWizard.getCharacteristic(new Strength()) <= 16);
            assertTrue(this.elfWizard.getCharacteristic(new Dexterity()) >= 5);
            assertTrue(this.elfWizard.getCharacteristic(new Dexterity()) <= 20);

            assertTrue(this.dwarfPriest.getCharacteristic(new Constitution()) >= 5);
            assertTrue(this.dwarfPriest.getCharacteristic(new Constitution()) <= 20);
            assertTrue(this.dwarfPriest.getCharacteristic(new Dexterity()) >= 1);
            assertTrue(this.dwarfPriest.getCharacteristic(new Dexterity()) <= 16);
        }
    }

    @Test
    void getCharacteristicModifier() {
        assertEquals(Math.round((float) this.humanWarrior.getCharacteristic(new Strength()) / 2) - 5,
                this.humanWarrior.getCharacteristicModifier(this.humanWarrior.getCharacteristic(new Strength())));
        assertEquals(Math.round((float) this.humanWarrior.getCharacteristic(new Dexterity()) / 2) - 5,
                this.humanWarrior.getCharacteristicModifier(this.humanWarrior.getCharacteristic(new Dexterity())));
        assertEquals(Math.round((float) this.humanWarrior.getCharacteristic(new Constitution()) / 2) - 5,
                this.humanWarrior.getCharacteristicModifier(this.humanWarrior.getCharacteristic(new Constitution())));
        assertEquals(Math.round((float) this.humanWarrior.getCharacteristic(new Intelligence()) / 2) - 5,
                this.humanWarrior.getCharacteristicModifier(this.humanWarrior.getCharacteristic(new Intelligence())));
        assertEquals(Math.round((float) this.humanWarrior.getCharacteristic(new Witness()) / 2) - 5,
                this.humanWarrior.getCharacteristicModifier(this.humanWarrior.getCharacteristic(new Witness())));
        assertEquals(Math.round((float) this.humanWarrior.getCharacteristic(new Charisma()) / 2) - 5,
                this.humanWarrior.getCharacteristicModifier(this.humanWarrior.getCharacteristic(new Charisma())));
    }

    @Test
    void getLifePoint() {
        assertEquals(this.humanWarrior.getClassRace().getLifePoint(), 10);
        assertEquals(this.elfWizard.getClassRace().getLifePoint(), 4);
        assertEquals(this.dwarfPriest.getClassRace().getLifePoint(), 8);
    }

    @Test
    void getMeleeAttack() {
        assertEquals(this.humanWarrior.getCharacteristicModifier(this.humanWarrior.getCharacteristic(new Strength())) + 10,
                this.humanWarrior.getClassRace().getPhysicalAttack());
    }

    @Test
    void getRangedAttack() {
        assertEquals(this.humanWarrior.getCharacteristicModifier(this.humanWarrior.getCharacteristic(new Dexterity())) + 1,
                this.humanWarrior.getClassRace().getRangedAttack());
    }

    @Test
    void getMagicAttack() {
        assertEquals(0,
                this.humanWarrior.getClassRace().getMagicalAttack());
        assertEquals(this.elfWizard.getCharacteristicModifier(this.elfWizard.getCharacteristic(new Intelligence())) + 5,
                this.elfWizard.getClassRace().getMagicalAttack());
        assertEquals(this.dwarfPriest.getCharacteristicModifier(this.dwarfPriest.getCharacteristic(new Witness())) + 10,
                this.dwarfPriest.getClassRace().getMagicalAttack());
    }

    @Test
    void getLevel() {
        assertEquals(1, this.humanWarrior.getLevel());
        assertEquals(1, this.elfWizard.getLevel());
        assertEquals(1, this.dwarfPriest.getLevel());
    }
}