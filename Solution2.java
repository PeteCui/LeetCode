import java.util.Objects;

public class Solution2 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode nullNode = new ListNode();
        addTwoNumbers(l1, l2, nullNode, false);
        return nullNode.next;
    }

    public void addTwoNumbers(ListNode a, ListNode b, ListNode curr, boolean flag) {
        //judge if two list is null
        if(Objects.isNull(a) && Objects.isNull(b)){
            //if flag is true we should create a new node to store 1
            if(flag)curr.next = new ListNode(1);
            //then return
            return;
        }

        //if flag is true val = 1, else val = 0
        int val = flag? 1:0;
        if(!Objects.isNull(a))val += a.val;
        if(!Objects.isNull(b))val += b.val;

        //store new value into a new node and connect to current node
        ListNode next = new ListNode(val%10);
        curr.next = next;

        addTwoNumbers(Objects.isNull(a)? null: a.next, 
                      Objects.isNull(b)? null: b.next, 
                      next, 
                      val/10 != 0);


   }
}
