package lab7_FacadePattern;

public class KitchenLight implements Light {
    @Override
    public String getName() {
        return "'kitchen light'";
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on the " + this.getName());
    }

    @Override
    public void dimLight() {
        System.out.println("Dimming the " + this.getName());
    }
}
