package vending;

import java.util.Date;

public class Product {

    private final String name;
    private final int cost;
    private Date loadDate = new Date();
    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
    public Product() {
        this("0", 0);
    }

    public void setLoadDate(Date loadDate) {
        this.loadDate = loadDate;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object obj) {
        return (this.name.equals(((Product) obj).name) && this.cost == (((Product) obj).cost));
    }

    @Override
    public int hashCode() {
        return name.hashCode() + cost;
    }

    @Override
    public String toString() {
        return String.format("наименование %s цена %d дата загрузки %s", name, cost, loadDate);
    }
}
