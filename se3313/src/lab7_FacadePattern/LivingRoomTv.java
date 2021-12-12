package lab7_FacadePattern;

public class LivingRoomTv implements TV {
    @Override
    public String getName() {
        return "'living room fan'";
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on the " + this.getName());
    }

    @Override
    public void setSourceTV(String source) {
        System.out.println("Setting source of " + this.getName() + " to " + source);
    }

    @Override
    public void playMovie(String platform, String movie) {
        System.out.println("Playing " + movie + " on " + platform);
    }

    @Override
    public void stopMovie() {
        System.out.println("TV closed.");
    }
}
