// Platform GFG https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
// Day #18 of 100 Days_Of_code

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // Initialize a HashSet to track visited elements
        HashSet<Long> res = new HashSet<Long>();

        // Initialize an array to store the result (duplicate and missing elements)
        int[] result = new int[2];

        // Initialize variables for sum, duplicate, and expectedSum
        int sum = 0;
        int duplicate = 0;

        // Iterate through the input array
        for (int i = 0; i < arr.length; i++) {
            // Calculate the index based on the absolute value of the current element
            int index = Math.abs(arr[i]) - 1;

            // Check if the element at the calculated index is already marked as negative
            if (arr[index] < 0) {
                // If yes, it's the duplicate element
                duplicate = Math.abs(arr[i]);
            } else {
                // Otherwise, mark the element at the calculated index as negative
                arr[index] = -arr[index];
            }

            // Calculate the sum of absolute values of elements in the array
            sum += Math.abs(arr[i]);
        }

        // Calculate the expected sum of numbers from 1 to n
        long expectedSum = (n * (n + 1L)) / 2L;

        // Calculate the missing element by subtracting the sum and the duplicate from the expected sum
        long missing = expectedSum - (sum - duplicate);

        // Store the duplicate and missing elements in the result array
        result[0] = duplicate;
        result[1] = (int) missing;

        // Return the result array containing the duplicate and missing elements
        return result;
    }
}

// Time Complexity : O(N)
// Space Complexity : O(1)
