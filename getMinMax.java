// Platform GFG https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1
// Day #4 of 100 Days_Of_code

class Compute 
{
    // This function finds the minimum and maximum elements in an array of long integers.
    static Pair getMinMax(long a[], long n)  
    {
        // Initialize min and max with the first element of the array.
        long min = a[0];
        long max = a[0];
        
        // Iterate through the array to find the minimum and maximum values.
        for (int i = 0; i < n; i++) {
            // Update 'min' to the smaller of the current element and 'min'.
            min = Math.min(a[i], min);
            
            // Update 'max' to the larger of the current element and 'max'.
            max = Math.max(a[i], max);
        }
        
        // Create a Pair object to store the found minimum and maximum values, then return it.
        return new Pair(min, max);
    }
}


// Time Complexity : O(n)
// Space Complexity : O(1)
