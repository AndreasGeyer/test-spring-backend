package com.example.test_spring_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class HelloWorldController {
    @CrossOrigin(origins = "*")
    @GetMapping("/hello")
    public String helloWorld() {
        int randomNumber = (int) (Math.random() * 1000);
        return "hello-world " + randomNumber;
    }
}
