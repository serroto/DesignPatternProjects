package lab7_FacadePattern;

public class SmartRemoteFacade {
    Fan fan;
    TV tv;
    MusicSystem musicSystem;
    Light light;
    CoffeeMachine coffeeMachine;
    ElectricGrill electricGrill;
    Refrigerator refrigerator;
    Microwave microwave;

    int val=2;
    String source="HDMI";
    String platform="Netflix";
    String movie ="Far from home";
    int volume = 20;

    String cooling="Party";
    String heat = "Pre-heat";
    int tmp = 200;
    int time = 5;
    String pizza ="Napoletana";
    String pizza1 ="Margerate";
    String pizza2="Marinara";
    String pizza3="Chicago";


    public void setUpMovie(){
        System.out.println();
        System.out.println("Setting up the movie...");

        fan = new LivingRoomFan();
        fan.turnOn();
        fan.speedOfFan(val);
        light = new LivingRoomLight();
        light.turnOn();
        tv = new LivingRoomTv();
        tv.turnOn();
        tv.setSourceTV(source);
        electricGrill = new LivingRoomElectricGrill();
        electricGrill.turnOn();
        tv.searchMovie(platform, movie);
        light.dimLight();
        musicSystem = new LivingRoomMS();
        musicSystem.setMusicSystem(volume);
        tv.playMovie(platform, movie);
    }
    public void prepareFood(){
        System.out.println();
        System.out.println("Preparing the food...");

        light = new KitchenLight();
        light.turnOn();
        refrigerator = new Refrigerator();
        refrigerator.settingRefrigerator(cooling);
        microwave = new Microwave();
        microwave.turnOn();
        microwave.settingMicrowave(heat, tmp, time);
        microwave.turnOnGrill();
        electricGrill = new ElectricGrill();
        electricGrill.turnOn();
        coffeeMachine = new CoffeeMachine();
        coffeeMachine.turnOn();
        microwave.bakePizza(pizza,tmp*2,time*2);
        microwave.bakePizza(pizza1,tmp*2,time*2);
        microwave.bakePizza(pizza2,tmp*2,time*2);
        microwave.bakePizza(pizza3,tmp*2,time*2);
    }
    public void endMovie(){
        System.out.println();
        System.out.println("Enjoy the movies with dinners and drinks...");
        System.out.println();
        System.out.println("Movie has ended.");

        tv.stopMovie();
        System.out.println();

    }
    public void endKitchen(){
        microwave.turnOff();
        microwave.turnOfGrill();
        refrigerator.turnOff();

        System.out.println("Kitchen has been cleaned.");
    }

}
