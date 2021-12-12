package lab6_AbstractFactoryPattern.cherrymx;

import lab6_AbstractFactoryPattern.*;

public class CherryMXBrand extends SwitchMaker {
    Switch Switch = null;
    SwitchComponentFactory FactoryCH = new CherryMXFactory();
    protected Switch createSwitch(String type){
        if(type=="Clicky"){
            Switch = new CherryMXClickySwitch(FactoryCH);
        }else if(type=="Linear"){
            Switch = new CherryMXLinearSwitch(FactoryCH);
        }else if(type=="Tactile"){
            Switch = new CherryMXTactileSwitch(FactoryCH);
        }
        return Switch;
    }
    protected Switch assembleSwitch(String type){
        Switch Switch = createSwitch(type);
        Switch.gatherParts();
        Switch.placeCoilSpring();
        Switch.placeStem();
        Switch.placeKeyCap();
        return Switch;
    }
}


/*
pizza=switch
switch maker =pizza store
 */