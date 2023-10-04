// Platform Leetcode https://leetcode.com/problems/remove-nth-node-from-end-of-list/?envType=study-plan-v2&envId=top-interview-150
// Day #30 of 100 Days_Of_code

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Step 1: Calculate the size of the linked list
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        
        // Step 2: Check if size is smaller than n, return the original list
        if (size < n) {
            return head;
        }
        
        // Step 3: Calculate the position of the node to be removed from the beginning
        int pos = size - n;
        
        // Step 4: Special case - removing the head node
        if (pos == 0) {
            return head.next;
        }
        
        // Step 5: Traverse the list again to find the node before the one to be removed
        curr = head;
        for (int i = 0; i < pos - 1; i++) {
            curr = curr.next;
        }
        
        // Step 6: Remove the nth node from the end
        curr.next = curr.next.next;
        
        // Step 7: Return the modified linked list
        return head;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
