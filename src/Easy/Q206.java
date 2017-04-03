package Easy;

/**
 * Created by Srikiran Sistla on 3/20/2017.
 */
public class Q206 {
    public ListNode reverseList(ListNode head) {
        return reverseLinkedList(head, null);
    }

    private ListNode reverseLinkedList(ListNode head, ListNode newHead) {
        if (head == null) return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return reverseLinkedList(next, head);
    }
}
