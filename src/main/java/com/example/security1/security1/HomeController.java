package com.example.security1.security1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/")
    public String getWelcome(){
        return "Welcome to Homepage";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Hi Admin";
    }
    @GetMapping("/user")
    public String user(){
        return "Hi User";
    }

}
