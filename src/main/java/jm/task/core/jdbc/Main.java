package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("name1", "lastname1", (byte) 11);
        System.out.printf("User с именем %s добавлен в базу данных\n", "name1");
        userService.saveUser("name2", "lastname2", (byte) 22);
        System.out.printf("User с именем %s добавлен в базу данных\n", "name2");
        userService.saveUser("name3", "lastname3", (byte) 33);
        System.out.printf("User с именем %s добавлен в базу данных\n", "name3");
        userService.saveUser("name4", "lastname4", (byte) 44);
        System.out.printf("User с именем %s добавлен в базу данных\n", "name4");

        List<User> list = userService.getAllUsers();
        for (User user : list) {
            System.out.println(user.toString());
        }

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
