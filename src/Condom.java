public class Condom extends Product{
    private final String size;

    public enum Size {S, M, L, XXL;};

    public Condom(String name, int cost, Size size) {
        super(name, cost);
        this.size = String.valueOf(size);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" размер %s", size);
    }
}
