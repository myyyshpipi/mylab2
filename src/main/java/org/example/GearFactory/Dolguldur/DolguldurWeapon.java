package org.example.GearFactory.Dolguldur;

import org.example.GearFactory.Weapon;
import org.example.GearFactory.WeaponType;

import static org.example.GearFactory.WeaponType.SPEAR;
import static org.example.GearFactory.WeaponType.SWORD;

public class DolguldurWeapon implements Weapon {
    WeaponType weapon;

    public DolguldurWeapon() {
        setWeapon(SPEAR);
    }

    @Override
    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    @Override
    public WeaponType getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        return "DolguldurWeapon{" +
                "weapon=" + weapon +
                '}';
    }
}
