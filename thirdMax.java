// Platform Leetcode https://leetcode.com/problems/third-maximum-number/
// Day #2 of 100 Days_Of_code

class Solution {
    public int thirdMax(int[] nums) {
        // Initialize three variables to store the top three maximum values.
        Integer curr = null;  // The current maximum value
        Integer sec = null;   // The second maximum value
        Integer thir = null;  // The third maximum value
        
        // Iterate through the input array 'nums'
        for (Integer i : nums) {
            // Check if 'i' is equal to any of the current top three values, and skip it.
            if (i.equals(curr) || i.equals(sec) || i.equals(thir)) {
                continue;
            }
            
            // Update the top three values based on the current element 'i'.
            if (curr == null || i > curr) {
                thir = sec;
                sec = curr;
                curr = i;
            } else if (sec == null || i > sec) {
                thir = sec;
                sec = i;
            } else if (thir == null || i > thir) {
                thir = i;
            }
        }
        
        // Check if there is a valid third maximum value, and return it.
        if (thir != null) {
            return thir;
        } else {
            // If there is no third maximum, return the current maximum value.
            return curr;
        }
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
