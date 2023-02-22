package warriors.armors;

public class HeavyArmor implements Armor{

    @Override
    public int armor() {
        return 100;
    }

    @Override
    public String toString() {
        return "armorPoint = " + armor();
    }
}
