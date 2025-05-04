package org.example.OrcFactory;

import org.example.GearFactory.Mordor.MordorGearFactory;
import org.example.GearFactory.OrcGearFactory;
import org.example.Orc.*;

import static org.example.GearFactory.WeaponType.*;
import static org.example.Orc.OrcRace.*;
import static org.example.Orc.OrcType.*;

public class OrcDirector {
    private OrcBuilder builder;


    public OrcDirector(OrcRace race) {
        setOrcBuilder(race);
    }

    public void setOrcBuilder(OrcRace race) {
        switch (race) {
            case MORDOR_ORC:
                builder = new MordorOrcBuilderFactory().createOrcBuilder();
                break;
            case DOLGULDUR_ORC:
                builder = new DolguldurOrcBuilderFactory().createOrcBuilder();
                break;
            case MISTYMOUNTS_ORC:
                builder = new MistyMountsOrcBuilderFactory().createOrcBuilder();
                break;
            default:
                // to-do добавить эксепшен
                builder = null;
        }
    }


    Orc createBasicOrc() {
        builder.buildType(BASIC)
                .buildName(null)
                .buildWeapon()
                .buildArmor()
                .buildBanner()
                .buildHealth()
                .buildPower()
                .buildAgility()
                .buildIntelligence()
                .addBanner()
                .addHorn();
        return builder.createNewOrc();
    }

    Orc createLeaderOrc() {
        builder.buildType(LEADER)
                .buildName(null)
                .buildWeapon()
                .buildArmor()
                .buildBanner()
                .buildHealth()
                .buildPower()
                .buildAgility()
                .buildIntelligence()
                .addBanner()
                .addHorn();
        return builder.createNewOrc();
    }

    Orc createScourOrc() {
        builder.buildType(SCOUTE)
                .buildName(null)
                .buildWeapon()
                .buildArmor()
                .buildBanner()
                .buildHealth()
                .buildPower()
                .buildAgility()
                .buildIntelligence()
                .addBanner()
                .addHorn();

        return builder.createNewOrc();
    }
}
