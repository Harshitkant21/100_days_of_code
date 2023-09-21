// Platform GFG https://practice.geeksforgeeks.org/problems/set-bits0143/1
// Day #17 of 100 Days_Of_code

// I approached this subject using two distinct methods. The first method included using bitwise operators, while the second method involved converting a number to a binary string and afterwards counting the amount of set bits.

// 1: Using bitwise operators

class Solution {
    // Function to count the number of set bits (1s) in the binary representation of N
    static int setBits(int N) {
        // Initialize a variable to keep track of the count of set bits
        int count = 0;
        
        // Iterate through the bits of N until N becomes zero
        while (N > 0) {
            // Check the least significant bit (LSB) of N using a bitwise AND operation with 1
            // If the LSB is 1, increment the count
            count += (N & 1);
            
            // Right shift N by 1 to move to the next bit
            N >>= 1;
        }
        
        // Return the count of set bits
        return count;
    }
}

// Time Complexity : O(log n)
// Space Complexity : O(1)

// 2: Using toBinaryString method
// User function Template for Java
class Solution {
    // Function to count the number of set bits (1s) in the binary representation of N
    static int setBits(int N) {
        // Convert the integer N to its binary string representation
        String res = Integer.toBinaryString(N);
        
        // Initialize a variable to keep track of the count of set bits
        int count = 0;
        
        // Convert the binary string to a character array
        char[] arr = res.toCharArray();
        
        // Iterate through the characters in the array
        for (char i : arr) {
            // Check if the character is '1', indicating a set bit
            if (i == '1') {
                // Increment the count for each set bit found
                count++;
            }
        }
        
        // Return the count of set bits
        return count;
    }
}

// Time Complexity : O(log n)
// Space Complexity : O(log n)
