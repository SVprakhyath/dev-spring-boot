package com.example.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String sayHello(){
        return "Hello";
    }

    @GetMapping("/teaminfo")
    public String teamInfo(){
        return "coach Name: "+ coachName+" " + "team Name: "+ teamName;
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
