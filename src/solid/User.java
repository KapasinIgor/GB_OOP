package solid;

import solid.abstract_classes.UserWithReport;

public class User extends UserWithReport {
    public User(String name) {
        super(name);
    }

    public String report(){
        return super.toString();
    }

}
