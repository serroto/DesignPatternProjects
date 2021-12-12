package lab6_AbstractFactoryPattern.cherrymx;

import lab6_AbstractFactoryPattern.PressureCN;
import lab6_AbstractFactoryPattern.Switch;
import lab6_AbstractFactoryPattern.SwitchComponentFactory;

public class CherryMXTactileSwitch extends Switch {
    SwitchComponentFactory factory;
    public CherryMXTactileSwitch(SwitchComponentFactory factory){
        this.factory=factory;
    }
    @Override
    public void gatherParts() {
        name= "CherryMX";
        keyCap = factory.createKeyCap();
        stem = factory.createStem();
        coilSpring = factory.createCoilSpring(PressureCN.Medium);
    }
}
