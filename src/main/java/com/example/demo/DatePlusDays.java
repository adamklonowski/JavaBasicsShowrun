package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class DatePlusDays {

    @GetMapping("/dateCalculator/{daysNumber}")
    @ResponseBody
    public LocalDate getNumberOfDays(@PathVariable int daysNumber) {

        LocalDate dateAfterAddingDAys = LocalDate.now().plusDays(daysNumber);
        return dateAfterAddingDAys;
    }



}
