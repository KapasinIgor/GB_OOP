package zoo.residents;

import zoo.Predator;
import zoo.abilities.Runable;
import zoo.abilities.Swimable;

public class Hippopotamus extends Predator implements Runable, Swimable {
    private int runSpeed = 25;
    private int swimSpeed = 55;

    public Hippopotamus(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "AaAAAaa!";
    }

    @Override
    public int getSpeedSwimable() {
        return this.swimSpeed;
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }
}
