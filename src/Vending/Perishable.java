package Vending;

import java.sql.Date;

public class Perishable extends Product {
    private final Date expireDate;

    public Perishable(String name, int cost, Date expireDate) {
        super(name, cost);
        this.expireDate = expireDate;
    }
    @Override
    public String toString() {
        return super.toString() + String.format(" годен до %s", expireDate);
    }
}
