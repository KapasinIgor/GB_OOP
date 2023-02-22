package warriors.items;

import warriors.armors.HeavyArmor;
import warriors.weapons.Sword;

public class SwordMan extends Warrior<Sword, HeavyArmor> {
    public SwordMan(String name, Sword weapon, HeavyArmor armor) {
        super(name, weapon, armor);
    }

    @Override
    public String toString() {
        return super.toString() + " Type - SwordMan";
    }
}
