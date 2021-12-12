package lab6_AbstractFactoryPattern;

public abstract class SwitchMaker {
    protected abstract Switch createSwitch(String type);
    protected abstract Switch assembleSwitch(String type); //wasn't protected (send mail).
}
