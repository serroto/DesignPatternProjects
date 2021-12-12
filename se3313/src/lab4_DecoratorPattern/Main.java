package lab4_DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        Waffle waffle= new BelgianWaffle();
        waffle = new Chocolate(waffle,"Milky");
        waffle = new Fruit(waffle, "Strawberry");
        waffle = new Fruit(waffle, "Banana");
        System.out.println(waffle.description()+", Total Price: "+waffle.getPrice()+"$");

        Waffle waffle1= new WheatWaffle();
        waffle1 = new Chocolate(waffle1,"Nutella");
        waffle1 = new Fruit(waffle1, "Kiwi");
        waffle1 = new Nut(waffle1, "Almond");
        waffle1 = new Sauce(waffle1,"Raspberry");
        System.out.println(waffle1.description()+", Total Price: "+waffle1.getPrice()+"$");
    }
}

//Serra Atalay 19070006028
