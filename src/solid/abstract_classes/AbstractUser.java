package solid.abstract_classes;

public abstract class AbstractUser {
    private final String name;

    public AbstractUser(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return String.format("Report for user: " + name);
    }
}
