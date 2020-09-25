package forspring.strategy;

public class User {
    void useWeapon(Weapon weapon) {
        weapon.equipWeapon();
        System.out.println("공격!");
    }
}
