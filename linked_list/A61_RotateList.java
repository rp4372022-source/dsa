package linked_list;

// with two pointers

public class A61_RotateList {
    // public ListNode rotateRight(ListNode head, int k) {
    //     if(head == null || head.next == null) return head;

    //     ListNode t = head;
        
    //     int size  = 0;
    //     while(t != null){
    //         size++;
    //         t = t.next;
    //     }
    //     t = head;
    //     ListNode p = new ListNode(-1);
    //     p.next = t;
        
    //     int c = 0;
    //     while(c < k % size){
    //         while(t.next != null){
    //             p = t;
    //             t = t.next;
    //         }
    //         t.next = head;
    //         p.next = null;
    //         head = t;
    //         c++;
    //     }

    //     return head;
    // }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;

        ListNode t = head;
        int size  = 1;
        while(t.next != null){
            size++;
            t = t.next;
        }
        
        ListNode t1 = head;
        
        k = k%size;

        for(int i=0;i< size - k - 1;i++){
            t1 = t1.next;
        }
        
        t.next = head;
        head = t1.next;
        t1.next = null;
        
        return head;
    }
}
