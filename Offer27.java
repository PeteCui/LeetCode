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
class Offer27 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while(head!= null){
            list.add(head.val);
            head = head.next;
        }


        int left = 0;
        int right = list.size() - 1;
        while(left < right){

            if(list.get(left) != list.get(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


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
    //this is a gloabl variable
    private ListNode frontPointer;
    
    private boolean recursivelyCheck(ListNode currentNode){
        if(currentNode != null){
            //if one of the comparison is illegal, quickly return false 
            if(recursivelyCheck(currentNode.next) != true){
                return false;
            }
            //if true == true
            //comparison
            if(frontPointer.val != currentNode.val){
                return false;
            }
            //update the glabal variable
            frontPointer = frontPointer.next;

        }
        return true;
    }
    
    public boolean isPalindrome(ListNode head) {
        frontPointer = head;
        return recursivelyCheck(head);
    }    
}