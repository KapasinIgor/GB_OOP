package warriors;

import warriors.armors.HeavyArmor;
import warriors.armors.LightArmor;
import warriors.items.Archer;
import warriors.items.SwordMan;
import warriors.items.Warrior;
import warriors.team.Team;
import warriors.weapons.Bow;
import warriors.weapons.Sword;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");

        Team<Archer> archerTeam = new Team<>("Archers");
        archerTeam.addWarrior(new Archer("Kratos", new Bow(), new LightArmor()))
                .addWarrior(new Archer("Robin Gud", new Bow(), new LightArmor()))
                .addWarrior(new Archer("Legolas", new Bow(), new LightArmor()))
                .addWarrior(new Archer("Gats", new Bow(), new LightArmor()));
        System.out.println(archerTeam);

        Team<SwordMan> swordManTeam = new Team<>("SwordMans");
        swordManTeam.addWarrior(new SwordMan("Donald McBane", new Sword(), new HeavyArmor()))
                .addWarrior(new SwordMan("Ito Itosai", new Sword(), new HeavyArmor()))
                .addWarrior(new SwordMan("El Sid", new Sword(), new HeavyArmor()))
                .addWarrior(new SwordMan("Sasaki Kodziro", new Sword(), new HeavyArmor()));
        System.out.println(swordManTeam);

        Team<Warrior> mixTeam = new Team<>("Mixer");
        mixTeam.addWarrior(new Archer("Drizzt Do'Urden", new Bow(), new LightArmor()))
                .addWarrior(new SwordMan("Ned Stark", new Sword(), new HeavyArmor()))
                .addWarrior(new Archer("Susan Pevensey", new Bow(), new LightArmor()))
                .addWarrior(new SwordMan("Jaime Lannister", new Sword(), new HeavyArmor()));
        System.out.println(mixTeam);

        SwordMan greg = new SwordMan("Petya", new Sword(), new HeavyArmor());
        Archer misha = new Archer("Misha", new Bow(), new LightArmor());

        while (greg.getHealthPoint() > 0 && misha.getHealthPoint() > 0) {
            misha.hitDamage(greg);
            greg.hitDamage(misha);
            System.out.printf("Здоровье Гриши: %d Здоровье Миши: %d \n", greg.getHealthPoint(), misha.getHealthPoint());
        }

        if (greg.getHealthPoint()>0)
            System.out.println("Гриша победил");
        else
            System.out.println("Миша победил");
    }
}
