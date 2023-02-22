package warriors.armors;

public class LightArmor implements Armor{

    @Override
    public int armor() {
        return 45;
    }

    @Override
    public String toString() {
        return "armorPoint = " + armor();
    }
}
