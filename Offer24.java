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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode new_head = head;
        ListNode curr = head.next;
        //head -> null
        //head_next1 -> head_next2 -> null
        head.next = null;
        while (curr != null){
            //keep connection to the next next
            ListNode curr_next = curr.next;
            //change the next node point to head;
            //head_next1 -> head - > null
            curr.next = new_head;
            //update head, always point to first element in the list
            new_head = curr;

            curr = curr_next;
        }

        return new_head;
    }
}