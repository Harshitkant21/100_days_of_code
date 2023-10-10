// Platform Leetcode https://leetcode.com/problems/container-with-most-water/?envType=study-plan-v2&envId=top-interview-150
// Day #36 of 100 Days_Of_code


class Solution {
    public int maxArea(int[] height) {
        int maximum = 0;             // Initialize the maximum area as 0.
        int first = 0;              // Initialize the left pointer at the first wall.
        int last = height.length - 1;  // Initialize the right pointer at the last wall.

        // Continue as long as the left pointer is less than the right pointer.
        while (first < last) {
            // Calculate the area for the current two walls and update maximum if it's larger.
            maximum = Math.max(maximum, Math.min(height[first], height[last]) * (last - first));

            // Move the pointer that points to the shorter wall inward.
            if (height[first] > height[last]) {
                last--;  // Move the right pointer leftward.
            } else {
                first++; // Move the left pointer rightward.
            }
        }

        return maximum;  // Return the maximum area found.
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)
