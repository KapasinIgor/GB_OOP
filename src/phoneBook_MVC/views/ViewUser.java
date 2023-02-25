package phoneBook_MVC.views;

import phoneBook_MVC.controllers.UserController;
import phoneBook_MVC.model.User;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private final UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com;

        while (true) {
            String command = prompt("Введите команду: ");
            try {
                com = Commands.valueOf(command.toUpperCase());

                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE -> createUser();
                    case READ -> readUser();
                    case LIST -> listUsers();
                    case UPDATE -> updateUser();
                    case DELETE -> deleteUser();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void deleteUser() {
        String readId = getID("Введите ID юзера для удаления: ");
        userController.deleteUser(readId);
    }

    private void updateUser() throws Exception {
        String readId = getID("Введиет редактируемый ID юзера: ");
        userController.updateUser(readId,inputUser());
    }

    private String getID(String message) {
        return prompt(message);
    }

    private void listUsers() {
        List<User> listUsers = userController.readAllUsers();
        for (User user : listUsers) {
            System.out.println(user + "\n");
        }
    }

    private void readUser() throws Exception {
        String id = getID("Идентификатор пользователя: ");

        User user = userController.readUser(id);
        System.out.println(user);

    }

    private User inputUser() {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        return new User(firstName, lastName, phone);
    }

    private void createUser() throws Exception {
        userController.saveUser(inputUser());
    }


    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}