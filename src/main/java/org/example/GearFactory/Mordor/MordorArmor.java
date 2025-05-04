package org.example.GearFactory.Mordor;

import org.example.GearFactory.Armor;
import org.example.GearFactory.ArmorType;

import static org.example.GearFactory.ArmorType.*;

public class MordorArmor implements Armor {
    ArmorType armor;

    public MordorArmor() {
        armor = STEEL_ARMOR;
    }

    @Override
    public String toString() {
        return "MorderArmor{" +
                "armor=" + armor +
                '}';
    }
}
