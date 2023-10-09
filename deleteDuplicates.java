// Platform Leetcode https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/?envType=study-plan-v2&envId=top-interview-150
// Day #35 of 100 Days_Of_code


class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Create a dummy node to simplify list manipulation
        ListNode res = new ListNode();
        res.next = head;
        ListNode temp = res;
        
        // Check if the list is empty or has only one node
        if (head == null || head.next == null)
            return head;
        
        while (temp.next != null && temp.next.next != null) {
            if (temp.next.val == temp.next.next.val) {
                int value = temp.next.val;
                // Remove all nodes with the same value
                while (temp.next != null && temp.next.val == value) {
                    temp.next = temp.next.next;
                }
            } else {
                temp = temp.next;
            }
        }
        
        return res.next; // Return the list without the dummy node
    }
}


// Time Complexity: O(n)
// Space Complexity: O(1)
