package zoo.residents;

import zoo.Herbivores;
import zoo.abilities.Runable;

public class Goat extends Herbivores implements Runable {
    private int runSpeed = 4;
    public Goat(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Beee!";
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }
}