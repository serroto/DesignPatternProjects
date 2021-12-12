package lab5_FactoryMethodPattern;

public abstract class Blacksmith {
    public String chooseWeapon(Weapon wname){
        String weapon;
        weapon=createWeapon(wname);
        System.out.println(weapon+" has been choosed.");
        return weapon;
    }
    protected abstract String createWeapon(Weapon wame);
}
