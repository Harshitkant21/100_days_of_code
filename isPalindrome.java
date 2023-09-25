// Platform GFG https://practice.geeksforgeeks.org/problems/palindrome-string0817/1
// Day #21 of 100 Days_Of_code

class Solution {
    // This function checks if a given string is a palindrome.
    int isPalindrome(String S) {
        // Initialize two pointers, 'left' and 'right', pointing to the start and end of the string.
        int left = 0;
        int right = S.length() - 1;

        // Continue checking characters from both ends until 'left' is less than 'right'.
        while (left < right) {
            // Compare the characters at the 'left' and 'right' pointers.
            if (S.charAt(left) != S.charAt(right)) {
                return 0; // If they are not equal, the string is not a palindrome, so return 0.
            }

            // Move the 'left' pointer to the right and the 'right' pointer to the left for the next comparison.
            left++;
            right--;
        }

        // If we reach this point, all character comparisons were equal, so the string is a palindrome, return 1.
        return 1;
    }
};

// Time Complexity : O(n)
// Space Complexity : O(1)
