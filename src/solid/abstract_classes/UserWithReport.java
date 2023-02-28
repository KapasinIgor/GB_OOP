package solid.abstract_classes;

import solid.Reportable;
import solid.abstract_classes.AbstractUser;

public abstract class UserWithReport extends AbstractUser implements Reportable {
    public UserWithReport(String name) {
        super(name);
    }
}
