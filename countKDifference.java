// Platform Leetcode https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/
// Day #19 of 100 Days_Of_code
// I solved this using two different method first is brute force approach and second is using HashMap
// 1 Brute force

class Solution {
    public int countKDifference(int[] nums, int k) {
        // Get the length of the input array 'nums'.
        int n = nums.length;
        
        // Initialize a count variable to keep track of the valid pairs.
        int count = 0;
        
        // Iterate through the elements in the 'nums' array using two nested loops.
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // Calculate the absolute difference between the elements at indices 'i' and 'j'.
                int absoluteDiff = Math.abs(nums[i] - nums[j]);
                
                // Check if the absolute difference matches the target 'k'.
                if (absoluteDiff == k) {
                    // Increment the count for valid pairs.
                    count++;
                }
            }
        }
        // Return the final count of valid pairs.
        return count;
    }
}

// Time Complexity : O(n^2)
// Space Complexity : O(1)

// 2 Using HashMap

class Solution {
    public int countKDifference(int[] nums, int k) {
        // Create a HashMap to store the frequency of each element in the array.
        Map<Integer, Integer> elementCount = new HashMap<>();
        
        // Initialize the count of valid pairs to 0.
        int count = 0;
        
        // Iterate through the elements in the 'nums' array.
        for (int i : nums) {
            // Update the frequency of the current element in the HashMap.
            elementCount.put(i, elementCount.getOrDefault(i, 0) + 1);
            
            // Calculate the number of pairs with an absolute difference of 'k' using the HashMap.
            count += elementCount.getOrDefault(i - k, 0) + elementCount.getOrDefault(i + k, 0);
        }
        
        // Return the final count of valid pairs.
        return count;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)
 
