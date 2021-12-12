package lab5_FactoryMethodPattern;

public class BsForOrc extends Blacksmith{
    @Override
    protected String createWeapon(Weapon wname) {
        String wchoice = null;
        //wchoice = "Orcish " + wname; (or)
        switch (wname){
            case Axe:
                wchoice="Orcish Axe";
                break;

            case Spear:
                wchoice="Orcish Spear";
                break;

            case ShortSword:
                wchoice="Orcish Short Sword";
                break;
        }
        return wchoice;
    }
}
