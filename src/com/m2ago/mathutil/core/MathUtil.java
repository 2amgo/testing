
package com.m2ago.mathutil.core;


public class MathUtil {
  
    public static long getFactorial(int n) {
        
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("n must be between 0 .. 20");
        
        if (n == 0 || n == 1) 
            return 1;
        
        
        long product = 1;
        for (int i = 1; i <= n; i++) 
            product *= i;
        
        return product;
    }
}
