// Platform GFG https://practice.geeksforgeeks.org/problems/reverse-a-string/1
// Day #3 of 100 Days_Of_code

class Reverse {
    // Complete the function
    // str: input string
    public static String reverseWord(String str) {
        // Convert the input string to a character array
        char[] arr = str.toCharArray();
        
        // Initialize two pointers, 's' pointing to the start of the array, and 'e' pointing to the end
        int s = 0;
        int e = arr.length - 1;

        // Swap characters at 's' and 'e' positions while moving towards the center
        while (s < e) {
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

        // Convert the character array back to a string and return it
        return new String(arr);
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
