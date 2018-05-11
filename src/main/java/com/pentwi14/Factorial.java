package com.pentwi14;

public class Factorial {

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a positive number");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

}
