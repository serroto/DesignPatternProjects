package lab4_DecoratorPattern;

public class BelgianWaffle implements Waffle{
    @Override
    public String description() {
        return "Belgian Waffle";
    }
    @Override
    public double getPrice() {
        return 16.00;
    }
}
