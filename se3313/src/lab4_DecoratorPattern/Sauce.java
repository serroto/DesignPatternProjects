package lab4_DecoratorPattern;

public class Sauce extends WaffleDecorator{
    private String sname; //chocolate, caramel or raspberry
    private Waffle waffle;
    public Sauce(Waffle waffle, String sname) {
        this.waffle = waffle;
        this.sname = sname;
    }

    @Override
    public String description() {
        return waffle.description()+", "+sname+" Sauce";
    }

    @Override
    public double getPrice() {
        return waffle.getPrice()+ 1.0;
    }
}
