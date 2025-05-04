package org.example.OrcFactory;

import org.example.GearFactory.Dolguldur.DolguldurGearFactory;
import org.example.Orc.DolguldurOrcBuilder;
import org.example.Orc.OrcBuilder;

public class DolguldurOrcBuilderFactory implements OrcBuilderFactory {

    @Override
    public OrcBuilder createOrcBuilder() {
        return new DolguldurOrcBuilder().buildGearFactory( new DolguldurGearFactory());
    }
}
