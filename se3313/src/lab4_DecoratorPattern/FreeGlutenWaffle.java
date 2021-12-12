package lab4_DecoratorPattern;

public class FreeGlutenWaffle implements Waffle{

    @Override
    public String description() {
        return "Free Gluten Waffle.";
    }

    @Override
    public double getPrice() {
        return 17.00;
    }
}
