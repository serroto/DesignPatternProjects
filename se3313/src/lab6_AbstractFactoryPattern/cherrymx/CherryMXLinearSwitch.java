package lab6_AbstractFactoryPattern.cherrymx;

import lab6_AbstractFactoryPattern.PressureCN;
import lab6_AbstractFactoryPattern.Switch;
import lab6_AbstractFactoryPattern.SwitchComponentFactory;

public class CherryMXLinearSwitch extends Switch {
    SwitchComponentFactory factory;
    public CherryMXLinearSwitch(SwitchComponentFactory factory){
        this.factory=factory;
    }
    @Override
    public void gatherParts() {
        name= "CherryMX";
        keyCap = factory.createKeyCap();
        stem = factory.createStem();
        coilSpring = factory.createCoilSpring(PressureCN.Light);
    }
}
