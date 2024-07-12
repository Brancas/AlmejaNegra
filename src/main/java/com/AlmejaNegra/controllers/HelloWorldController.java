package com.AlmejaNegra.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld(@RequestParam("name")String name){
        return ResponseEntity.ok("Hello"+ name);
    }


}
