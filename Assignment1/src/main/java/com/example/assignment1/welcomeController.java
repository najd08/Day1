package com.example.assignment1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {
    @GetMapping("/name")
    public String getname(){
        return "My name is Najd";
    }
    @GetMapping("/age")
    public String getage(){
        return "My age is 19";
    }
    @GetMapping("/check/status")
    public String getcheck(){
        return "Everything OK";
    }
    @GetMapping("/health")
    public String gethealth(){
        return "Server health is up and running";
    }
}
