package solid;

import solid.abstract_classes.AbstractUser;

public class Persister{
    private final AbstractUser user;

    public Persister(AbstractUser user){
        this.user = user;
    }

    public String save(){
        return String.format("Save user: " + user.getName());
    }
}
