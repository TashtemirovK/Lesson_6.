public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(200);
        boss.setDamage(50);
        boss.weapon.setWeaponType(WeaponType.LASER);
        System.out.println(" Health: " + boss.getHealth() + " Damage: " + boss.getDamage()
                + " WeaponType: " + boss.weapon.getWeaponType());
    }
}