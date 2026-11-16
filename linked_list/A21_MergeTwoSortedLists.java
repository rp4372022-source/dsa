package linked_list;

public class A21_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode dummy = new ListNode(-1);
        dummy.next = list1;

        ListNode n1 = list1;
        ListNode n2 = list2;

        ListNode pn1 = dummy;

        while(n1 != null & n2 != null){
            if(n1.val < n2.val){
                pn1 = n1;
                n1 = n1.next;
            } else {
                ListNode nn = n2;
                n2 = n2.next;
                nn.next = n1;
                pn1.next = nn;
                pn1 = pn1.next;
            }
        }

        if(n1 == null){
            pn1.next = n2;
        }

        return dummy.next;
    }
}
