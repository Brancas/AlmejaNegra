package com.AlmejaNegra.controllers;

import com.AlmejaNegra.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public ResponseEntity<User> helloWorld(@RequestParam("name")String name){
        User user = new User();
        user.setName(name);
//        user.setEmail(request.getEmail());
//        user.setTel(request.getTel());
//        user.setPass(request.getPass());

        System.out.println(user.getName());

        return ResponseEntity.ok(user);
    }
}
