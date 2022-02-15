package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciController {

    @GetMapping("fibonacci/{value}")
    public String fibonacciNumber(@PathVariable("value") int range) {
        int firstNumber = 0;
        int secondNumber = 1;
        int result = 0;

        if(range < 2) return "0";
        if(range==2) return "1";

        for(int i = 0; i<range-2;i++) {
            result = firstNumber+secondNumber;
            firstNumber = secondNumber;
            secondNumber = result;
        }

        return String.valueOf(result);
    }
}
