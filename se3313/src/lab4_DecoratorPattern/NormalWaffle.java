package lab4_DecoratorPattern;

public class NormalWaffle implements Waffle{
    @Override
    public String description() {
        return "Normal Waffle";
    }
    @Override
    public double getPrice() {
        return 13.00;
    }
}
