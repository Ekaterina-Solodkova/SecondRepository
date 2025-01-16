package jm.task.core.jdbc;

import antlr.Utils;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Maria", "Petrova", (byte) 23);
        userService.saveUser("Aleksandr", "Smirnov", (byte) 27);
        userService.saveUser("Victoria", "Sidorova", (byte) 30);
        userService.saveUser("Dmitry", "Ivanov", (byte) 36);
        userService.removeUserById(1);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
