package solid;

import solid.abstract_classes.UserWithReport;

public class Main {
    public static void main(String[] args){
        UserWithReport user = new User("Bob");
        Controller controller = new Controller(user, new Persister(user));
        controller.clickButton();
    }
}
