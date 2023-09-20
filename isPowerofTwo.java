// Platform GFG https://practice.geeksforgeeks.org/problems/power-of-2-1587115620/1
// Day #17 of 100 Days_Of_code

class Solution {
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        // Check if n is greater than 0 and has only one set bit.
        return n > 0 && (n & (n - 1)) == 0;
    }
}

// Time Complexity : O(1)
// Space Complexity : O(1)
