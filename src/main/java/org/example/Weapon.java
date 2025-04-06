package org.example;

public interface OrcGearFactory{
    public void createWeapon();
    public void createArmor();
    public void createBanner();
}
public interface Weapo {
}
public interface Armor{
}
public interface Banner{
}

public class MorderGearFactory implements OrcGearFactory{

}
public class DolguldurGearFactory implements OrcGearFactory{
}
public class GloomyMountsFactory implements OrcGearFactory{

}
public class GreyMountsFactory implements OrcGearFactory{

}