// Platform Leetcode https://leetcode.com/problems/factorial-trailing-zeroes/?envType=study-plan-v2&envId=top-interview-150
// Day #27 of 100 Days_Of_code

class Solution {
    // Function to calculate the number of trailing zeroes in the factorial of 'n'
    public int trailingZeroes(int n) {
        // Initialize a variable to count the trailing zeroes
        int count = 0;

        // Continue the loop until 'n' becomes zero or negative
        while (n > 0) {
            // Divide 'n' by 5 and add the result to 'count'
            n /= 5;
            count += n;
        }

        // Return the count of trailing zeroes
        return count;
    }
}

// Time Complexity : O(log₅(n))
// Space Complexity : O(1)
