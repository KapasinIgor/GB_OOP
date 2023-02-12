package vending;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Product("Lays", 100));
        machine.addProduct(new Product("Twix", 88));
        machine.addProduct(new Product("Mars", 75));
        machine.addProduct(new Product("Cola", 56));
        machine.addProduct(new Perishable("Milk Alenka", 32, new Date(2023, 2, 25)));
        machine.addProduct(new Perishable("Milk Egorka", 32, new Date(2023, 2, 25)));
        machine.addProduct(new Perishable("Milk Burenka", 32, new Date(2023, 2, 25)));

        System.out.println(machine);
        System.out.println(machine.findProduct("Mars"));
        System.out.println(machine.findProduct("Milk"));
        System.out.println("-----------------------------------");
        System.out.println("продан: " + machine.sellProduct(machine.findProduct("Twix").get(0)));
        System.out.println("-----------------------------------");
        System.out.println(machine);

        System.out.println("-----------------------------------");
        machine.addProduct(new Condom("Contex", 55, Condom.Size.M));
        machine.addProduct(new Condom("Гусарские", 70, Condom.Size.XXL));
        System.out.println(machine);
    }
}