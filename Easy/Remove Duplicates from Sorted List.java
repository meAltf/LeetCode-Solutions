/*************************************************************************************************************

-----------------
QUESTION N0- 83
----------------

Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

-----------------------------------

Example 1:
Input: head = [1,1,2]
Output: [1,2]

Example 2:
Input: head = [1,1,2,3,3]
Output: [1,2,3]

-----------------------------------

**************************************************************************************************************/

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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
	        return head;
	    }
	    
	    ListNode temp1 = head;
	    ListNode temp2 = head.next;
	   
	    
	    while(temp2!=null){
	        
	        if(temp1.val == temp2.val){
	            
	            temp2 = temp2.next;
	            temp1.next=temp2;
	            
	        } else{
	            
	            temp1 = temp2;
	            temp2 = temp2.next;
	        }
	    }
        
	    return head;
    }
}
