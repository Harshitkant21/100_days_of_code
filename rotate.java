// Platform GFG https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
// Platform Leetcode https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150
// Day #8 of 100 Days_Of_code

// GFG solution
class Compute {
    
    public void rotate(int arr[], int n) {
        // Store the last element of the array in a temporary variable
        int temp = arr[n - 1];
        
        // Shift elements to the right starting from the end of the array
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        
        // Place the temporarily stored last element at the beginning of the array
        arr[0] = temp;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)

// Leetcode solution

class Solution {
    // Method to rotate an array to the right by k positions
    public void rotate(int[] nums, int k) {
        // Get the length of the array
        int n = nums.length;
        
        // Ensure k is within a valid range by taking its modulo n
        k = k % n;
        
        // Reverse the entire array
        reverse(nums, 0, n - 1);
        
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        
        // Reverse the remaining elements
        reverse(nums, k, n - 1);
    }
    
    // Helper method to reverse an array or a portion of it
    public static void reverse(int[] arr, int start, int end) {
        // Use two pointers, one starting from the beginning and the other from the end
        while (start < end) {
            // Swap the elements at the start and end positions
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move the pointers towards each other
            start++;
            end--;
        }
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
