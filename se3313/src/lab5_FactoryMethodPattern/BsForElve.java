package lab5_FactoryMethodPattern;

public class BsForElve extends Blacksmith{
    @Override
    protected String createWeapon(Weapon wname) {
        String wchoice=null;
        //wchoice = "Elven " + wname; (or)
        switch (wname){
            case Axe:
                wchoice="Elven Axe";
                break;

            case Spear:
                wchoice="Elven Spear";
                break;

            case ShortSword:
                wchoice="Elven Short Sword";
                break;
        }
        return wchoice;
    }
}
