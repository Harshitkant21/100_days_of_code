// Platform GFG https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
// Day #5 of 100 Days_Of_code

class Solution {
    public static void sort012(int a[], int n) {
        int low = 0;        // Initialize a low pointer to track the position for 0s.
        int mid = 0;        // Initialize a mid pointer to traverse the array.
        int high = n - 1;   // Initialize a high pointer to track the position for 2s.

        while (mid <= high) {  // Continue until the mid pointer is less than or equal to the high pointer.
            if (a[mid] == 0) { // If the current element is 0, swap it with the element at the low pointer.
                int temp = a[mid];
                a[mid] = a[low];
                a[low] = temp;
                low++;          // Increment low pointer to the right.
                mid++;          // Increment mid pointer to the right.
            } else if (a[mid] == 1) { // If the current element is 1, move the mid pointer to the right.
                mid++;
            } else { // If the current element is 2, swap it with the element at the high pointer.
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;         // Decrement high pointer to the left.
            }
        }
    }
}


// Time Complexity : O(n)
// Space Complexity : O(1)
