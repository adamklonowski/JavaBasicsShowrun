package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class DateAndTimeController {
    @GetMapping("/now")
    public String displayLocalDateTime(){
        return "The current time is:" + LocalDateTime.now();
        }
}
