package com.codegym.dao;

import com.codegym.User;
import com.codegym.mode.Login;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users = new ArrayList<>();
    static {
        User u1 = new User("john", "123456", "John", "John@codegym.vn", 10);
        User u2 = new User("bill", "123456", "Bill", "Bill@codegym.vn", 15);
        User u3 = new User("mike", "123456", "Mike", "Mike@codegym.vn", 20);
        users.add(u1);
        users.add(u2);
        users.add(u3);
    }
    public static User checkLogin(Login login){
        for (User u : users){
            if (u.getAccount().equals(login.getAccount()) & u.getPassword().equals(login.getPassword())){
                return u;
            }
        }return null;
    }
}
