package org.example.GearFactory.MistyMounts;

import org.example.GearFactory.Weapon;
import org.example.GearFactory.WeaponType;

import static org.example.GearFactory.WeaponType.AXE;
import static org.example.GearFactory.WeaponType.SWORD;

public class MistyMountsWeapon implements Weapon {
    WeaponType weapon;

    public MistyMountsWeapon() {
        setWeapon(AXE);
    }

    @Override
    public String toString() {
        return "MistyMountsWeapon{" +
                "weapon=" + weapon +
                '}';
    }

    @Override
    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }
}
