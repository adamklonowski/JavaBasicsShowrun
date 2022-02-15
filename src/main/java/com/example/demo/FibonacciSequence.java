package com.example.demo;

public class FibonacciSequence {

    public int fibonacciNumber(int range) {
        int firstNumber = 0;
        int secondNumber = 1;
        int result = 0;

        if(range < 2) return 0;
        if(range==2) return 1;

        for(int i = 0; i<range-2;i++) {
            result = firstNumber+secondNumber;
            firstNumber = secondNumber;
            secondNumber = result;
        }

        return result;
    }
}
