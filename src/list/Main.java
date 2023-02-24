package list;

public class Main {
    public static void main(String[] args) {
        SuperList list = new SuperList();

        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);

        list.remove(10);

        list.print();
    }
}
