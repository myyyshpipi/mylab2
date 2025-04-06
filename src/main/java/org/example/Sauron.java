package org.example;
//director
public class Sauron {
    private OrcBuilder orcBuilder;
    public void setOrcBuilder(OrcBuilder ob) {orcBuilder = ob;}
    public Orc getOrc() {return orcBuilder.getOrc();}
    public void createBasicOrc(){
        orcBuilder.createNewOrc();
        orcBuilder.buildName();
        orcBuilder.buildWeapon();
        orcBuilder.buildArmor();
        orcBuilder.buildBanner();
        orcBuilder.buildPower();
        orcBuilder.buildAudacity();
        orcBuilder.buildIntelligence();
        orcBuilder.buildHealth();
    }
    public void createLeaderOrc(){
        orcBuilder.createNewOrc();
        orcBuilder.buildName();
        orcBuilder.buildWeapon();
        orcBuilder.buildArmor();
        orcBuilder.buildBanner();
        orcBuilder.buildPower();
        orcBuilder.buildAudacity();
        orcBuilder.buildIntelligence();
        orcBuilder.buildHealth();
    }
    public void createScoutOrc(){
        orcBuilder.createNewOrc();
        orcBuilder.buildName();
        orcBuilder.buildWeapon();
        orcBuilder.buildArmor();
        orcBuilder.buildBanner();
        orcBuilder.buildPower();
        orcBuilder.buildAudacity();
        orcBuilder.buildIntelligence();
        orcBuilder.buildHealth();
    }
}
