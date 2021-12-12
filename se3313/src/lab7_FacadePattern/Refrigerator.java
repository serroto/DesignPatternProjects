package lab7_FacadePattern;

public class Refrigerator {
    public String getName() {
        return "'Refrigerator'";
    }

    public void settingRefrigerator(String cooling) {
        System.out.println("Setting " + this.getName() + " cooling to " + cooling);
    }

    public void turnOff() {
        System.out.println(this.getName()+" turned off");
    }
}
