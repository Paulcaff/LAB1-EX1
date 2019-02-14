//package com.company;// Factorial.java
/* Recursive factorial method */

public class Factorial {

    // Recursive definition of method factorial
    public static int factorial( int n )
    {
        int result;
        if ( n == 1 || n == 0 )  // base case
            return 1;
        else {
            int result1 = factorial(n-1);
            result = n * result1;
            return result;

        }


    }
}
