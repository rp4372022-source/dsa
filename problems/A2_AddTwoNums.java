class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class A2_AddTwoNums {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = l1;
        ListNode prev = null;
        boolean isCarry = false;
        while(l1 != null  || l2!= null || isCarry){
            //if l1 left with nothing but l2 still has elements, carry them
            if(l1 == null){
                l1 = new ListNode(0);
                prev.next = l1; // when we create brand new node it disconnect from list
                // we need to link it thats why the prev pointer is needed to link back
            }

            // take value and update l1
            int v1 = l1.val;
            int v2 = (l2 != null) ? l2.val : 0;

            int res = (isCarry) ? v1+v2+1 : v1+v2;
            if(res > 9){
                isCarry = true;
                res = res%10;
            } else isCarry = false;

            l1.val = res;
            
            //update pointers
            prev = l1;
            l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if(isCarry) l1 = new ListNode(1);
        return head;
    }
}
