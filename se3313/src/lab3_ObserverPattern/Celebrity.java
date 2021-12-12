package lab3_ObserverPattern;

import java.util.ArrayList;

public class Celebrity implements Subject{
    private String cname;
    private ArrayList<Fan> fans;

    public Celebrity(String cname){
        fans = new ArrayList<Fan>();
        cname=this.cname;
    }

    /*void measurementsChanged(){
        notifyObservers();
    }*/

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }


    void setMeasurements(String cname, String tweet){
        cname=this.cname;
        notifyObservers(cname, tweet);
    }

    @Override
    public void registerObserver(Fan f, String fname, String cname) {
        fans.add(f);
        System.out.println(fname+" started following "+cname);
    }

    @Override
    public void removeObserver(Fan f, String fname, String cname) {
        int i = fans.indexOf(f);
        if(i>=0){
            fans.remove(i);
            System.out.println(fname+" has stopped following "+cname);
        }
    }

    @Override
    public void notifyObservers(String cname, String tweet) {
        System.out.println(this.cname+" tweeted: "+ tweet);
        for(Fan fan: fans){
            fan.update(this, tweet);
        }
    }
}
