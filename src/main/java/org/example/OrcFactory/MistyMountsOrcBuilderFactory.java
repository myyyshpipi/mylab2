package org.example.OrcFactory;

import org.example.GearFactory.MistyMounts.MistyMountsGearFactory;
import org.example.Orc.MistyMountsOrcBuilder;
import org.example.Orc.OrcBuilder;

public class MistyMountsOrcBuilderFactory implements OrcBuilderFactory {
    @Override
    public OrcBuilder createOrcBuilder() {
        return new MistyMountsOrcBuilder().buildGearFactory( new MistyMountsGearFactory());
    }
}