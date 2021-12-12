package lab8_SingletonPattern;

public class LazyInitialization {
    private int coins;
    private static LazyInitialization instance;
    private LazyInitialization(int c){
        coins=c;
    }
    public static LazyInitialization getInstance(){
        if(instance == null){
            instance = new LazyInitialization(0);
        }
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
