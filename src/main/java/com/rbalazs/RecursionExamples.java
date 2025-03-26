package com.rbalazs;

public class RecursionExamples {

    /**
     * Retrieves the Factorial of the number given as parameter using Recursion
     * e.g factorial(5)=120
     */
    public static int factorial(final int n){
        // base case
        if (n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * Retrieves the Fibonacci succession of the number given as parameter using Recursion
     * Fibonacci formula:
     * F(0) = 0
     * F(1) = 1
     * F(n) = F(n−1) + F(n−2)   n≥2
     */
    public static int fibonacci(final int n) {
        // base case
        if (n == 0) {
            return 0;
        }
        // base case
        if (n == 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

}
