package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class DatePlusDays {

    @GetMapping("/dateCalculator")

public LocalDate dateCalculator() {

    int addingDays = 10;
    LocalDate dateAfterAddingDAys = LocalDate.now().plusDays(addingDays);

    return dateAfterAddingDAys;
}

}
