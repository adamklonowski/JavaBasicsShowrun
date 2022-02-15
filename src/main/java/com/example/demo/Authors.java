package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class Authors {

    @GetMapping("/authors")
    public String[] getAuthorsArray() {
        String[] authorsArray = {"Ula", "Sylwia", "Mateusz", "Adam", "Patryk"};
        Arrays.sort(authorsArray);
        return authorsArray;
    }
}
