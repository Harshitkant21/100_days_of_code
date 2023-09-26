// Platform Leetcode https://leetcode.com/problems/reverse-vowels-of-a-string/
// Day #22 of 100 Days_Of_code

class Solution {
  public String reverseVowels(String s) {
    int start = 0; // Initialize a pointer at the beginning of the string
    int last = s.length() - 1; // Initialize a pointer at the end of the string
    char[] res = s.toCharArray(); // Convert the input string to a character array for easy modification

    // Continue swapping vowels until the two pointers meet or cross each other
    while (start < last) {
      if (isVowel(res[start]) && isVowel(res[last])) { // Check if both characters at the pointers are vowels
        char temp = res[start]; // Swap the vowels by using a temporary variable
        res[start] = res[last];
        res[last] = temp;
        start++; // Move the first pointer towards the end of the string
        last--; // Move the second pointer towards the beginning of the string
      } else { // If one or both characters at the pointers are not vowels
        if (!isVowel(res[start])) {
          start++; // Move the first pointer if the character at that position is not a vowel
        }
        if (!isVowel(res[last])) {
          last--; // Move the second pointer if the character at that position is not a vowel
        }
      }
    }

    return new String(res); // Convert the character array back to a string and return the result
  }

  // Helper method to check if a character is a vowel
  private boolean isVowel(char c) {
    c = Character.toLowerCase(c); // Convert to lowercase for case insensitivity
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
  }
}

// Time Complexity : O(n)
// Space Complexity : O(n)
