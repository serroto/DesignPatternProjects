package lab8_SingletonPattern;

public class ThreadSafeSingleton {
    private int coins;
    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton(int c){
        coins=c;
    }
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton(0);
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
