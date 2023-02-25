package phoneBook_MVC.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();

    void CreateUser(User user);

    void saveUsers(List<User> users);
}
