package algo;

import algo.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListReverseTest {
    @Test
    public void testBasic() {
        ListNode inputList = createList(new int[] {1, 2, 3, 4, 5});

        LinkedListReverse linkedListReverse = new LinkedListReverse();
        ListNode outputList = linkedListReverse.reverse(inputList);

        assertEquals(5, outputList.val);
    }

    @Test
    public void testEmptyList() {
        ListNode inputList = createList(new int[] {});

        LinkedListReverse linkedListReverse = new LinkedListReverse();
        ListNode outputList = linkedListReverse.reverse(inputList);

        assertNull(outputList);
    }

    // helper method to create LinkedList from an array of integers
    private ListNode createList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        ListNode head = new ListNode(arr[0]);
        ListNode p = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode newNode = new ListNode(arr[i]);
            p.next = newNode;
            p = p.next;
        }

        return head;
    }


}