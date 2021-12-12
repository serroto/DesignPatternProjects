package lab5_FactoryMethodPattern;

public class Main {
    public static void main(String[] args) {
        Blacksmith bsElve = new BsForElve();
        Blacksmith bsOrc = new BsForOrc();
        bsOrc.chooseWeapon(Weapon.Spear);
        bsOrc.chooseWeapon(Weapon.Axe);
        bsElve.chooseWeapon(Weapon.ShortSword);
        bsElve.chooseWeapon(Weapon.Spear);
    }
}
//Serra Atalay 19070006028