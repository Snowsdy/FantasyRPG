package com.snowsdy.fantasyrpg;

import com.snowsdy.fantasyrpg.model.Character;
import com.snowsdy.fantasyrpg.model.Profil;
import com.snowsdy.fantasyrpg.model.Race;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CharacterTest {
    private final Character humanWarrior = new Character("Humain guerrier", Profil.WARRIOR, Race.HUMAN);

    private final Character elfWizard = new Character("Elfe magicien", Profil.WIZARD, Race.ELF);

    private final Character dwarfPriest = new Character("Prêtre nain", Profil.PRIEST, Race.DWARF);

    @Test
    void getCharacteristic() {
        for (int numTest = 0; numTest < 100; numTest++) {
            assertTrue(this.humanWarrior.getCharacteristic("STRENGTH") >= 3);
            assertTrue(this.humanWarrior.getCharacteristic("STRENGTH") <= 18);
            assertTrue(this.humanWarrior.getCharacteristic("DEXTERITY") >= 3);
            assertTrue(this.humanWarrior.getCharacteristic("DEXTERITY") <= 18);
            assertTrue(this.humanWarrior.getCharacteristic("CONSTITUTION") >= 3);
            assertTrue(this.humanWarrior.getCharacteristic("CONSTITUTION") <= 18);
            assertTrue(this.humanWarrior.getCharacteristic("INTELLIGENCE") >= 3);
            assertTrue(this.humanWarrior.getCharacteristic("INTELLIGENCE") <= 18);
            assertTrue(this.humanWarrior.getCharacteristic("WITNESS") >= 3);
            assertTrue(this.humanWarrior.getCharacteristic("WITNESS") <= 18);
            assertTrue(this.humanWarrior.getCharacteristic("CHARISMA") >= 3);
            assertTrue(this.humanWarrior.getCharacteristic("CHARISMA") <= 18);

            assertTrue(this.elfWizard.getCharacteristic("STRENGTH") >= 1);
            assertTrue(this.elfWizard.getCharacteristic("STRENGTH") <= 16);
            assertTrue(this.elfWizard.getCharacteristic("DEXTERITY") >= 5);
            assertTrue(this.elfWizard.getCharacteristic("DEXTERITY") <= 20);

            assertTrue(this.dwarfPriest.getCharacteristic("CONSTITUTION") >= 5);
            assertTrue(this.dwarfPriest.getCharacteristic("CONSTITUTION") <= 20);
            assertTrue(this.dwarfPriest.getCharacteristic("DEXTERITY") >= 1);
            assertTrue(this.dwarfPriest.getCharacteristic("DEXTERITY") <= 16);
        }
    }

    @Test
    void getCharacteristicModifier() {
        assertEquals(this.humanWarrior.getCharacteristic("STRENGTH") / 2 - 5,
                this.humanWarrior.getCharacteristicModifier("STRENGTH"));
        assertEquals(this.humanWarrior.getCharacteristic("DEXTERITY") / 2 - 5,
                this.humanWarrior.getCharacteristicModifier("DEXTERITY"));
        assertEquals(this.humanWarrior.getCharacteristic("CONSTITUTION") / 2 - 5,
                this.humanWarrior.getCharacteristicModifier("CONSTITUTION"));
        assertEquals(this.humanWarrior.getCharacteristic("INTELLIGENCE") / 2 - 5,
                this.humanWarrior.getCharacteristicModifier("INTELLIGENCE"));
        assertEquals(this.humanWarrior.getCharacteristic("WITNESS") / 2 - 5,
                this.humanWarrior.getCharacteristicModifier("WITNESS"));
        assertEquals(this.humanWarrior.getCharacteristic("CHARISMA") / 2 - 5,
                this.humanWarrior.getCharacteristicModifier("CHARISMA"));
    }

    @Test
    void getLifePoint() {
        assertEquals(this.humanWarrior.getLifePoint(), 10);
        assertEquals(this.elfWizard.getLifePoint(), 4);
        assertEquals(this.dwarfPriest.getLifePoint(), 8);
    }

    @Test
    void getMeleeAttack() {
        assertEquals(this.humanWarrior.getCharacteristicModifier("STRENGTH") + 1,
                this.humanWarrior.getMeleeAttack());
    }

    @Test
    void getRangedAttack() {
        assertEquals(this.humanWarrior.getCharacteristicModifier("DEXTERITY") + 1,
                this.humanWarrior.getRangedAttack());
    }

    @Test
    void getMagicAttack() {
        assertEquals(0,
                this.humanWarrior.getMagicAttack());
        assertEquals(this.elfWizard.getCharacteristicModifier("INTELLIGENCE") + 1,
                this.elfWizard.getMagicAttack());
        assertEquals(this.dwarfPriest.getCharacteristicModifier("WITNESS") + 1,
                this.dwarfPriest.getMagicAttack());
    }

    @Test
    void getLevel() {
        assertEquals(1, this.humanWarrior.getLevel());
        assertEquals(1, this.elfWizard.getLevel());
        assertEquals(1, this.dwarfPriest.getLevel());
    }
}