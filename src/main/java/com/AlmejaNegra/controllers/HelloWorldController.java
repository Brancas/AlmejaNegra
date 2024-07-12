package com.AlmejaNegra.controllers;

import com.AlmejaNegra.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public ResponseEntity<User> helloWorld(@RequestParam("name")String name,@RequestParam("email")String email,
                                           @RequestParam("tel")String tel,@RequestParam("pass")String pass){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setTel(tel);
        user.setPass(pass);
        System.out.println(user);
        return ResponseEntity.ok(user);
    }
}
