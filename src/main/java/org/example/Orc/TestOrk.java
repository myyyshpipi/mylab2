package org.example.Orc;

import org.example.GearFactory.Mordor.MordorGearFactory;
import org.example.GearFactory.OrcGearFactory;

import static org.example.Orc.OrcType.*;

public class TestOrk {
    public static void main(String[] args) {
        //OrcBuilder builder = new MordorOrcBuilder();
        //OrcBuilder builder = new MistyMountsOrcBuilder();
        OrcBuilder builder = new DolguldurOrcBuilder();

        OrcGearFactory gearFactory = new MordorGearFactory();

        Orc orc1 = builder.buildType(BASIC)
                .buildGearFactory(gearFactory)
                .buildName(null)
                .buildWeapon()
                .buildArmor()
                .buildBanner()
                .buildHealth()
                .buildPower()
                .buildAgility()
                .buildIntelligence()
                .addBanner()
                .addHorn()
                .createNewOrc();

        Orc orc2 = builder.buildType(SCOUTE)
                .buildGearFactory(gearFactory)
                .buildName(null)
                .buildWeapon()
                .buildArmor()
                .buildBanner()
                .buildHealth()
                .buildPower()
                .buildAgility()
                .buildIntelligence()
                .addBanner()
                .addHorn()
                .createNewOrc();

        Orc orc3 = builder.buildType(LEADER)
                .buildGearFactory(gearFactory)
                .buildName(null)
                .buildWeapon()
                .buildArmor()
                .buildBanner()
                .buildHealth()
                .buildPower()
                .buildAgility()
                .buildIntelligence()
                .addBanner()
                .addHorn()
                .createNewOrc();

        System.out.println(orc1);
        System.out.println(orc2);
        System.out.println(orc3);

    }
}
