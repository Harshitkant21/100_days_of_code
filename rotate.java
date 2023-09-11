// Platform GFG https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
// Day #8 of 100 Days_Of_code


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
