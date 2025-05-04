package org.example.OrcFactory;

import org.example.GearFactory.Mordor.MordorGearFactory;
import org.example.Orc.MordorOrcBuilder;
import org.example.Orc.OrcBuilder;

public class MordorOrcBuilderFactory implements OrcBuilderFactory {
    @Override
    public OrcBuilder createOrcBuilder() {
        OrcBuilder orcBuilder;
        orcBuilder = new MordorOrcBuilder();
        return new MordorOrcBuilder().buildGearFactory( new MordorGearFactory() );
    }

}
