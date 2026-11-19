package linked_list;

public class A83_RemoveDuplicatesFromSortedList {
    // 2 pts slow and fast, if slow == fast go, else point slow.next = fast until fast == null then make slow null cuz ahead just duplicate
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null){
            if(fast.val == slow.val) {
                fast = fast.next;
                if(fast == null) break;
            }
            else {
                slow.next = fast;
                slow = slow.next;
            }
        }

        slow.next = null;

        return head;
    }
}
