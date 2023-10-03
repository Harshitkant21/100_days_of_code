// Platform Leetcode https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
// Day #29 of 100 Days_Of_code

class Solution {
    public int removeDuplicates(int[] nums) {
        // Initialize a variable i to keep track of the current index
        int i = 0;
        
        // Iterate through the array using a for-each loop
        for (int n : nums) {
            // Check if either of the following conditions is true:
            // 1. If i is less than 2 (i < 2), meaning the first two elements are automatically included.
            // 2. If the current number n is greater than the number located two positions back (nums[i-2]).
            if (i < 2 || n > nums[i - 2]) {
                // If the conditions are met, assign the current number n to the current index i
                nums[i] = n;
                // Increment the index i to move to the next position in the array
                i++;
            }
        }
        
        // Return the final length of the array after removing duplicates
        return i;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
