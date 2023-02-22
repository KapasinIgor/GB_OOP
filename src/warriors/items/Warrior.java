package warriors.items;

import warriors.armors.Armor;
import warriors.weapons.Weapon;

import java.util.Random;

public abstract class Warrior<T1 extends Weapon, T2 extends Armor> {
    private final String name;
    protected T1 weapon;
    protected T2 armor;
    protected Random rnd = new Random();
    private int healthPoint;


    public Warrior(String name, T1 weapon, T2 armor) {
        this.name = name;
        this.weapon = weapon;
        this.armor = armor;
        healthPoint = 100;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void reduceHealthPoint(int damage) {
        this.healthPoint -= damage;
    }

    public int hitDamage(Warrior enemy) {
        int damage = rnd.nextInt(weapon.damage());
        enemy.reduceHealthPoint(damage);
        return damage;
    }

    public int getMaxDamage() {
        return weapon.damage();
    }

    @Override
    public String toString() {
        return "Warrior - " + name + " | weapon - " + weapon + ", [healthPoint = " + healthPoint + ", " + armor + "]";
    }
}
