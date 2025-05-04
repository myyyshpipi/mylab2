package org.example.GearFactory.MistyMounts;

import org.example.GearFactory.Armor;
import org.example.GearFactory.Banner;
import org.example.GearFactory.OrcGearFactory;
import org.example.GearFactory.Weapon;

public class MistyMountsGearFactory implements OrcGearFactory {

    @Override
    public Weapon createWeapon() {
        return new MistyMountsWeapon();
    }

    @Override
    public Armor createArmor() {
        return new MistyMountsArmor();
    }

    @Override
    public Banner createBanner() {
        return new MistyMountsBanner();
    }
}

