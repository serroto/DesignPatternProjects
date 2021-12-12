package lab7_FacadePattern;

public class CoffeeMachine {
    public String getName() {
        return "'coffe maker'";
    }

    public void turnOn() {
        System.out.println("Turning on " + this.getName());
    }
}
