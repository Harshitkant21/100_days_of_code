// Platform Leetcode https://leetcode.com/problems/word-pattern/?envType=study-plan-v2&envId=top-interview-150
// Day #34 of 100 Days_Of_code

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Split the input string 's' into an array of words using whitespace as the delimiter.
        String[] str = s.split("\\s");
        
        // Check if the lengths of 'str' and 'pattern' are not equal, return false if not.
        if (str.length != pattern.length()) {
            return false;
        }
        
        // Create a HashMap 'res' to store character-to-index and word-to-index mappings.
        Map<Character, Integer> charToIndex = new HashMap<>();
        Map<String, Integer> wordToIndex = new HashMap<>();
        
        for (int i = 0; i < str.length; i++) {
            char currentChar = pattern.charAt(i); // Get the current character from 'pattern'.
            String currentWord = str[i]; // Get the current word from 'str'.
            
            // Check if the previously stored index for the character and word are different.
            // If they are different, return false, as the pattern is not consistent.
            if (!Objects.equals(charToIndex.put(currentChar, i), wordToIndex.put(currentWord, i))) {
                return false;
            }
        }
        
        // If the loop completes without any mismatches, return true, indicating the pattern is consistent.
        return true;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)
