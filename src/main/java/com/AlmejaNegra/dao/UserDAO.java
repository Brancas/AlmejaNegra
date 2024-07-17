package com.AlmejaNegra.dao;

import com.AlmejaNegra.controllers.UserController;
import com.AlmejaNegra.model.User;
import com.AlmejaNegra.services.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component

public class UserDAO {

    public List<User> users = new ArrayList<>();


    public List<User> getAllUsers(){
        return users;
    }

    public User createUser(User user){
        users.add(user);
        return user;
    }

//    public User deleteUser(User user){
//        users.remove(user.getId());
//    }

}
