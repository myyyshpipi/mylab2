package org.example.GearFactory.Mordor;

import org.example.GearFactory.Armor;
import org.example.GearFactory.Banner;
import org.example.GearFactory.OrcGearFactory;
import org.example.GearFactory.Weapon;

public class MordorGearFactory implements OrcGearFactory {

    @Override
    public Weapon createWeapon() {
        return new MordorWeapon();
    }

    @Override
    public Armor createArmor() {
        return new MordorArmor();
    }

    @Override
    public Banner createBanner() {
        return new MordorBanner();
    }
}

