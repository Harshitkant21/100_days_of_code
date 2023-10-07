// Platform Leetcode https://leetcode.com/problems/product-of-array-except-self/solutions/1342916/3-minute-read-mimicking-an-interview/?envType=study-plan-v2&envId=top-interview-150
// Day #33 of 100 Days_Of_code

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        // Calculate the product of all elements to the left of the current index
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            res[i] = leftProduct; // Store the product to the left of the current index
            leftProduct *= nums[i];
        }

        // Calculate the product of all elements to the right of the current index
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= rightProduct; // Multiply the left product by the right product
            rightProduct *= nums[i];
        }

        return res;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)
