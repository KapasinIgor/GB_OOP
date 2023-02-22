package warriors.items;

import warriors.armors.LightArmor;
import warriors.weapons.Bow;

public class Archer extends Warrior<Bow, LightArmor> implements DistanceAttacker {
    private int distance;

    public Archer(String name, Bow weapon, LightArmor armor) {
        super(name, weapon, armor);

        distance = weapon.getDistance() + rnd.nextInt(10);
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return super.toString() + " Type - Archer[" + "distance = " + distance + ']';
    }
}
