package com.example.security1.security1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/home")
    public String getWelcome(@RequestParam String name){
        return "Hello " + name ;
    }

}
