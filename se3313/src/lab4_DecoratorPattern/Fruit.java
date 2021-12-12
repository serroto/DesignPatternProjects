package lab4_DecoratorPattern;

public class Fruit extends WaffleDecorator{
    private String fname; //strawberry, kiwi, pineapple or banana
    private Waffle waffle;

    public Fruit(Waffle waffle, String fname) {
        this.waffle = waffle;
        this.fname = fname;
    }

    @Override
    public String description() {
        return waffle.description()+", "+fname;
    }

    @Override
    public double getPrice() {
        return waffle.getPrice()+ 0.5;
    }
}
