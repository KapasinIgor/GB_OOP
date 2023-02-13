package zoo;

import zoo.abilities.Flyable;
import zoo.abilities.Runable;
import zoo.abilities.Sayable;
import zoo.abilities.Swimable;
import zoo.residents.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animalsList = List.of(
                new Cow("Burenka"),
                new Crocodile("Gena"),
                new Lion("Simba"),
                new Goat("Dereza"),
                new Duck("Donald"),
                new Hippopotamus("Boris")
        );
        Zoo zoo = new Zoo(animalsList, new Radio());

        for (Sayable animal : zoo.getSayable()) {
            System.out.println(animal.say());
        }

        System.out.println("______________________");

        for (Runable animal : zoo.getRunableList()) {
            System.out.println(((Animal) animal).getName());
            System.out.println(((Animal) animal).say());
            System.out.println(animal.getSpeedRun() + "\n");
        }

        System.out.println("______________________");

        for (Flyable animal : zoo.getFlyableList()) {
            System.out.println(((Animal) animal).getName());
            System.out.println(((Animal) animal).say());
            System.out.println(animal.getSpeedFlyable());
            System.out.println(animal.getHigh() + "\n");
        }

        System.out.println("______________________");

        for (Swimable animal: zoo.getSwimable()) {
            System.out.println(((Animal) animal).getName());
            System.out.println(((Animal) animal).say());
            System.out.println(animal.getSpeedSwimable() + "\n");
        }


        System.out.println("____Определяем чемпиона по бегу_____");
        System.out.println(zoo.getRunChampion());
        System.out.println("____Определяем чемпиона по полётам_______");
        System.out.println(zoo.getFlightChampion());

    }
}
