package lab4_DecoratorPattern;

public class WheatWaffle implements Waffle{
    @Override
    public String description() {
        return "Wheat Waffle";
    }

    @Override
    public double getPrice() {
        return 15.00;
    }
}
