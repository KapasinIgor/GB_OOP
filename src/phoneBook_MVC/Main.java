package phoneBook_MVC;

import phoneBook_MVC.controllers.UserController;
import phoneBook_MVC.model.FileOperation;
import phoneBook_MVC.model.FileOperationImpl;
import phoneBook_MVC.model.Repository;
import phoneBook_MVC.model.RepositoryFile;
import phoneBook_MVC.views.Validation;
import phoneBook_MVC.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository,new Validation());
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
