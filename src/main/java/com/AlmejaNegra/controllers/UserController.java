package com.AlmejaNegra.controllers;

import com.AlmejaNegra.model.User;
import com.AlmejaNegra.model.request.NewUserRequest;
import com.AlmejaNegra.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {

    private final UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers(){
        List<User> users = userService.getUsers();
        System.out.println("Se devuelven" +users.size() + "usuarios");

        return ResponseEntity.ok(users);
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody NewUserRequest request){
        User user = userService.createUser(request);

        return ResponseEntity.ok(user);
    }


    @GetMapping("/delete")
    public ResponseEntity<User> deleteUser (@RequestParam("id")int id){



        return new ResponseEntity.ok<>();
    }





}
