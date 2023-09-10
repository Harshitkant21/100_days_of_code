// Platform GFG https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1
// Day #7 of 100 Days_Of_code

class Solution {
    // Function to find the count of distinct elements in the union of two arrays.
    public static int doUnion(int a[], int n, int b[], int m) {
        // Create a HashSet to store unique elements.
        HashSet<Integer> myset = new HashSet<Integer>();
        
        // Create a new array to combine elements from both input arrays.
        int[] arr = new int[n + m];
        
        // Copy elements from array 'a' to 'arr'.
        for (int i = 0; i < n; i++) {
            arr[i] = a[i];
        }
        
        // Copy elements from array 'b' to 'arr'.
        for (int i = 0; i < m; i++) {
            arr[i + n] = b[i];
        }
        
        // Add elements from 'arr' to the HashSet to ensure uniqueness.
        for (int i : arr) {
            myset.add(i);
        }
        
        // Return the size of the HashSet, which represents the count of distinct elements.
        return myset.size();
    }
}

// Time Complexity : O(n+m)
// Space Complexity : O(n+m)
