package com.junit;

public class Diff21 {
    public int diff21(int n) {
        // Calculate the difference between n and 21 using Math.abs() function
        int diff = Math.abs(n - 21);

        // Check if n is greater than 21
        if (n > 21) {
            // If n is greater than 21, return double the absolute difference
            return 2 * diff;
        } else {
            // If n is less than or equal to 21, return the absolute difference
            return diff;
        }
    }
}
