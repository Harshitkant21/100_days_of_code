// Platform LeetCode https://leetcode.com/problems/find-the-duplicate-number/description/
// Day #11 of 100 Days_Of_code

//I solved this question in two different ways:

//1 Using HashSet
class Solution {
    public int findDuplicate(int[] nums) {
        // Create a HashSet to store seen elements
        Set<Integer> myset = new HashSet<Integer>();
        int res = 0; // Initialize the result variable to 0

        // Iterate through the array 'nums'
        for (int i : nums) {
            // If the element 'i' is already in the HashSet, it's a duplicate
            if (!myset.add(i)) {
                res = i; // Update the result with the duplicate element
            }
        }

        // Return the duplicate element found in 'nums'
        return res;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)

//2 Using Floyd's Tortoise and Hare algorithm (slow and fast pointers)

class Solution {
    public int findDuplicate(int[] nums) {
        // Initialize two pointers, slow and fast, both starting at the first element
        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Detect whether there's a cycle in the array
        do {
            // Move the slow pointer one step ahead
            slow = nums[slow];
            // Move the fast pointer two steps ahead
            fast = nums[nums[fast]];
        } while (slow != fast); // Continue until they meet within the cycle

        // Phase 2: Find the entrance to the cycle (duplicate element)
        slow = nums[0]; // Reset the slow pointer to the beginning
        while (slow != fast) {
            // Move both pointers one step at a time until they meet at the entrance
            slow = nums[slow];
            fast = nums[fast];
        }

        // Return the duplicate element found at the entrance of the cycle
        return slow;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)

