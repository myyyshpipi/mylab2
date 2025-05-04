package org.example.Orc;


import com.github.javafaker.Faker;
import org.example.GearFactory.*;

import static org.example.GearFactory.WeaponType.*;
import static org.example.Orc.OrcType.*;
import static org.example.Orc.OrcRace.*;

/**
 * "Concrete builder"
 */
public class MordorOrcBuilder extends OrcBuilder {
    private OrcRace race;
    private OrcType type;
    private String name;
    private Weapon weapon;
    private Armor armor;
    private Banner banner;
    private int power;
    private int agility;
    private int intelligence;
    private int health;
    private boolean hasHorn = false;
    private boolean hasBanner = false;
    private OrcGearFactory gearFactory;

    public MordorOrcBuilder() {
        super();
        this.race = MORDOR_ORC;
    }

    public MordorOrcBuilder(OrcGearFactory gearFactory) {
        super();
        this.race = MORDOR_ORC;
        this.gearFactory = gearFactory;
    }

    @Override
    public OrcBuilder buildType(OrcType type) {
        this.type = type;
        //System.out.println(this.getClass() + " type: " + type);
        return this;
    }

    @Override
    public OrcBuilder buildName(String name) {
        if (name == null || name.isEmpty()) {
            this.name = new Faker().lordOfTheRings().character();
            //this.name = faker.pokemon().name();
        } else {
            this.name = name;
        }
        return this;
    }

    @Override
    public OrcBuilder buildWeapon() {
        this.weapon = gearFactory.createWeapon();
        if (this.type == SCOUTE) {
            this.weapon.setWeapon(BOW);
        }
        return this;
    }

    @Override
    public OrcBuilder buildArmor() {
        this.armor = gearFactory.createArmor();
        return this;
    }

    @Override
    public OrcBuilder buildBanner() {
        this.banner = this.gearFactory.createBanner();
        return this;
    }

    @Override
    public OrcBuilder buildPower() {
        int min = 1;
        int max = 100;
        int power = min + (int) (Math.random() * (max - min));
        this.power = (int) (1.30 * power);
        return this;
    }

    @Override
    public OrcBuilder buildAgility() {
        int min = 1;
        int max = 100;
        int audacity = min + (int) (Math.random() * (max - min));
        this.agility = (int) (0.30 * audacity);
        return this;
    }

    @Override
    public OrcBuilder buildIntelligence() {
        int min = 1;
        int max = 50;
        this.intelligence = min + (int) (Math.random() * (max - min));
        return this;
    }

    @Override
    public OrcBuilder buildHealth() {
        int min = 50;
        int max = 200;
        this.health = min + (int) (Math.random() * (max - min));
        return this;
    }

    @Override
    public OrcBuilder addHorn() {
        if (this.type == LEADER) {
            hasHorn = true;
        }
        return this;
    }

    @Override
    public OrcBuilder addBanner() {
        if (this.type == LEADER) {
            hasBanner = true;
        }
        return this;
    }

    @Override
    public OrcBuilder buildGearFactory(OrcGearFactory gearFactory) {
        this.gearFactory = gearFactory;
        return this;
    }

    @Override
    public Orc createNewOrc() {
        return new Orc(race, type, name, weapon, armor, banner,
                power, agility, intelligence, health, hasHorn, hasBanner);
    }
}
