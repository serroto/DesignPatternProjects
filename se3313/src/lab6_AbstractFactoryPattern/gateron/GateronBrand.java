package lab6_AbstractFactoryPattern.gateron;

import lab6_AbstractFactoryPattern.*;

public class GateronBrand extends SwitchMaker {
    lab6_AbstractFactoryPattern.Switch Switch = null;
    SwitchComponentFactory FactoryGT = new GateronFactory();
    protected Switch createSwitch(String type){
        if(type=="Clicky"){
            Switch = new GateronClickySwitch(FactoryGT);
        }else if(type=="Linear"){
            Switch = new GateronLinearSwitch(FactoryGT);
        }else if(type=="Tactile"){
            Switch = new GateronTactileSwitch(FactoryGT);
        }
        return Switch;
    }
    protected Switch assembleSwitch(String type){
        return createSwitch(type);
    }
}
