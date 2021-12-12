package lab4_DecoratorPattern;

public class Chocolate extends WaffleDecorator{
    private String cname; //white, milky, dark, nutella or caramel
    private Waffle waffle;

    public Chocolate(Waffle waffle, String cname) {
        this.waffle = waffle;
        this.cname = cname;
    }

    @Override
    public String description() {
        return waffle.description()+", "+cname+" Chocolate";
    }

    @Override
    public double getPrice() {
        return waffle.getPrice()+ 2.00;
    }
}
