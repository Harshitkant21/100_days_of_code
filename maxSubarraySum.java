// Platform GFG https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
// Day #9 of 100 Days_Of_code

class Solution {

    // arr: input array
    // n: size of array
    // Function to find the sum of a contiguous subarray with the maximum sum.

    long maxSubarraySum(int arr[], int n) {
        
        // Initialize variables to keep track of the current and previous maximum sums.
        long curr = arr[0];
        long prev = arr[0];
        
        // Iterate through the array starting from the second element.
        for (int i = 1; i < n; i++) {
            
            // Calculate the maximum between the current element and the current element
            // plus the previous maximum sum. This decides whether to start a new subarray
            // or continue the current one.
            curr = Math.max(arr[i], curr + arr[i]);
            
            // Update the previous maximum sum with the maximum of the previous sum
            // and the current sum to keep track of the maximum subarray sum.
            prev = Math.max(prev, curr);
        }
        
        // Return the maximum subarray sum found.
        return prev;
    }
}

// Time Complexity: O(n) 
// Space Complexity: O(1) 
