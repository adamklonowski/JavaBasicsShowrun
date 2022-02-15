package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciController {

    @GetMapping("/fibonacci/{value}")
    public String whatever(@PathVariable("value") int range) {
        FibonacciSequence fib = new FibonacciSequence();

        return String.valueOf(fib.fibonacciNumber(range));
    }
}
