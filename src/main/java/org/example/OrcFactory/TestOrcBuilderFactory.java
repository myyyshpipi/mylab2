package org.example.OrcFactory;

import org.example.GearFactory.Dolguldur.DolguldurGearFactory;
import org.example.GearFactory.OrcGearFactory;
import org.example.Orc.*;
import static org.example.Orc.OrcType.*;

public class TestOrcBuilderFactory {
    public static void main(String[] args) {

        //OrcDirector director1 = new OrcDirector(OrcRace.MORDOR_ORC);
        //OrcDirector director1 = new OrcDirector(OrcRace.MISTYMOUNTS_ORC);
        OrcDirector director1 = new OrcDirector(OrcRace.DOLGULDUR_ORC);

        Orc orc1 = director1.createBasicOrc();
        Orc orc2 = director1.createScourOrc();
        Orc orc3 = director1.createLeaderOrc();

        System.out.println(orc1);
        System.out.println(orc2);
        System.out.println(orc3);
    }

}
