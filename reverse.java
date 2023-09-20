// Platform GFG https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1
// Day #16 of 100 Days_Of_code

import java.util.Stack;

class Solution {
    
    public String reverse(String S){
        // Create a stack to store characters.
        Stack<Character> mystack = new Stack<Character>();
        
        // Convert the input string to a character array.
        char[] s = S.toCharArray();
        
        // Push each character onto the stack.
        for(char i:s){
            mystack.push(i);
        }
        
        // Create a StringBuilder to store the reversed string.
        StringBuilder res = new StringBuilder();
        
        // Pop characters from the stack and append to the result.
        while(!mystack.isEmpty()){
            res.append(mystack.pop());
        }
        
        // Convert the StringBuilder to a string and return the result.
        return res.toString();
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)
