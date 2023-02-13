package zoo.residents;

import zoo.Predator;
import zoo.abilities.Runable;

public class Lion extends Predator implements Runable {
    private int runSpeed = 300;
    public Lion(String name) {super(name);}

    @Override
    public String say() {return "Rrrr!";}
    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }
}
