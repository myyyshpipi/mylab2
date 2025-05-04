package org.example.GearFactory.MistyMounts;

import org.example.GearFactory.Armor;
import org.example.GearFactory.ArmorType;

import static org.example.GearFactory.ArmorType.*;

public class MistyMountsArmor implements Armor {
    ArmorType armor;

    public MistyMountsArmor() {
        armor = LEATHER_ARMOR;
    }

    @Override
    public String toString() {
        return "MistyMountsArmor{" +
                "armor=" + armor +
                '}';
    }
}
