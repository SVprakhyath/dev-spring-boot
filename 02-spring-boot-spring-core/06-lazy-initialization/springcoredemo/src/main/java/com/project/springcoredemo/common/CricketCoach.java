package com.project.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach(){
        System.out.println("In Constructor: "+ getClass().getSimpleName());
    }
    public String getDailyWorkout(){
        return "Practice fast bowling for 15 minutes:--";
    }
}
