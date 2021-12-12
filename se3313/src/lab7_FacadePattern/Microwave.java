package lab7_FacadePattern;

public class Microwave {
    public String getName() {
        return "'Microwave'";
    }

    public void turnOn() {
        System.out.println("Turning on " + this.getName());
    }

    public void settingMicrowave(String heat, int tmp, int time) {
        System.out.println("Setting microwave on heat:" + heat + "temparature:" + "time:" + tmp +"min");
    }

    public void turnOnGrill() {
        System.out.println("Turning on " + this.getName() + "grill");
    }

    public void bakePizza(String pizza, int tmp, int time) {
        System.out.println("Baking " + pizza +" in "+this.getName()+ " for tmp: " +tmp+" time:" +time);
    }

    public void turnOff() {
    }

    public void turnOfGrill() {
        System.out.println(this.getName()+ "turned off");
    }
}
