package lab4_DecoratorPattern;

public class WrapWaffle implements Waffle{
    @Override
    public String description() {
        return "Wrap Waffle";
    }

    @Override
    public double getPrice() {
        return 13.00;
    }
}
