package strategy;

/*
    Strategy Pattern
    디자인 패턴의 꽃


 */
public class StrategyClient {
    public static void main(String[] args) {
        Weapon weapon;
        User user = new User();

        weapon = new Bow();
        user.useWeapon(weapon);
        System.out.println();

        weapon = new Pistol();
        user.useWeapon(weapon);
        System.out.println();

        weapon = new Sword();
        user.useWeapon(weapon);

    }
}