// Platform Leetcode https://leetcode.com/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/description/?envType=daily-question&envId=2023-10-02
// Day #28 of 100 Days_Of_code


class Solution {
    // Method to determine the winner of a game based on the given color sequence
    public boolean winnerOfGame(String color) {
        // Get the length of the color sequence
        int n = color.length();
        
        // Initialize counters for players A and B
        int a = 0;
        int b = 0;
        
        // Convert the input string to a character array for easier access
        char[] colors = color.toCharArray();
        
        // Iterate through the color sequence starting from the second element
        for (int i = 1; i < n - 1; i++) {
            // Check if three consecutive colors are the same
            if (colors[i - 1] == colors[i] && colors[i] == colors[i + 1]) {
                // If the color is 'A', increment player A's score
                if (colors[i] == 'A') {
                    a++;
                }
                // If the color is 'B', increment player B's score
                else if (colors[i] == 'B') {
                    b++;
                }
            }
        }
        
        // Determine the winner based on the scores
        // Return true if player A has more consecutive colors, otherwise return false
        return a > b;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
