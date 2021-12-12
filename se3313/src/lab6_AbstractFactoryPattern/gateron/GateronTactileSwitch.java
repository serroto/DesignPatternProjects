package lab6_AbstractFactoryPattern.gateron;

import lab6_AbstractFactoryPattern.PressureCN;
import lab6_AbstractFactoryPattern.Switch;
import lab6_AbstractFactoryPattern.SwitchComponentFactory;

public class GateronTactileSwitch extends Switch {
    SwitchComponentFactory factory;
    public GateronTactileSwitch(SwitchComponentFactory factory){
        this.factory=factory;
    }
    @Override
    public void gatherParts() {
        name= "Gateron";
        keyCap = factory.createKeyCap();
        stem = factory.createStem();
        coilSpring = factory.createCoilSpring(PressureCN.Medium);
    }
}
