package lab7_FacadePattern;

public class LivingRoomLight implements Light {
    @Override
    public String getName() {
        return "'living room light'";
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
