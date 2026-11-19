package linked_list;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class A206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        if(head.next.next == null){
            
        }
        ListNode l = head;
        head = head.next; //middle
        ListNode f = head.next;

        l.next = null;

        while(f != null){
            head.next = l;
            l = head;
            head = f;
            f = f.next;
        }
        // last pointing
        head.next = l;

        return head;
    }
}
