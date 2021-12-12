package lab7_FacadePattern;

public class SmartRemote {
    Fan fan;
    TV tv;
    MusicSystem musicSystem;
    Light light;
    CoffeeMachine coffeeMachine;
    ElectricGrill electricGrill;
    Refrigerator refrigerator;
    Microwave microwave;

    //Movie
    public void turnOnLRFan(){
        fan = new LivingRoomFan();
        System.out.println("Turning on the " + fan.getName());
    }
    public void speedOfLRFan(int val){
        System.out.println("Changed the speed of " + fan.getName() + " to " + val);
    }
    public void turnOnLRLight(){
        light = new LivingRoomLight();
        System.out.println("Turning on the " + light.getName());
    }
    public void turnOnLRTV(){
        tv = new LivingRoomTv();
        System.out.println("Turning on the " + tv.getName());
    }
    public void setSourceLRTV(String source){
        System.out.println("Setting source of " + tv.getName() + " to " + source);
    }
    public void turnOnLRElectricGrill(){
        electricGrill = new LivingRoomElectricGrill();
        System.out.println("Turning on the " + electricGrill.getName());
    }
    public void searchMovie(String platform, String movie){
        System.out.println("Searching " + movie + " on " + platform);
    }
    public void dimLRLight(){
        light = new LivingRoomLight();
        System.out.println("Dimming the " + light.getName());
    }
    public void setMusicSystem(int volume){
        musicSystem = new LivingRoomMS();
        System.out.println("Setting volume of " + musicSystem.getName() + " to " + volume);
    }
    public void playMovie(String platform, String movie){
        System.out.println("Playing " + movie + " on " + platform);
    }

    //Kitchen
    public void turnOnKitchenLight(){
        light = new KitchenLight();
        System.out.println("Turning on the " + light.getName());
    }
    public void settingRefrigerator(String cooling){
        refrigerator = new Refrigerator();
        System.out.println("Setting " + refrigerator.getName() + " cooling to " + cooling);
    }
    public void turnOnMicrowave(){
        microwave = new Microwave();
        System.out.println("Turning on " + microwave.getName());
    }









}
