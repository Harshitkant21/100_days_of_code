// Platform Leetcode https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
// Day #24 of 100 Days_Of_code

import java.util.HashMap;

class Solution {
  // This function takes an array of integers 'numbers' and an integer 'target'.
  // It finds two numbers in the 'numbers' array that add up to the 'target'.
  // It returns an array containing the indices (1-based) of the two numbers.
  public int[] twoSum(int[] numbers, int target) {
    // Create a HashMap to store the numbers and their corresponding indices.
    HashMap<Integer, Integer> map = new HashMap<>();

    // Loop through the 'numbers' array.
    for (int i = 0; i < numbers.length; i++) {
      // Calculate the complement of the current number with respect to the 'target'.
      int complement = target - numbers[i];

      // If the complement is already in the HashMap, it means we found a pair.
      if (map.containsKey(complement)) {
        // Return an array containing the indices (1-based) of the two numbers.
        // The first index is the one stored in the HashMap, and the second index is 'i+1'.
        return new int[] { map.get(complement) + 1, i + 1 };
      }

      // If the complement is not in the HashMap, store the current number and its index.
      map.put(numbers[i], i);
    }

    // If no such pair is found, return an empty array.
    return new int[0];
  }
}


// Time Complexity : O(n)
// Space Complexity : O(n)
