package lab7_FacadePattern;

public class LivingRoomMS implements MusicSystem {
    @Override
    public String getName() {
        return "'living room sound bar'";
    }

    @Override
    public void setMusicSystem(int volume) {
        System.out.println("Setting volume of " + this.getName() + " to " + volume);
    }
}
