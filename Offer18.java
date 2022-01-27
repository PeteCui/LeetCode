/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Offer18 {
    public ListNode deleteNode(ListNode head, int val) {
        //to make it better understand 
        if(head.val == val){
            return head.next;
        }

        // null->head->ndoe1->node2->node3
        ListNode previous_curr = null;
        ListNode curr = head;
        //to traverse the whole list
        while(curr.val != val){

            //update previous_curr point
            previous_curr = curr;
            //update curr point
            curr = curr.next;
        }

        previous_curr.next = curr.next;

        return head;


    }
}
