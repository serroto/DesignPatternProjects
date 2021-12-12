package lab7_FacadePattern;

public class ElectricGrill {
    public String getName() {
        return "'living room electric grill (fire)'";
    }

    public void turnOn() {
        System.out.println("Turning on the " + this.getName());
    }
}
