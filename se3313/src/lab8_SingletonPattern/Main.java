package lab8_SingletonPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("With Eager Initialization: ");
        EagerInitialization eager = EagerInitialization.getInstance();
        eager.addCoin(1);
        eager.decreaseCoin(1);
        System.out.println("coin1 = "+ eager);
        System.out.println();

        System.out.println("With Lazy Initialization: ");
        LazyInitialization lazy = LazyInitialization.getInstance();
        lazy.addCoin(1);
        lazy.decreaseCoin(1);
        System.out.println("coin2 = "+ lazy);
        System.out.println();

        System.out.println("With Thread Safe Singleton: ");
        ThreadSafeSingleton threadSafe = ThreadSafeSingleton.getInstance();
        threadSafe.addCoin(1);
        threadSafe.decreaseCoin(1);
        System.out.println("coin3 = "+ threadSafe);
    }
}

//Serra Atalay 19070006028
