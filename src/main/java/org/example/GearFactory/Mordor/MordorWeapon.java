package org.example.GearFactory.Mordor;

import org.example.GearFactory.Weapon;
import org.example.GearFactory.WeaponType;

import static org.example.GearFactory.WeaponType.*;

public class MordorWeapon implements Weapon {
    WeaponType weapon;

    public MordorWeapon() {
        setWeapon(SWORD);
    }

    @Override
    public WeaponType getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        return "MorderWeapon{" +
                "weapon=" + weapon +
                '}';
    }

    @Override
    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }
}
