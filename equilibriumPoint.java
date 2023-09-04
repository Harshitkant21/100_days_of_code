// Platform GFG https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1?page=1&sprint=a663236c31453b969852f9ea22507634&sortBy=submissions
// Day #1 of 100 Days_Of_code

class Solution {
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        long total=0;
        long left=0;
        for(int i=0;i<n;i++){
            total+=arr[i];
        }
        long right=total;
        for(int i=0;i<n;i++){
            right-=arr[i];
            if(left==right){
                return i+1;
            }
            left+=arr[i];
        }
        return -1;
        
    }
}

//Time Complexity O(n)
//Space Complexity O(1)
