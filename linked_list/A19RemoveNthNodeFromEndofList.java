package linked_list;

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class A19RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        int size = 0;
        ListNode head1 = node;
        // ListNode node1 = head1;
        while (node != null) {
            // node1.next = node;
            node = node.next;
            size += 1;
        }
        if (size == 1 && n == 1)
            return null;
        if (size == n)
            return head1.next;
        node = head1;
        int curr = 0;
        while (curr < size - n - 1) {
            node = node.next;
            curr++;
        }
        if (node.next != null)
            node.next = node.next.next;
        else
            node.next = null;
        return head1;
    }
}
