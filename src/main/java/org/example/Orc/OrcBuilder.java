package org.example.Orc;

import org.example.GearFactory.*;
import org.example.GearFactory.OrcGearFactory;

/** "Abstract builder" */
public abstract class OrcBuilder {
    public abstract OrcBuilder buildType(OrcType type);
    public abstract OrcBuilder buildName(String name);
    public abstract OrcBuilder buildWeapon();
    public abstract OrcBuilder buildArmor();
    public abstract OrcBuilder buildBanner();
    public abstract OrcBuilder buildPower();
    public abstract OrcBuilder buildAgility();
    public abstract OrcBuilder buildIntelligence();
    public abstract OrcBuilder buildHealth();
    public abstract OrcBuilder addHorn();
    public abstract OrcBuilder addBanner();
    public abstract OrcBuilder buildGearFactory(OrcGearFactory gearFactory);
    public abstract Orc createNewOrc();
}

