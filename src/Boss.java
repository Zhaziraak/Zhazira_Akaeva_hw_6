public class Boss extends GameEntity {

    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        return "HEALTH: " + getHealth()+ ", DAMAGE: " +
                getDamage() + ", WEAPON TYPE: " + weapon.getWeaponType() + " WEAPON NAME: " + weapon.getWeaponName();
    }

}
