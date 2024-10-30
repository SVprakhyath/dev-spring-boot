package com.project.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Test")
public class DemoRestController {
    @GetMapping("/hello")
    public String greet(){
        return "greetings";
    }
}
