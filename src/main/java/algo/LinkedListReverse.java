package algo;

import algo.common.ListNode;

public class LinkedListReverse {
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode p = head;
        ListNode q = head.next;
        while (q != null) {
            ListNode temp = q.next;

            q.next = p;
            p = q;
            q = temp;
        }

        return p;
    }
}
