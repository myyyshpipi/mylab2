package org.example.GearFactory.Dolguldur;

import org.example.GearFactory.Armor;
import org.example.GearFactory.ArmorType;

import static org.example.GearFactory.ArmorType.*;

public class DolguldurArmor implements Armor {
    ArmorType armor;

    public DolguldurArmor() {
        armor = CHAINMAIL;
    }

    @Override
    public String toString() {
        return "DolguldurArmor{" +
                "armor=" + armor +
                '}';
    }
}
