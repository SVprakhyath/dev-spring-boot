package com.example.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run 5k";
    }

    @GetMapping("/fortune")
    public String getFortune(){
        return "Today is a good day";
    }
}
