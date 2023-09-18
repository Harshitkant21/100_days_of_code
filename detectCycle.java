// Platform Leetcode https://leetcode.com/problems/linked-list-cycle-ii/
// Day #15 of 100 Days_Of_code

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// Using low and fast pointer approach
public class Solution {
    public ListNode detectCycle(ListNode head) {
      ListNode slow = head;
      ListNode fast = head;
      while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast)break;
      }
      if(fast==null || fast.next==null)return null;
      while(head!=slow){
        head=head.next;
        slow=slow.next;
      }
      return head;
    }
}

// Time complexity : O(n)
// Space complexity : O(1)
