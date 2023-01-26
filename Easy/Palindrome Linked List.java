/***************************************************************************************************************************

------------------
QUESTION NO-234
------------------

------------------------------------------------------------------------------------
Given the head of a singly linked list, return true if it is a 
palindrome or false otherwise.

 

Example 1:
Input: head = [1,2,2,1]
Output: true

Example 2:
Input: head = [1,2]
Output: false

-----------------------------------------------------------------------------------------

****************************************************************************************************************************/

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
    public boolean isPalindrome(ListNode head) {

        ListNode temp = head;
        ArrayList result = new ArrayList ();

        while(temp != null){
            result.add(temp.val);
            temp = temp.next;
        }

        int start = 0;
        int end = result.size()-1;
        while(start < end){
            
            if(result.get(start) != result.get(end)){
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }
}
