package org.example.GearFactory.Dolguldur;

import org.example.GearFactory.Armor;
import org.example.GearFactory.Banner;
import org.example.GearFactory.OrcGearFactory;
import org.example.GearFactory.Weapon;

public class DolguldurGearFactory implements OrcGearFactory {

    @Override
    public Weapon createWeapon() {
        return new DolguldurWeapon();
    }

    @Override
    public Armor createArmor() {
        return new DolguldurArmor();
    }

    @Override
    public Banner createBanner() {
        return new DolguldurBanner();
    }
}

