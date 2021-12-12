package lab8_SingletonPattern;

public class EagerInitialization {
    private int coins;
    private static EagerInitialization instance = new EagerInitialization(0);
    private EagerInitialization(int c){
        coins=c;
    }
    public static EagerInitialization getInstance(){
        return instance;
    }
    public void addCoin(int c){
        coins=coins+10;
        System.out.println("The number of coins is "+coins);
    }
    public void decreaseCoin(int c){
        coins=coins-1;
        System.out.println("The number of coins is "+coins);
    }
}