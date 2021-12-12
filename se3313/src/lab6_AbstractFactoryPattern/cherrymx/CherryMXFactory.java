package lab6_AbstractFactoryPattern.cherrymx;

import lab6_AbstractFactoryPattern.*;

public class CherryMXFactory implements SwitchComponentFactory {
    KeyCap CherryMXKeyCap=new CherryMXKeyCap();
    Stem CherryMXLinearStem=new CherryMXLinearStem();//for now
    @Override
    public KeyCap createKeyCap() {
        return CherryMXKeyCap;
    }

    @Override
    public Stem createStem() {
        return CherryMXLinearStem;
    }

    @Override
    public CoilSpring createCoilSpring(PressureCN pressureCN) {
        CherryMXCoilSpring CS = null;
        if (pressureCN == pressureCN.Light) {
            CS = new CherryMXCoilSpring(45);
        } else if (pressureCN == pressureCN.Medium) {
            CS = new CherryMXCoilSpring(55);
        } else if (pressureCN == pressureCN.Heavy) {
            CS = new CherryMXCoilSpring(60);
        } else if (pressureCN == pressureCN.SuperHeavy) {
            CS = new CherryMXCoilSpring(80);
        }
        return CS;
    }

}