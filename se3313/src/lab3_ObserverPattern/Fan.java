package lab3_ObserverPattern;

public class Fan implements Observer {
    private String fname;
    public Fan(String fname){
        fname= this.fname;
    }

    public String getName() {
        return fname;
    }

    public void setName(String fname) {
        this.fname = fname;
    }

    @Override
    public void update(Celebrity celeb, String tweet) {
        System.out.println(fname+" received "+celeb.getCname()+"'s tweet: "+tweet);
    }
}
