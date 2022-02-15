package com.example.demo;

public class FibonacciSequence {

    public long fibonacciNumber(int range) {
        long firstNumber = 0;
        long secondNumber = 1;
        long result = 0;

        if(range < 2) return 0;
        if(range == 2) return 1;

        for(int i = 0; i<range-2;i++) {
            result = firstNumber+secondNumber;
            firstNumber = secondNumber;
            secondNumber = result;
        }

        return result;
    }
}
