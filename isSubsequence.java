// Platform Leetcode https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=top-interview-150
// Day #26 of 100 Days_Of_code

class Solution {
    // Function to check if string s is a subsequence of string t
    public boolean isSubsequence(String s, String t) {
        int i = 0;  // Pointer for string s
        int j = 0;  // Pointer for string t

        // Check if the length of s is greater than the length of t
        if (s.length() > t.length()) {
            return false;  // s cannot be a subsequence of t
        } else {
            while (i < s.length() && j < t.length()) {
                // If characters at the current positions match, move i forward
                if (s.charAt(i) == t.charAt(j)) {
                    i++;
                }
                j++;  // Always move j forward
            }
        }

        // If i reaches the end of s, s is a subsequence of t
        return i == s.length();
    }
}

// Time Complexity : O(m+n)
// Space Complexity : O(1)
