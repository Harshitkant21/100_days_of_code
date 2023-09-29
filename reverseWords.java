// Platform Leetcode https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&envId=top-interview-150
// Day #25 of 100 Days_Of_code

class Solution {
    public String reverseWords(String s) {
        // Step 1: Split the input string into an array of words,
        // removing leading and trailing spaces and handling multiple spaces between words.
        String[] words = s.trim().split("\\s+");
        
        // Step 2: Reverse the order of words in the 'words' array.
        int last = words.length - 1;
        for (int first = 0; first < last; first++, last--) {
            String temp = words[first];
            words[first] = words[last];
            words[last] = temp;
        }
        
        // Step 3: Join the reversed words with a single space and return the result.
        return String.join(" ", words);
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)
