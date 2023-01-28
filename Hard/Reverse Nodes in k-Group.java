/*******************************************************************************************************************************************

--------------------
QUESTION NO- 25
--------------------

Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, 
in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.

--------------------------------------------------------------------------------------------------

Example 1:

Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]

Example 2:

Input: head = [1,2,3,4,5], k = 3
Output: [3,2,1,4,5]

---------------------------------------------------------------------------------------------------

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

    private static void reverse(ListNode start, ListNode end){

            ListNode prev = null;
            ListNode curr = start;
            ListNode next = start.next;

            while(prev != end){
                curr.next = prev;
                prev= curr;
                curr = next;
                if(next != null) next = next.next;
            }
        }


    public ListNode reverseKGroup(ListNode head, int k) {

        while(head == null || head.next == null || k==1){
            return head;
        }

        ListNode start = head;
        ListNode end = head;

        int count = k-1;
        // find last node in the first group of k
        while(count-- !=0){
            end = end.next;
            if(end == null) return head;
        }

        ListNode smallReversedKGroup = reverseKGroup(end.next, k);
        reverse(start, end);
        //finall stage 
        start.next = smallReversedKGroup;
        return end;
        
    }
}
