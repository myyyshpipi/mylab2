package org.example;
// abstract builder
abstract class OrcBuilder {
    protected Orc orc;
    public Orc getOrc(){ return orc;}
    public void createNewOrc(){orc=new Orc();}
    public abstract void buildName();
    public abstract void buildWeapon();
    public abstract void buildArmor();
    public abstract void buildBanner();
    public abstract void buildPower();
    public abstract void buildAudacity();
    public abstract void buildIntelligence();
    public abstract void buildHealth();
}
//conrete builder
class MorderOrcBuilder extends OrcBuilder {
    public void buildName(){
        orc.setName("Morder");
    }
    public void buildWeapon(String weapon){
        orc.setWeapon(weapon);
    }
    public void buildArmor(String armor){
        orc.setArmor(armor);
    }
    public void buildBanner(String banner){
        orc.setBanner(banner);
    }
    public void buildPower(){
        orc.setPower(50*1.30);
    }
    public void buildAudacity(){
        orc.setAudacity(1);
    }
    public void buildIntelligence(){
        orc.setIntelligence(25);
    }
    public void buildHealth(){
        orc.setHealth(125);
    }
}
class DolguldurOrcBuilder extends OrcBuilder {
    public void buildName(){
       orc.setName("Dolguldur");
    }
    public void buildWeapon(String weapon){
        orc.setWeapon(weapon);
    }
    public void buildArmor(String armor){
        orc.setArmor(armor);
    }
    public void buildBanner(String banner){
       orc.setBanner(banner);
    }
    public void buildPower(){
        orc.setPower(50);
    }
    public void buildAudacity(){
        orc.setAudacity(50);
    }
    public void buildIntelligence(){
        orc.setIntelligence(25);
    }
    public void buildHealth(){
        orc.setHealth(125);
    }
}
class GloomyMountsOrcBuilder extends OrcBuilder {
    public void buildName(){
        orc.setName("GloomyMounts");
    }
    public void buildWeapon(String weapon){
        orc.setWeapon(weapon);
    }
    public void buildArmor(String armor){
        orc.setArmor(armor);
    }
    public void buildBanner(String banner){
        orc.setBanner(banner);
    }
    public void buildPower(){
        orc.setPower(50);
    }
    public void buildAudacity(){
        orc.setAudacity(50*1.3);
    }
    public void buildIntelligence(){
        orc.setIntelligence(1);
    }
    public void buildHealth(){
        orc.setHealth(125);
    }
}
class GreyMountsOrcBuilder extends OrcBuilder {
    public void buildName(){
        orc.setName("Dolguldur");
    }
    public void buildWeapon(String weapon){
        orc.setWeapon(weapon);
    }
    public void buildArmor(String armor){
        orc.setArmor(armor);
    }
    public void buildBanner(String banner){
        orc.setBanner(banner);
    }
    public void buildPower(){
        orc.setPower(50);
    }
    public void buildAudacity(){
        orc.setAudacity(50);
    }
    public void buildIntelligence(){
        orc.setIntelligence(25*1.3);
    }
    public void buildHealth(){
        orc.setHealth(1);
    }
}