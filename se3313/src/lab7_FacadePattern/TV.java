package lab7_FacadePattern;

public interface TV {
    String getName();
    void turnOn();
    void setSourceTV(String source);
    public default void searchMovie(String platform, String movie){
        System.out.println("Searching " + movie + " on " + platform);
    }

    void playMovie(String platform, String movie);

    void stopMovie();
}
