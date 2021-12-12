package lab4_DecoratorPattern;

public abstract class WaffleDecorator implements Waffle {
    @Override
    public String description() {
        return "Toppings";
    }

}
