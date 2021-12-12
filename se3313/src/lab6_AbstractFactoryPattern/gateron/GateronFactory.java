package lab6_AbstractFactoryPattern.gateron;

import lab6_AbstractFactoryPattern.*;

public class GateronFactory implements SwitchComponentFactory {
    @Override
    public KeyCap createKeyCap() {
        return null;
    }

    @Override
    public Stem createStem() {
        return null;
    }

    @Override
    public CoilSpring createCoilSpring(PressureCN pressureCN) {
        return null;
    }
}
