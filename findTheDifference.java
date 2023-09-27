// Platform Leetcode https://leetcode.com/problems/find-the-difference/?envType=daily-question&envId=2023-09-25
// Day #23 of 100 Days_Of_code

class Solution {
    public char findTheDifference(String s, String t) {
        // Initialize a variable 'c' to store the result
        char c = 0;
        
        // Loop through each character in the first string 's'
        for (char i : s.toCharArray()) {
            // XOR (^) operation with 'c' to keep track of the difference
            c ^= i;
        }
        
        // Loop through each character in the second string 't'
        for (char i : t.toCharArray()) {
            // XOR (^) operation with 'c' to account for the missing character
            c ^= i;
        }
        
        // 'c' now contains the differing character between 's' and 't'
        return c;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
