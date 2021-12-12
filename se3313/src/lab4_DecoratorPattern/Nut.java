package lab4_DecoratorPattern;

public class Nut extends WaffleDecorator {
    private String nname; //pistachio, almond, hazelnut or walnut
    private Waffle waffle;

    public Nut(Waffle waffle, String nname) {
        this.waffle = waffle;
        this.nname = nname;
    }

    @Override
    public String description() {
        return waffle.description()+", "+nname;
    }

    @Override
    public double getPrice() {
        return waffle.getPrice()+ 1.0;
    }
}
