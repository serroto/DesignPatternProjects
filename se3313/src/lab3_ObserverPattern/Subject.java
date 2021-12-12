package lab3_ObserverPattern;

public interface Subject {
    void registerObserver(Fan f, String fname, String cname);
    void removeObserver(Fan f, String fname, String cname);
    void notifyObservers(String cname, String tweet);
}
