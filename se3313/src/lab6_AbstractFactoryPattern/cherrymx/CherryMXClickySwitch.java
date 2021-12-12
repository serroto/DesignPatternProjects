package lab6_AbstractFactoryPattern.cherrymx;

import lab6_AbstractFactoryPattern.PressureCN;
import lab6_AbstractFactoryPattern.Switch;
import lab6_AbstractFactoryPattern.SwitchComponentFactory;

public class CherryMXClickySwitch extends Switch {
    SwitchComponentFactory factory;
    public CherryMXClickySwitch(SwitchComponentFactory factory){
        this.factory=factory;
    }
    @Override
    public void gatherParts() {
        name= "CherryMX";
        keyCap = factory.createKeyCap();
        stem = factory.createStem();
        coilSpring = factory.createCoilSpring(PressureCN.Heavy);
    }
}
