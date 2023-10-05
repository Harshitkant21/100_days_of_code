// Platform Leetcode https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=study-plan-v2&envId=top-interview-150
// Day #31 of 100 Days_Of_code

class Solution {
    public int strStr(String haystack, String needle) {
        // Check if the 'needle' is an empty string.
        if (needle.length() == 0) {
            // If 'needle' is empty, return 0 since it's found at the beginning of any string.
            return 0;
        }
        
        // Check if 'needle' is longer than 'haystack'.
        if (needle.length() > haystack.length()) {
            // If 'needle' is longer, it can't be found in 'haystack', so return -1.
            return -1;
        }
        
        // Iterate through 'haystack' to find 'needle'.
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Extract a substring from 'haystack' of the same length as 'needle' starting at index 'i'.
            String subStr = haystack.substring(i, i + needle.length());
            
            // Check if the extracted substring matches 'needle'.
            if (subStr.equals(needle)) {
                // If it matches, return the index 'i' where 'needle' is found in 'haystack'.
                return i;
            }
        }
        
        // If 'needle' is not found in 'haystack', return -1.
        return -1;
    }
}

// Time Complexity : O(n*m)
// Space Complexity : O(n*m)
