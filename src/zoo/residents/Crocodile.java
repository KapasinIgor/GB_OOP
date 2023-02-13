package zoo.residents;

import zoo.Predator;
import zoo.abilities.Flyable;
import zoo.abilities.Runable;

public class Crocodile extends Predator implements Runable, Flyable {
    private int flightSpeed = 15;
    private int flightHing = 5;
    private int runSpeed = 100;

    public Crocodile(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Shhhhh";
    }

    @Override
    public int getSpeedFlyable() {
        return this.flightSpeed;
    }

    @Override
    public int getHigh() {
        return this.flightHing;
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }
}
