// Platform GFG https://practice.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1
// Day #6 of 100 Days_Of_code

class Solution {
    public void segregateElements(int arr[], int n) {
        // Initialize two ArrayLists to store positive and non-positive elements.
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        
        // Iterate through the input array to segregate elements.
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                // If the element is positive, add it to arr1.
                arr1.add(arr[i]);
            } else {
                // If the element is non-positive, add it to arr2.
                arr2.add(arr[i]);
            }
        }
        
        // Create a new ArrayList to merge arr1 and arr2.
        ArrayList<Integer> arrf = new ArrayList<Integer>();
        
        // Add all elements from arr1 and arr2 to arrf.
        arrf.addAll(arr1);
        arrf.addAll(arr2);
        
        // Update the original array arr with elements from arrf.
        for (int i = 0; i < n; i++) {
            arr[i] = arrf.get(i);
        }
    }
}

//Time Complexity : O(n)
//Space Complexity : O(n)
