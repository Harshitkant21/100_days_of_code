// Platform Leetcode https://leetcode.com/problems/reverse-linked-list-ii/?envType=study-plan-v2&envId=top-interview-150
// Day #37 of 100 Days_Of_code

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // Create a dummy node to simplify handling edge cases.
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy; // Initialize prev pointer on the dummy node.

        // Move the prev pointer to the node just before the left boundary.
        for (int i = 0; i < left - 1; i++)
            prev = prev.next; // Adjusting the prev pointer to its actual index.

        ListNode curr = prev.next; // Current pointer will be just after prev.

        // Reverse the sublist between left and right boundaries.
        for (int i = 0; i < right - left; i++) {
            ListNode forw = curr.next; // Forward pointer will be after curr.
            curr.next = forw.next;
            forw.next = prev.next;
            prev.next = forw;
        }
        return dummy.next; // Return the modified linked list.
    }
}

// Time Complexity: O(right)
// Space Complexity: O(1)
