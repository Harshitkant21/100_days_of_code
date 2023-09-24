// Platform GFG https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1
// Day #20 of 100 Days_Of_code

class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        // Initialize two pointers, slow and fast, both starting at the head of the list.
        Node slow = head;
        Node fast = head;
        
        // Phase 1: Detect the loop using the "tortoise and hare" approach.
        while (fast != null && fast.next != null) {
            slow = slow.next;      // Move slow one step at a time.
            fast = fast.next.next; // Move fast two steps at a time.
            if (slow == fast) {
                // Loop detected, break out of the loop.
                break;
            }
        }
        
        // If there's no loop, return as there's nothing to remove.
        if (slow != fast) {
            return;
        }
        
        // Phase 2: Reset the slow pointer to the head and find the starting node of the loop.
        slow = head;
        while (slow != fast) {
            slow = slow.next; // Move both pointers one step at a time until they meet.
            fast = fast.next;
        }
        
        // Phase 3: Find the node just before the loop and break the loop.
        while (fast.next != slow) {
            fast = fast.next;
        }
        fast.next = null; // Set the next of the last node to null to remove the loop.
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
