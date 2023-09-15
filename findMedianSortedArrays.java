// Platform LeetCode https://leetcode.com/problems/median-of-two-sorted-arrays/description/
// Day #12 of 100 Days_Of_code

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Calculate the total length of the combined array
        int n = nums1.length + nums2.length;
        
        // Create a new array to merge both input arrays
        int[] res = new int[n];
        
        // Copy elements from nums1 to res
        for (int i = 0; i < nums1.length; i++) {
            res[i] = nums1[i];
        }
        
        // Copy elements from nums2 to res, starting from where nums1 ends
        for (int i = 0; i < nums2.length; i++) {
            res[nums1.length + i] = nums2[i];
        }
        
        // Sort the merged array
        Arrays.sort(res);
        
        // Calculate the median
        int x = n % 2; // Check if the total number of elements is odd or even
        int s = 0;
        int e = res.length - 1;
        int mid = s + (e - s) / 2; // Calculate the middle index
        double ans;
        
        if (x != 0) {
            // If the total number of elements is odd, return the middle element as the median
            ans = res[mid];
        } else {
            // If the total number of elements is even, calculate the average of the two middle elements
            int ab = (res.length) / 2;
            int st = ab - 1;
            int ed = ab;
            ans = (res[st] + res[ed]) / 2.0;
        }
        
        return ans;
    }
}

// Time Complexity : O((m + n) log(m + n))
// Space Complexity : O(m + n)

