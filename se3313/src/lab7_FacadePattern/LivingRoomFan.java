package lab7_FacadePattern;

public class LivingRoomFan implements Fan {
    @Override
    public String getName() {
        return "'living room fan'";
    }
    @Override
    public void turnOn(){
        System.out.println("Turning on the " + this.getName());
    }
    @Override
    public void speedOfFan(int val){
        System.out.println("Changed the speed of " + this.getName() + " to " + val);
    }
}
