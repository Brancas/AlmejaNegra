package com.AlmejaNegra.services;

import com.AlmejaNegra.dao.UserDAO;
import com.AlmejaNegra.model.User;
import com.AlmejaNegra.model.request.NewUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserDAO usersDAO;

    @Autowired
    public UserService(UserDAO userDAO){
        this.usersDAO=userDAO;
    }



    public List<User> getUsers(){

    List<User> users = usersDAO.getAllUsers();
    return users;
    }

    public User createUser(NewUserRequest request){
        int id = usersDAO.getAllUsers().size() + 1;
        User user = new User();
        user.setId(id);
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setTel(request.getTel());
        user.setPass(request.getPass());

        user = usersDAO.createUser(user);

        return user;
    }




}
