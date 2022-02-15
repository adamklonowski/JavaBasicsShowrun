package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloPage {
    @GetMapping("/hello/Mark")
    public String hello() {
        return "Hello Mark";
    }
}
