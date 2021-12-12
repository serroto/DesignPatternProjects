package lab3_ObserverPattern;

public class Main {
    public static void main(String[] args) {
        //For some reason that i couldn't understand my getter functions are returning null values.
        //So i gave the strings directly below to see at least some of them in output.
        Celebrity celeb = new Celebrity("Matthew Healy");
        Fan fan = new Fan("Sarah");
        celeb.registerObserver(fan, "Sarah", "Matthew Healy");
        Fan fan1 = new Fan("Ashley");
        celeb.registerObserver(fan1, "Ashley", "Matthew Healy");
        celeb.setMeasurements("Matthew Healy","New album countdown coming soon!!!");
        celeb.removeObserver(fan1, "Ashley", "Matthew Healy" );
    }
}

//Serra Atalay 19070006028