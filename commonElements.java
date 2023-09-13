// Platform GFG https://practice.geeksforgeeks.org/problems/common-elements1132/1
// Day #10 of 100 Days_Of_code

class Solution {
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        // Create a LinkedHashSet to store unique common elements.
        LinkedHashSet<Integer> res = new LinkedHashSet<Integer>();
        
        // Initialize three pointers for each input array.
        int i = 0; // Pointer for array A
        int j = 0; // Pointer for array B
        int z = 0; // Pointer for array C
        
        // Iterate through the arrays while there are elements left in each array.
        while (i < n1 && j < n2 && z < n3) {
            // If all three elements at the current pointers are equal,
            // it's a common element. Add it to the result set and
            // increment all three pointers.
            if (A[i] == B[j] && A[i] == C[z] && B[j] == C[z]) {
                res.add(A[i]);
                i++;
                j++;
                z++;
            } else if (A[i] < B[j]) {
                // If A[i] is smaller than B[j], increment the pointer for A.
                i++;
            } else if (B[j] < C[z]) {
                // If B[j] is smaller than C[z], increment the pointer for B.
                j++;
            } else {
                // If C[z] is smaller than both A[i] and B[j],
                // increment the pointer for C.
                z++;
            }
        }
        
        // Convert the LinkedHashSet to an ArrayList and return the result.
        return new ArrayList<>(res);
    }
}

// Time Complexity :  O(n1 + n2 + n3) 
// Space Complexity :  O(k) where k is number of unique elements
