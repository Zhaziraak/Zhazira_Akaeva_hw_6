public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(200);
        boss.setDamage(50);
        boss.weapon.setWeaponType(WeaponType.FIRE_WEAPON);
        boss.weapon.setWeaponName("Fire");

        System.out.println("BOSS` HEALTH: " + boss.health +
                ", DAMAGE: " + boss.damage + ", WEAPON TYPE: " +
                boss.weapon.getWeaponType() + ", WEAPON NAME: " + boss.weapon.getWeaponName());

        System.out.println(boss.printInfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(400);
        skeleton.setDamage(40);
        skeleton.weapon.setWeaponType(WeaponType.LASER_WEAPON);
        skeleton.weapon.setWeaponName("Laser");


        System.out.println("SKELETON`s HEALTH: " + skeleton.health +
                ", DAMAGE: " + skeleton.damage + ", WEAPON TYPE: " +
                skeleton.weapon.getWeaponType() + ", WEAPON NAME: " + skeleton.weapon.getWeaponName());

    }
}